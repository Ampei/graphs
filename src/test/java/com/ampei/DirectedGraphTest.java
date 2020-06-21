package com.ampei;

import org.junit.Assert;
import org.junit.Test;

public class DirectedGraphTest {

	@Test
	public void constructor() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		Assert.assertTrue(graph.getVertices().isEmpty());
	}

}
