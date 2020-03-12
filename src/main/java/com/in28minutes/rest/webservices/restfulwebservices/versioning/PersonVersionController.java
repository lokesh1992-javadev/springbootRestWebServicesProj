package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

	@GetMapping(path = "/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Hari Priya");
	}
	@GetMapping(path = "/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Hari", "Priya"));
	}
	
	@GetMapping(path = "/param/person", params="version=1")
	public PersonV1 getParamV1() {
		return new PersonV1("Hari Priya");
	}
	@GetMapping(path = "/param/person", params="version=2")
	public PersonV2 getParamV2() {
		return new PersonV2(new Name("Hari", "Priya"));
	}
	
	@GetMapping(path = "/param/person", headers="X-API-VERSION=1")
	public PersonV1 getHeaderV1() {
		return new PersonV1("Hari Priya");
	}
	@GetMapping(path = "/param/person", headers="X-API-VERSION=2")
	public PersonV2 getHeaderV2() {
		return new PersonV2(new Name("Hari", "Priya"));
	}
	
	@GetMapping(path = "/param/person", produces="application/lok.cg.spboot.app-v1+json")
	public PersonV1 getProducerV1() {
		return new PersonV1("Hari Priya");
	}
	@GetMapping(path = "/param/person", produces="application/lok.cg.spboot.app-v2+json")
	public PersonV2 getProducerV2() {
		return new PersonV2(new Name("Hari", "Priya"));
	}
}
