package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class PostResource {

	@GetMapping(value = "/post")
	public MappingJacksonValue getPost() {
		PostDTO postDTO = new PostDTO(1, "SOme Msg", 43, Arrays.asList("blah1", "blah2"));
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("noOfReplies");
		FilterProvider filterProvider=new SimpleFilterProvider().addFilter("filter1", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(postDTO);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
	}

	@GetMapping(value = "/posts")
	public MappingJacksonValue getAllPosts() {
		List<PostDTO> list = Arrays.asList(new PostDTO(1, "SOme Msg", 43, Arrays.asList("blah1", "blah2")),
				new PostDTO(2, "SOme Msg", 343, Arrays.asList("blah1", "blah2")));
		
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("messages");
		FilterProvider filterProvider=new SimpleFilterProvider().addFilter("filter1", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(list);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
	}
	
	@GetMapping(value = "/post-dynamic")
	public PostDTO getPostDynamic() {
		return new PostDTO(1, "SOme Msg", 43, Arrays.asList("blah1", "blah2"));
	}}
