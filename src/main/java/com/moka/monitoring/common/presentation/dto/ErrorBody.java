package com.moka.monitoring.common.presentation.dto;

import java.util.List;

import org.springframework.validation.FieldError;

import lombok.Builder;
import lombok.Data;

/*
 * Rest API 에러 발생 시 반환 객체 중 body 부분
 * */
@Data
@Builder
public class ErrorBody<T> {

	private String errorCode;
	private String message;
	private T errorResult;
	private List<FieldError> fieldErrors;

	public static ErrorBody<String> noContentError() {
		return ErrorBody.<String>builder()
				.build();
	}

	/**
	 * Status 와 message 로 ErrorBody 생성
	 * */
	public static ErrorBody<String> errorMessageBody(String message) {
		return ErrorBody.<String>builder()
				.message(message)
				.build();
	}

	/**
	 * ErrorCode 가 필요한 경우
	 * */
	public static ErrorBody<String> errorMessageBody(String errorCode, String message) {
		return ErrorBody.<String>builder()
				.errorCode(errorCode)
				.message(message)
				.build();
	}

}
