package com.ampei;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DirectedEdgeTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

	@Test
	public void constructorFailsWithNull() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage(("source must not be null"));
		new DirectedEdge<>(null, "B");
	}

}