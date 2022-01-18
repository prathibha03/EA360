package com.ea360.module.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea360.module.exception.ResourceNotFoundException;
import com.ea360.module.model.Module;
import com.ea360.module.repository.ModuleRepository;



@Service
public class ModuleService {
	
	@Autowired
	private ModuleRepository repository;
	
	  public Module getModule(String moduleName) {

		return repository.findByModuleName(moduleName).get();

	}

		public List<Module> getAllModules() {

			List<Module> list = repository.findAll();

			list.forEach(x -> System.out.println("element " + x));

			return repository.findAll();

		}

		public Module createModule(Module Module) {

			return repository.save(Module);

		}

		public Module updateModule(Module module) {

			return repository.save(module);

		}

		public void deleteModule(String moduleName){

			Optional<Module> module = repository.findByModuleName(moduleName);

			if (module.isPresent()) {

				repository.delete(module.get());

			} else {

				throw new ResourceNotFoundException("Record not found with Module Name : " + moduleName);
			}


}
}
