package com.moka.monitoring.common.presentation.exception.client;

/**
 * 잘못된 ID 값 예외
 *  - ID 값이 null 이거나 0 이하인 경우 발생
 * */
public class InvalidIdValueException extends InputValueNotValidException{
	public InvalidIdValueException(String entityName) {
		super(entityName + " ID는 0보다 큰 값이어야 합니다.");
	}
}
