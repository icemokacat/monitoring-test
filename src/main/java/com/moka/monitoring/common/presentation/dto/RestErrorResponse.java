package com.moka.monitoring.common.presentation.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RestErrorResponse extends ResponseEntity<ErrorBody<?>> {

	public RestErrorResponse(HttpStatus status, String errorCode, String message) {
		super(ErrorBody.errorMessageBody(errorCode,message), status);
	}

	public RestErrorResponse(HttpStatus status, String message) {
		super(ErrorBody.errorMessageBody(message), status);
	}

	public RestErrorResponse(HttpStatus status) {
		super(ErrorBody.noContentError(), status);
	}

	public RestErrorResponse(ErrorBody<?> body, HttpStatus status) {
		super(body, status);
	}

}
