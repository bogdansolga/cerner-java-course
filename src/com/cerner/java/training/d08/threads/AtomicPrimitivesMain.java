package com.cerner.java.training.d08.threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicPrimitivesMain {

	public static void main(String[] args) {
		AtomicInteger value = new AtomicInteger(5);
		value.incrementAndGet();
		System.out.println(value.get());
		
		AtomicBoolean atomicBoolean = new AtomicBoolean(true);
		atomicBoolean.getAndSet(false);
	}
}
