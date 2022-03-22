package com.xmen.adapter.router.error.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseErrorMessageDTO {
	
	private String code;
	private String errorMessage;

}
