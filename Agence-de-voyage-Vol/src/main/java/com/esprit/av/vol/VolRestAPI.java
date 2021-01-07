package com.esprit.av.vol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/vols")
public class VolRestAPI {
	
	private String title="Hello , I'm the vol Microservice";
	
    @Autowired
	private VolService volService;
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		
		return title;
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Vol> createVol(@RequestBody Vol vol) {
		return new ResponseEntity<>(volService.addVol(vol), HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Vol> updateCandidat(@PathVariable(value = "id") int id, @RequestBody Vol vol){
		return new ResponseEntity<>(volService.updateVol(id, vol), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteVol(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(volService.deleteVol(id), HttpStatus.OK);
	}

}
