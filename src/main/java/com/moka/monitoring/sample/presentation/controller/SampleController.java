package com.moka.monitoring.sample.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moka.monitoring.sample.application.dto.SampleDto;
import com.moka.monitoring.sample.application.port.in.SampleManagementUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class SampleController {

	private final SampleManagementUseCase sampleManagementUseCase;

	@GetMapping("/samples")
	public ResponseEntity<String> getSamples() {
		SampleDto sample = sampleManagementUseCase.getSampleById(1L);

		return ResponseEntity.ok("Sample data: " + sample);
	}

}
