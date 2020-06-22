package com.ampei;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DirectedGraph<T> {

	private final Set<T> vertices;

	public DirectedGraph() {
		vertices = new HashSet<>();
	}

	public Set<T> getVertices() {
		return Collections.unmodifiableSet(vertices);
	}

	public Set<DirectedEdge<T>> getEdges() {
		return Collections.unmodifiableSet(new HashSet<>());
	}

	public void vertex(T vertex) {
		Objects.requireNonNull(vertex, "vertex must not be null");
		vertices.add(vertex);
	}

	public void edge(T source, T target) {
		Objects.requireNonNull(source, "source must not be null");
		Objects.requireNonNull(target, "target must not be null");
	}

}
