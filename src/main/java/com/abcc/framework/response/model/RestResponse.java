package com.abcc.framework.response.model;

import java.io.Serializable;
import java.util.List;

public class RestResponse implements Serializable {

	private static final long serialVersionUID = -2621408946682183126L;

	private Object data;
	private List<Error> error;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<Error> getError() {
		return error;
	}

	public void setError(List<Error> error) {
		this.error = error;
	}

}
