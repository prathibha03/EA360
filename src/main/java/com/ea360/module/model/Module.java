package com.ea360.module.model;

import javax.persistence.Entity;

//import javax.persistence.Id;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@Document(collection = "ea360_modules")
public class Module {
	
	@Id
	private String id;
	
	@Field(name = "ProjectName")
	private String projectName;
	
	@Field(name = "ModuleName")
	private String moduleName;
	
	@Field(name = "ModuleOwner")
	private String moduleOwner;
	
	@Field(name = "ModuleStatus")
	private String moduleStatus;
	
	@Field(name = "ScrumMaster")
	private String scrumMaster;
	
	@Field(name = "CreateDate")
	private String createDate;
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleOwner() {
		return moduleOwner;
	}
	public void setModuleOwner(String moduleOwner) {
		this.moduleOwner = moduleOwner;
	}
	public String getModuleStatus() {
		return moduleStatus;
	}
	public void setModuleStatus(String moduleStatus) {
		this.moduleStatus = moduleStatus;
	}
	public String getScrumMaster() {
		return scrumMaster;
	}
	public void setScrumMaster(String scrumMaster) {
		this.scrumMaster = scrumMaster;
	}
	
	

}
