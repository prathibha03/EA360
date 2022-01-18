package com.ea360.module.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ea360.module.model.Module;
import com.ea360.module.service.ModuleService;


@RestController
@RequestMapping
public class ModuleController {
	
	@Autowired
	private ModuleService service;

	@GetMapping("/modules/{moduleName}")
	public Module getModule(@PathVariable String moduleName) {

		return service.getModule(moduleName);

	}

	@GetMapping("/modules")
	public ResponseEntity<List<Module>> getAllModules() {

		return ResponseEntity.ok().body(service.getAllModules());

	}

	@PostMapping("/addmodule")
	public ResponseEntity<Module> createModule(@RequestBody Module module) {

		return ResponseEntity.ok().body(service.createModule(module));

	}

	@PutMapping("/updatemodule")
	public ResponseEntity<Module> updateModule(@RequestBody Module module) {

		return ResponseEntity.ok().body(service.updateModule(module));

	}

	@DeleteMapping("/modules/{moduleName}")
	public HttpStatus deleteModule(@PathVariable String moduleName) {
		
		service.deleteModule(moduleName);
		
		return HttpStatus.OK;

	}


}
