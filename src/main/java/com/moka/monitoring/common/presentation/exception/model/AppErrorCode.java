package com.moka.monitoring.common.presentation.exception.model;

import lombok.Getter;

/**
 * 추후 비즈니스룰과 엮어서 코드를 만들면 좋을 것 같다.
 * */
@Getter
public enum AppErrorCode {
	BOOK_CANNOT_DELETE("BOOK_CANNOT_DELETE", "대여중인 보유도서가 있어 삭제할 수 없습니다"),
	DUPLICATE_CATEGORY_IN_BOOK("DUPLICATE_CATEGORY_IN_BOOK", "이미 등록된 카테고리입니다"),
	DUPLICATE_CATEGORY_INPUT("DUPLICATE_CATEGORY_INPUT", "입력한 카테고리 ID에 중복이 있습니다"),
	IS_UNIQUE_CATEGORY_IN_BOOK("IS_UNIQUE_CATEGORY_IN_BOOK", "도서에 등록된 카테고리는 하나 이상이어야 합니다"),
	;

	private final String code;
	private final String message;

	AppErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
