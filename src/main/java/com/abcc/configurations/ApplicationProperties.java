package com.abcc.configurations;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ApplicationProperties {

	@NotBlank
	private String text;
	@NotNull
	private Integer number;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicationProperties [text=");
		builder.append(text);
		builder.append(", number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}

}
