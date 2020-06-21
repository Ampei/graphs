package com.ampei;

import java.util.Objects;

public class DirectedEdge<T> {

	private final T source;
	private final T target;

	public DirectedEdge(T source, T target) {
		this.source = Objects.requireNonNull(source, "source must not be null");
		this.target = Objects.requireNonNull(target, "target must not be null");
	}

	public T getSource() {
		return source;
	}

	public T getTarget() {
		return target;
	}

}
