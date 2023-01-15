package br.com.enay.zuin.spring.jpa.filter.usage.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.enay.zuin.spring.jpa.filter.filter.query.Query;
import br.com.enay.zuin.spring.jpa.filter.responses.dto.ResponseDTO;
import br.com.enay.zuin.spring.jpa.filter.service.impl.ZuinFilterImpl;
import br.com.enay.zuin.spring.jpa.filter.usage.example.entity.HospitalEntity;

@RestController
public class FilterController {

	@Autowired
	private ZuinFilterImpl<HospitalEntity> zuinFilter;

	@PostMapping(path = "/filter")
	public ResponseEntity<?> filter(@RequestBody Query query) throws Exception {
		ResponseDTO<HospitalEntity> response = zuinFilter.filter(query);
		return ResponseEntity.ok(response);
	}

}
