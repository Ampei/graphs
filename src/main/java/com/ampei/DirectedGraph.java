package com.ampei;

import java.util.HashSet;
import java.util.Set;

public class DirectedGraph<T> {

	public Set<String> getVertices() {
		return new HashSet<>();
	}

	public Set<DirectedEdge<T>> getEdges() {
		return new HashSet<>();
	}

}
