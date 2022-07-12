package com.chainsys.springproject.lifecycle;

public class LifeCycleBean {
	public void print() {
		System.out.println("Print Called");
	}
	public LifeCycleBean() {
		System.out.println("LifeCycleBean has Called");
	}
	public void setUp() {
		System.out.println("starting...");
	}
	public void close() {
		System.out.println("closing...");
	}
}
