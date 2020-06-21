package com.ampei;

public class DirectedEdge<T> {
	
	private final T source;
	private final T target;

	public DirectedEdge(T source, T target) {
		this.source = source;
		this.target = target;
	}

	public T getSource() {
		return source;
	}

	public T getTarget() {
		return target;
	}

}
