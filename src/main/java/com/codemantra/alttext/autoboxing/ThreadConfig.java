package com.codemantra.alttext.autoboxing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadConfig {

	@Value("${THREAD_CORE_POOL_SIZE}")
	private Integer THREAD_CORE_POOL_SIZE;

	@Value("${THREAD_MAX_POOL_SIZE}")
	private Integer THREAD_MAX_POOL_SIZE;

	@Bean
	public TaskExecutor threadPoolTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(THREAD_CORE_POOL_SIZE);
		executor.setMaxPoolSize(THREAD_MAX_POOL_SIZE);
		executor.initialize();

		return executor;
	}

}