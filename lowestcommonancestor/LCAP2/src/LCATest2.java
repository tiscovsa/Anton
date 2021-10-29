import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class LCATest2 extends TestCase {
	
	 /*Tests constructor of lowest common ancestor class*/
	 @Test
	    public void testConstructor() 
	    {
		 new LCA();
	    
	    }
	 
	 /*Tests the graph is correctly constructed as a binary tree*/
	 @Test
	    public void testBinaryTreeConstructor() 
	    {
		 	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        //populate the tree with some nodes 
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(1, tree.findLCA(5,7).data);   
	    }

	 
	    /* Tests empty tree */
	    @Test
	    public void testEmptyTree() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	    }
	    
	    /* Tests tree with one input */
	    @Test
	    public void testTreeWithOneInput() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	        tree.root = LCA.new Node(1); 
	        assertEquals(1,tree.findLCA(1, 1).data);	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the root node */
	    @Test
	    public void testLCAisRoot() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        assertEquals(null,tree.findLCA(1, 2));	
	        tree.root = LCA.new Node(1);
	        tree.root.left = LCA.new Node(2); 
	        assertEquals(1,tree.findLCA(1, 2).data);	
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is not the root node */
	    @Test
	    public void testLCAisNotRoot() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(4,5).data);  
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the first input node */
	    @Test
	    public void testLCAisNode1() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(2,4).data);  
	    	
	    }
	    
	    /* Tests for input of two nodes, where the LCA is the second input node */
	    @Test
	    public void testLCAisNode2() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(2, tree.findLCA(4,2).data);  
	    }
	    
	    /* Tests for input of two nodes that are the same node, where the LCA is the node */
	    @Test
	    public void testInputNodesSame() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(4, tree.findLCA(4,4).data);  
	    	
	    }
	    
	    /* Tests for when node1 or node2 is not present in the tree -should return NULL as they have no LCA*/
	    @Test
	    public void testNodeNotPresent() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(null, tree.findLCA(100,200));	
	    }
	    
	    /* Tests for when the nodes are negative*/
	    @Test
	    public void testNegativeNode() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.right = LCA.new Node(3); 
	        tree.root.left.left = LCA.new Node(4); 
	        tree.root.left.right = LCA.new Node(5); 
	        tree.root.right.left = LCA.new Node(6); 
	        tree.root.right.right = LCA.new Node(7);
	        assertEquals(null, tree.findLCA(-1,-2));
	    	
	    }
	    
	    
	    /* Tests for when tree only has nodes coming from left*/
	    @Test
	    public void testNodesInStraightLineToLeft() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.left = LCA.new Node(2); 
	        tree.root.left.left = LCA.new Node(3);  
	        tree.root.left.left.left = LCA.new Node(4); 
	        assertEquals(2, tree.findLCA(3,2).data);
	    }
	    
	    /* Tests for when tree only has nodes coming from right*/
	    @Test
	    public void testNodesInStraightLineToRight() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(1); 
	        tree.root.right = LCA.new Node(2); 
	        tree.root.right.right = LCA.new Node(3);  
	        tree.root.right.right.right = LCA.new Node(4); 
	        assertEquals(2, tree.findLCA(3,2).data);
	    }
	    
	    /* Tests for when the nodes are negative*/
	    @Test
	    public void testNegativeNodeTree() 
	    {
	        //TODO
	    	LCA LCA = new LCA();
	        LCA.BinaryTree tree = LCA.new BinaryTree(); //create the binary tree to represent graph
	        
	        tree.root = LCA.new Node(-1); 
	        tree.root.left = LCA.new Node(-2); 
	        tree.root.right = LCA.new Node(-3); 
	        tree.root.left.left = LCA.new Node(-4); 
	        tree.root.left.right = LCA.new Node(-5); 
	        tree.root.right.left = LCA.new Node(-6); 
	        tree.root.right.right = LCA.new Node(-7);
	        assertEquals(-2, tree.findLCA(-5,-4).data);   	
	    }
	    
	    /**TESTS FOR DIRECTED ACYCLIC GRAPH DATA STRUCTURE**/
	    //tests adding edges to the DAG
		 @Test
			public void testAddEdge(){
				DAG dag = new DAG(5);
				
				assertEquals("Adding a valid edge failed", true, dag.addEdge(0, 1));
				assertEquals("Adding a  valid edge failed", true, dag.addEdge(1, 2));
				assertEquals("Adding an edge that already exists failed", false, dag.addEdge(1, 2));
				assertEquals("Adding an edge from node to itself should return false", false, dag.addEdge(0, 0));
				assertEquals("Adding a cycle test failed", false, dag.addEdge(2, 0));
				
				assertEquals("Test for non existent vertices failed", false, dag.addEdge(5, 4));
				assertEquals("Test for non existent vertices failed", false, dag.addEdge(4, 5));
				assertEquals("Test for non existent vertices failed", false, dag.addEdge(100, 200));
				assertEquals("Test for negative vertices failed", false, dag.addEdge(-1, -2));
				
			}	
		 
		 //tests to check if returns correct number of vertices in the DAG
		 @Test
		 public void testV()
		 {
			 	DAG dag = new DAG(5);
				assertEquals("Test V() failed", 5, dag.V());
		 }
		 
		 //tests to check if returns correct vertices pointing from v
		 @Test
		 public void testAdj()
		 {
			 	DAG dag = new DAG(5);
				assertEquals("Test V() failed", 5, dag.V());
				ArrayList<Integer> expectedResult = new ArrayList<Integer>();
				
				//Test for empty DAG before adding vertexes
				assertTrue(dag.adj(0).size() == expectedResult.size()); 						 //make sure array list sizes are same
				assertEquals("Test for empty DAG failed", true, dag.adj(0).isEmpty());
				
				//populate the DAG
				dag.addEdge(0,1);
				dag.addEdge(1,2);
				
				//test for when only one node is adjacent
				expectedResult.add(2);
				assertEquals("Test for one adjacent node failed", expectedResult, dag.adj(1));
				
				//test for when numerous nodes are adjacent 
				dag.addEdge(1, 3);
				dag.addEdge(1,4);
				expectedResult.add(3);
				expectedResult.add(4);
				assertTrue(dag.adj(1).size() == expectedResult.size());  							//make sure array list sizes are same
				assertEquals("Test for one adjacent node failed", expectedResult, dag.adj(1));
		 }
		 

		 	@Test
			public void testDagLowestCommonAncestor(){
				DAG dag = new DAG(5);
				
				dag.addEdge(0, 1);
				dag.addEdge(0, 2);
				dag.addEdge(2, 3);
				dag.addEdge(3, 4);
				
				ArrayList<Integer> expectedResult = new ArrayList<Integer>();
				expectedResult.add(0);
						
				assertTrue("Size of lca is different to the size of the expected result", dag.lowestCommonAncestor(4,1).size() == expectedResult.size());
				for(int i : expectedResult)
				{
					assertTrue("Testing single lca return", dag.lowestCommonAncestor(4,1).contains(i));
				}
				
				//testing a dag that returns multiple lca's
				DAG dag2 = new DAG(7);

				dag2.addEdge(0, 3);			
				dag2.addEdge(1, 3);
				dag2.addEdge(1, 4);
				dag2.addEdge(2, 5);
				dag2.addEdge(2, 6);
				dag2.addEdge(3, 5);
				dag2.addEdge(3, 6);
				dag2.addEdge(4, 6);
				
				expectedResult.clear();
				expectedResult.add(2);
				expectedResult.add(3);
						
				assertTrue("lcas size different from expected results size", dag2.lowestCommonAncestor(5,6).size() == expectedResult.size());
				for(int i : expectedResult)
				{
					assertTrue("Testing mutliple lca return", dag2.lowestCommonAncestor(5,6).contains(i));
				}
					
				
				//Testing input above or below the range of dag
				assertTrue("Testing out of range inputs", dag2.lowestCommonAncestor(1000, 257).isEmpty());
				
				//Testing non present vertices input to the dag
				assertTrue("Testing negative inputs", dag2.lowestCommonAncestor(-2, -1).isEmpty());		
		 	}	
		 
		 
}