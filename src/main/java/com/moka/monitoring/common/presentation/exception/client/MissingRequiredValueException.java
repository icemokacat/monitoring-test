package com.moka.monitoring.common.presentation.exception.client;

/**
 * MissingRequiredValueException
 * Client 가 보내는 요청에 필수 값이 누락된 경우 발생하는 예외
 **/
public class MissingRequiredValueException extends RuntimeException {
	public MissingRequiredValueException(String message) {
		super(message);
	}
}
