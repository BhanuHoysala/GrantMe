package com.abcc.packages.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class PackagePrivilegeMapVO {
	
	@Id
	Integer ppMapId;
	
	@NotNull
	Integer packageId;
	@NotNull
	Integer PrivilegeId;
	
}
