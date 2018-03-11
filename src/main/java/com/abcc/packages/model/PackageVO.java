package com.abcc.packages.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotEmpty;

public class PackageVO {

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	Integer packageId;
	@NotNull
	@NotEmpty
	String packageName;
	String description;
	@NotNull
	Integer pacakgeType;
	@CreationTimestamp
	Timestamp createdAt;
	Integer createdBy; 
	@UpdateTimestamp
	Timestamp updatedAt;
	Integer updatedBy;
	boolean deleted;
	Timestamp deletedAt;
	Integer deletedBy;
	
	@OneToMany
	Set<PackagePrivilegeMapVO> packagePrivielges;
	
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public Integer getPacakgeType() {
		return pacakgeType;
	}
	public void setPacakgeType(Integer pacakgeType) {
		this.pacakgeType = pacakgeType;
	}
	
}
