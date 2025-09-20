package com.moka.monitoring.common.presentation.exception.client;

/**
 * ResourceNotFoundException
 * 도메인(DB 등)의 리소스를 찾을 수 없을 때 발생하는 예외
 **/
public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String resource, long id) {
		super(resource + "에서 id " + id + "를 찾을 수 없습니다.");
	}
	public ResourceNotFoundException(String resource, String identifier) {
		super(resource + "에서 식별자 " + identifier + "를 찾을 수 없습니다.");
	}
}
