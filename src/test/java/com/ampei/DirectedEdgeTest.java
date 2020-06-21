package com.ampei;

import org.junit.Assert;
import org.junit.Test;

public class DirectedEdgeTest {

	@Test
	public void constructor_AB() {
		DirectedEdge<String> edge = new DirectedEdge<>("A", "B");
		Assert.assertTrue(edge.getSource().equals("A"));
		Assert.assertTrue(edge.getTarget().equals("B"));
	}
	
}