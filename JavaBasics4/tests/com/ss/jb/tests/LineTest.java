package com.ss.jb.tests;


import org.junit.Test;
import org.junit.Assert;

import com.ss.jb.four.Line; 

public class LineTest {
	
	Line line = new Line(1,2,3,4);
	Line testParallelLine1 = new Line(3,4,5,6);
	Line testParallelLine2 = new Line(1, 4, 8, 12);
	
	@Test
	public void testGetSlope() {
		Assert.assertEquals(1, line.getSlope(), 0.0001);
		Assert.assertNotEquals(4, line.getSlope(), 0.0001);
	}
	
	@Test
	public void testGetDistance() {
		Assert.assertEquals(Math.sqrt(8), line.getDistance(), 0.0001);
		Assert.assertNotEquals(2, line.getSlope(), 0.0001);
	}
	
	@Test
	public void testParallelTo() {
		Assert.assertEquals(true, line.parallelTo(testParallelLine1));
		Assert.assertNotEquals(true, line.parallelTo(testParallelLine2));
	}
}
