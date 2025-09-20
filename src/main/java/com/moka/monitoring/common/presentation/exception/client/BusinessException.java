package com.moka.monitoring.common.presentation.exception.client;

import lombok.Getter;
import lombok.NonNull;
import com.moka.monitoring.common.presentation.exception.model.AppErrorCode;

/**
 * BusinessException
 * 비즈니스 로직 수행 중 발생하는 예외
 **/
@Getter
public class BusinessException extends RuntimeException {

	private final AppErrorCode errorCode;

	public BusinessException(AppErrorCode errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public BusinessException(@NonNull AppErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public BusinessException(String message) {
		super(message);
		this.errorCode = null;
	}

	public BusinessException(AppErrorCode errorCode,String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
		this.errorCode = null;
	}

}
