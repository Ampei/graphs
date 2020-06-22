package com.ampei;

import java.util.Set;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DirectedGraphTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

	@Test(expected = UnsupportedOperationException.class)
	public void verticesAreUnmodifiable() {
		DirectedGraph<Integer> graph = new DirectedGraph<>();
		Set<Integer> vertices = graph.getVertices();
		vertices.add(10);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void edgesAreUnmodifiable() {
		DirectedGraph<Integer> graph = new DirectedGraph<>();
		Set<DirectedEdge<Integer>> edges = graph.getEdges();
		edges.add(new DirectedEdge<>(1, 2));
	}

	@Test
	public void vertexFailsOnNullVertex() {
		DirectedGraph<Integer> graph = new DirectedGraph<>();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("vertex must not be null");
		graph.vertex(null);
	}

	@Test
	public void edgeFailsOnNullSource() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("source must not be null");
		graph.edge(null, "B");
	}

	@Test
	public void edgeFailsOnNullTarget() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("target must not be null");
		graph.edge("A", null);
	}

	@Test
	public void edgeAddsSourceVertex() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		graph.edge("A", "B");
		Assert.assertTrue(graph.getVertices().contains("A"));
	}
	
	@Test
	public void edgeAddsTargetVertex() {
		DirectedGraph<String> graph = new DirectedGraph<>();
		graph.edge("A", "B");
		Assert.assertTrue(graph.getVertices().contains("B"));
	}
	
	@Test
	public void edgeAddsOnEdge() {
	  DirectedGraph<String> graph = new DirectedGraph<>();
	  graph.edge("A", "B");
	  Assert.assertTrue(graph.getEdges().contains(new DirectedEdge<>("A", "B")));
	}

}
