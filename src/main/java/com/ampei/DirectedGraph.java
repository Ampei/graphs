package com.ampei;

import java.util.HashSet;
import java.util.Set;

public class DirectedGraph<T> {

	private final Set<T> vertices;

	public DirectedGraph() {
		vertices = new HashSet<>();
	}

	public Set<T> getVertices() {
		return vertices;
	}

	public Set<DirectedEdge<T>> getEdges() {
		return new HashSet<>();
	}

	public void vertex(T vertex) {
		vertices.add(vertex);
	}

}
