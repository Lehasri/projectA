package com.chainsys.springproject.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLc {
	public AnnotationLc() {
		System.out.println("Annotation object created "+ hashCode());
	}
	@PostConstruct
	public void start() {
		System.out.println("Start Annotation...");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Stoped Annotation...");
	}
	public void print() {
		System.out.println("print Annotation Called");
	}
}
