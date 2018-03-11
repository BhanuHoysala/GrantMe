package com.abcc.framework.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Error {

	public Error(String path, String message, String code) {
		this.path = path;
		this.message = message;
		this.code = code;
	}

	public Error(String path, String message, String code, Object requestParam) {
		this.path = path;
		this.message = message;
		this.code = code;
		this.requestParam = requestParam;
	}

	public Error() {};

	private String path;
	private String message;
	private String code;
	@JsonInclude(Include.NON_NULL)
	private Object requestParam;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getRequestParam() {
		return requestParam;
	}

	public void setRequestParam(Object requestParam) {
		this.requestParam = requestParam;
	}

	@Override
	public String toString() {
		return "Error [path=" + path + ", message=" + message + ", code=" + code + ", requestParam=" + requestParam + "]";
	}
}
