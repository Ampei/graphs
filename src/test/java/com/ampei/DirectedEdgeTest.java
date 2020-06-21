package com.ampei;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DirectedEdgeTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void constructorAB() {
		DirectedEdge<String> edge = new DirectedEdge<>("A", "B");
		Assert.assertTrue(edge.getSource().equals("A"));
		Assert.assertTrue(edge.getTarget().equals("B"));
	}

	@Test
	public void constructorXY() {
		DirectedEdge<String> edge = new DirectedEdge<>("X", "Y");
		Assert.assertTrue(edge.getSource().equals("X"));
		Assert.assertTrue(edge.getTarget().equals("Y"));
	}

	@Test
	public void constructorFailsWithSourceNull() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage(("source must not be null"));
		new DirectedEdge<>(null, "B");
	}
	
	@Test
	public void constructorFailsWithTargetNull() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage(("target must not be null"));
		new DirectedEdge<>("A", null);
	}

}