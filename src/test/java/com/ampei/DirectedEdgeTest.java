package com.ampei;

import org.junit.Assert;
import org.junit.Test;

public class DirectedEdgeTest {

	@Test
	public void constructor() {
		DirectedEdge<String> edge = new DirectedEdge<>();
		Assert.assertTrue(edge.getSource().equals("A"));
		Assert.assertTrue(edge.getTarget().equals("B"));
	}
}