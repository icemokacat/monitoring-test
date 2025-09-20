package com.moka.monitoring.common.presentation.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Rest API 응답 객체 중 body 부분
 * 200 혹은 201 응답 시 반환
 * */
@Data
@Builder
public class SuccessBody<T> {

	// resource (json)
	private T result;

	public static SuccessBody<String> noContent() {
		return SuccessBody.<String>builder()
				.build();
	}

	public static SuccessBody<?> includeContent(Object resultData) {
		return SuccessBody.builder()
				.result(resultData)
				.build();
	}
}
