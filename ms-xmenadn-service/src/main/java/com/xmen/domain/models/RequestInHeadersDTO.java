package com.xmen.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestInHeadersDTO {

	@JsonProperty("timeStamp")
	@SerializedName("timeStamp")
	private String timeStamp;

	@JsonProperty("Content-Type")
	@SerializedName("Content-Type")
	private String contentType;

}
