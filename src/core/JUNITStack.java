package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmtyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	public void testpushElmToTop() {
		
		Stack s1 = new Stack();
		s1.push(1);
		assertEquals(1, s1.Top());
	}
}
