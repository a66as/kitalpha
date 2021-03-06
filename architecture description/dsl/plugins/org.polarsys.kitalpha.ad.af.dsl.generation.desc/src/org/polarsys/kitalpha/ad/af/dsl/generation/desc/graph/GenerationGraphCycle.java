/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationGraphCycle {
	private List<Vector<GenerationNode>> cycles = new ArrayList<Vector<GenerationNode>>();;
	private GenerationNode currentRoot = null;
	private Vector<GenerationNode> visited = new Vector<GenerationNode>();
	private Stack<GenerationNode> cycle = new Stack<GenerationNode>();
	
	private GenerationGraph _graph = null;
	
	public GenerationGraphCycle(GenerationGraph graph) {
		_graph = graph;
	}
	
	/**
	 * @return True if cycles are detected, False else.
	 */
	public boolean exist(){
		return cycles.isEmpty() == false;
	}
	
	public int count(){
		return cycles.size();
	}
	
	/**
	 * @return Detected cycles
	 */
	public List<Vector<GenerationNode>> getCycles(){
		return cycles;
	}
	
	/**
	 * Search cycle in the graph
	 * @param graph
	 */
	public void analyse(){
		cycles.clear();
		Vector<GenerationNode> nodes = _graph.getOwnedNodes();
		for(int i = 0; i < nodes.size(); i++) 
		{
			visited.clear();
			cycle.clear();
			currentRoot = nodes.elementAt(i);
			cycle.push(currentRoot);
			analyse(currentRoot);
		}
	}
	
	/**
	 * Search cycle in the graph starting from node parameter
	 * @param graph
	 * @param node the root node for cycle
	 */
	private void analyse(GenerationNode node){
		visited.add(node);
		Vector<GenerationNode> neighbors = _graph.getNeighbors(node);
		for (GenerationNode neighbor : neighbors) 
		{
			if (neighbor.equals(currentRoot))
			{
				Vector<GenerationNode> vector = new Vector<GenerationNode>();
				for (GenerationNode gnode : cycle) 
					vector.add(gnode);
				
				if (isDetected(vector) == false)
					cycles.add(vector);
			}
			else
			{
				if (visited.contains(neighbor) == false)
				{
					cycle.push(neighbor);
					analyse(neighbor);
					cycle.pop();
				}
			}
		}
	}
	
	/**
	 * Check if the cycle was already detected 
	 * @param cycle the cycle to check existence
	 * @return True is the cycle is already detected, False else.
	 */
	private boolean isDetected(Vector<GenerationNode> cycle){
		for (int i = 0; i < cycles.size();  i++) 
		{
			Vector<GenerationNode> current_cycle = cycles.get(i);
			if (current_cycle.size() == cycle.size()
					&& current_cycle.contains(cycle.get(0)))
			{
				int index = current_cycle.indexOf(cycle.get(0));
				boolean gap = false;
				for (int j = 0; j < cycle.size(); j++) 
				{
					if (cycle.get(j).equals(current_cycle.get((index + j) % current_cycle.size())) == false)
					{
						gap = true;
						break;
					}
				}
				if (! gap)
					return true;
			}
		}
		return false;
	}
	
//	/**
//	 * Inverse {@link GenerationNode} order
//	 * @param cycle
//	 */
//	@SuppressWarnings("unchecked")
//	private void reorder(Vector<GenerationNode> cycle){
//		Vector<GenerationNode> cycle2 = new Vector<GenerationNode>();
//		cycle2 = (Vector<GenerationNode>) cycle.clone();
//		cycle.clear();
//		for (int i = 1; i <= cycle2.size(); i++) 
//			cycle.add(cycle2.get(cycle2.size() - i));
//	}
	
	/**
	 * Display all detected cycles
	 */
	public void print(){
		for (int i = 0; i < cycles.size(); i++) 
		{
			Vector<GenerationNode> currentCycle = cycles.get(i);
			for (GenerationNode noeud : currentCycle) 
				System.out.print(" " + noeud.getName());

			System.out.println();
		}
	}
	
	/**
	 * @return 
	 */
	public String cyclesToString(){
		String result = "";
		if (cycles.isEmpty() == false)
		{
			for (int i = 0; i < cycles.size(); i++) 
			{
				Vector<GenerationNode> currentCycle = cycles.get(i);
				result += "\t [";
				for (int j = 0; j < currentCycle.size(); j++) 
				{
					if (j != 0)
						result += " --> ";
					
					GenerationNode noeud = currentCycle.get(j);
					result += noeud.getName();
				}
				result += "] \n";
			}
			
		}
		
		return result;
	}
}
