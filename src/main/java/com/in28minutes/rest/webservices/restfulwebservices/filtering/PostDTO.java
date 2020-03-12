package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("noOfLikes")
@JsonFilter("filter1")
public class PostDTO {
	@JsonIgnore
	private int postId;
	private String messages;
	private int noOfLikes;
	private List<String> noOfReplies;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public List<String> getNoOfReplies() {
		return noOfReplies;
	}

	public void setNoOfReplies(List<String> noOfReplies) {
		this.noOfReplies = noOfReplies;
	}

	public PostDTO(int postId, String messages, int noOfLikes, List<String> noOfReplies) {
		super();
		this.postId = postId;
		this.messages = messages;
		this.noOfLikes = noOfLikes;
		this.noOfReplies = noOfReplies;
	}

}
