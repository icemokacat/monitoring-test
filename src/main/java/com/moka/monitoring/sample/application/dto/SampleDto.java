package com.moka.monitoring.sample.application.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SampleDto {
	private Long id;
	private String name;
	private String description;
}
