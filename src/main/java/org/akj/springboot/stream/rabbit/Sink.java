package org.akj.springboot.stream.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
	String INPUT = "input";

	@Input("input")
	SubscribableChannel input();
}