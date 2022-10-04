import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testSizeEmpty() {
		
		// test l.size() for an empty linked list
		assertEquals(0, l.size());
		
	}

	@Test
	public void testSizeMany() {
		
		// test l.size() after adding some numbers to the linked list
		l.addAtTail(1);
		l.addAtTail(2);
		l.addAtTail(3);
		
		assertEquals(3, l.size());
		
	}
	
	@Test
	public void testSizeTwice() {
		
		// test l.size() twice after adding some numbers to the linked list
		l.addAtTail(1);
		l.addAtTail(2);
		l.addAtTail(3);
		
		assertEquals(3, l.size());
		
		l.addAtTail(4);
		l.addAtTail(5);
		l.addAtTail(6);
		
		assertEquals(6, l.size());
		
	}

	@Test
	public void testTotalEmpty() {
		
		// test l.total() for an empty linked list
		assertEquals(0, l.total());
		
	}

	@Test
	public void testTotalMany() {
		
		// test l.total() after adding some numbers to the linked list
		l.addAtTail(1);
		l.addAtTail(2);
		l.addAtTail(3);
		
		assertEquals(6, l.total());
		
	}
	
	@Test
	public void testTotalTwice() {
		
		// test l.total() twice after adding some numbers to the linked list
		l.addAtTail(1);
		l.addAtTail(2);
		l.addAtTail(3);
		
		assertEquals(6, l.total());
		
		l.addAtTail(4);
		l.addAtTail(5);
		l.addAtTail(6);
		
		assertEquals(21, l.total());
		
	}

}
