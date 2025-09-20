package com.moka.monitoring.sample.application.service;

import org.springframework.stereotype.Service;

import com.moka.monitoring.sample.application.dto.SampleDto;
import com.moka.monitoring.sample.application.port.in.SampleManagementUseCase;

import brave.Span;
import brave.Tracer;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@RequiredArgsConstructor
@Service
public class SampleManagementService implements SampleManagementUseCase {

	private final Tracer tracer;

	@Override
	public SampleDto getSampleById(Long id) {
		Span span = tracer.nextSpan()
			.name("getSampleById")
			.tag("sample.id", String.valueOf(id))
			.start();

		try (Tracer.SpanInScope ws = tracer.withSpanInScope(span)) {
			// 비즈니스 로직 수행
			log.info("Fetching sample with id: {}", id);
			sampleMethod();
			return createSampleDto();
		} catch (Exception e) {
			span.error(e);
			log.error("Error fetching sample with id: {}", id, e);
			throw e;
		} finally {
			span.finish();
		}
	}

	public void sampleMethod() {
		Span span = tracer.nextSpan().name("sampleMethod").start();
		try (Tracer.SpanInScope ws = tracer.withSpanInScope(span)) {
			// 비즈니스 로직 수행
			log.info("Executing sampleMethod business logic");
		} catch (Exception e) {
			span.error(e);
			log.error("Error in sampleMethod", e);
		} finally {
			span.finish();
		}
	}

	private SampleDto createSampleDto() {
		return SampleDto.builder()
			.id(1L)
			.name("Test Sample")
			.description("This is a test sample.")
			.build();
	}

}
