import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	final void Binarytest() {
		BSTree treat = new BSTree();
		assertTrue(treat.isEmpty());
		assertEquals(0, treat.getSize());
		treat.insert(25);
		assertFalse(treat.isEmpty());
		treat.insert(20);
		treat.insert(26);
		treat.insert(29);
		treat.insert(10);
		treat.insert(1);
		treat.insert(35);
		treat.insert(27);
		treat.insert(21);
		treat.insert(15);
		assertEquals(35, treat.largest());
		assertEquals(0, treat.retrieveDepth(25));
		assertEquals(1, treat.retrieveDepth(26));
		assertEquals(2, treat.retrieveDepth(21));
		assertEquals(3, treat.retrieveDepth(35));
		assertEquals(10, treat.getSize());
		assertEquals(4, treat.retrieveDepth(16));
		assertEquals(1, treat.retrieve(1));
		assertEquals(null, treat.retrieve(5));
		assertEquals(209, treat.sum());
		List<Integer> Leest = new ArrayList<Integer>();
		
		  Leest.add(1); Leest.add(10); Leest.add(15); Leest.add(20); Leest.add(21);
		  Leest.add(25); Leest.add(26); Leest.add(27); Leest.add(29); Leest.add(35);
		 
		assertTrue(Leest.equals(treat.toList()));
	}

 @Test final void BinaryEqualstest() { 
  BSTree equalitree = new BSTree();
  BSTree equalitree2 = new BSTree(); 
  BSTree equalitree3 = new BSTree(); 
  BSTree equalitree4 = new BSTree(); 
  BSTree equalitree5 = new BSTree(); 
  BSTree equalitree6 = new BSTree();
  
  
  equalitree.insert(50); equalitree.insert(72); equalitree.insert(96);
  equalitree.insert(94); equalitree.insert(107); equalitree.insert(26);
  equalitree.insert(12); equalitree.insert(11); equalitree.insert(9);
  equalitree.insert(10); equalitree.insert(25); equalitree.insert(51);
  equalitree.insert(16); equalitree.insert(17); equalitree.insert(95);
  
  equalitree2.insert(50); equalitree2.insert(72); equalitree2.insert(96);
  equalitree2.insert(94); equalitree2.insert(107); equalitree2.insert(26);
  equalitree2.insert(12); equalitree2.insert(11); equalitree2.insert(9);
  equalitree2.insert(10); equalitree2.insert(25); equalitree2.insert(51);
  equalitree2.insert(16); equalitree2.insert(17); equalitree2.insert(95);
  equalitree2.insert(51);
  
  equalitree3.insert(3); equalitree3.insert(1); equalitree3.insert(5);
  equalitree3.insert(2); equalitree3.insert(4); equalitree3.insert(6);
  equalitree3.insert(7);
  
  equalitree4.insert(3); equalitree4.insert(1); equalitree4.insert(5);
  equalitree4.insert(2);
  
  equalitree5.insert(6); equalitree5.insert(4); equalitree5.insert(2);
  equalitree5.insert(5); equalitree5.insert(3); equalitree5.insert(1);
  
  
  assertFalse(equalitree.myEquals(equalitree2));
  assertFalse(equalitree.myEquals(equalitree3));
  assertFalse(equalitree.myEquals(equalitree4));
  assertFalse(equalitree.myEquals(equalitree5));
  assertFalse(equalitree.myEquals(equalitree6));
  assertFalse(equalitree6.myEquals(equalitree));
  assertFalse(equalitree6.myEquals(equalitree2)); 
}
  
  }
 
