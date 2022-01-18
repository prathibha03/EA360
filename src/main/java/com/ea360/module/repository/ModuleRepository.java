package com.ea360.module.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ea360.module.model.Module;

public interface ModuleRepository extends  MongoRepository<Module, String>  {

	void deleteByModuleName(String moduleName);
	


	Optional<Module> findByModuleName(String moduleName);


}
