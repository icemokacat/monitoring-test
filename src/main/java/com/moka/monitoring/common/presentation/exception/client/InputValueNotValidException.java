package com.moka.monitoring.common.presentation.exception.client;

/**
 * 요청값 (path variable, request param, request body 등) 이 유효하지 않은 경우 발생하는 예외
 * */
public class InputValueNotValidException extends RuntimeException{
	public InputValueNotValidException(String message) {
		super(message);
	}
}
