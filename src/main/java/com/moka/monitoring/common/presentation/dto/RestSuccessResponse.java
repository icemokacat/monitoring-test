package com.moka.monitoring.common.presentation.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Rest API 응답 객체
 * 200 혹은 201 응답 시 반환
 * */
public class RestSuccessResponse extends ResponseEntity<SuccessBody<?>> {

	public RestSuccessResponse(HttpStatus status) {
		super(SuccessBody.noContent(), status);
	}

	public RestSuccessResponse(HttpStatus status, SuccessBody<?> body) {
		super(body, status);
	}

	/**
	 * 200 응답 : 응답 데이터 없음
	 */
	public static RestSuccessResponse success() {
		return new RestSuccessResponse(HttpStatus.OK);
	}

	/**
	 * 200 응답 : 응답 데이터 있음
	 */
	public static RestSuccessResponse success(SuccessBody<?> body) {
		return new RestSuccessResponse(HttpStatus.OK, body);
	}

	/**
	 * 201 응답
	 */
	public static RestSuccessResponse created(SuccessBody<?> body) {
		return new RestSuccessResponse(HttpStatus.CREATED, body);
	}

}
