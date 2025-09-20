package com.moka.monitoring.sample.application.port.in;

import com.moka.monitoring.sample.application.dto.SampleDto;

public interface SampleManagementUseCase {
	SampleDto getSampleById(Long id);
}
