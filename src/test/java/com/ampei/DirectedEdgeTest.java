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

	@Test
	public void constructor_XY() {
		DirectedEdge<String> edge = new DirectedEdge<>("X", "Y");
		Assert.assertTrue(edge.getSource().equals("X"));
		Assert.assertTrue(edge.getTarget().equals("Y"));
	}
	
	@Test(expected = NullPointerException.class)
	public void constructorFailsWithNull() {
	  new DirectedEdge<>(null, "B");
	}
	
}