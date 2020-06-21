package com.ampei;

import org.junit.Assert;
import org.junit.Test;

public class DirectedGraphTest {

	@Test
	public void constructor() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		Assert.assertTrue(graph.getVertices().isEmpty());
		Assert.assertTrue(graph.getEdges().isEmpty());
	}
	
	@Test
	public void vertexAddsNewVertex() {
	  DirectedGraph<String> graph = new DirectedGraph<>();
	  graph.vertex("A");
	  Assert.assertTrue(graph.getVertices().contains("A"));
	}

}
