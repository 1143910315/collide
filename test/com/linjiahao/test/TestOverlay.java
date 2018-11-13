package com.linjiahao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.linjiahao.graphics.Graphics;
import com.linjiahao.point.Point;
import com.linjiahao.tools.Check;
import com.linjiahao.vector.Vector;

class TestOverlay {
	
	@Test
	void test() {
		long beginTime = new Date().getTime();
		Point startingPoint = new Point(0, 0);
		Point middlePoint = new Point(4, 0);
		Point finishingPoint = new Point(0, 4);
		List<Vector> vectors = Arrays.asList(new Vector(startingPoint, middlePoint),
				new Vector(middlePoint, finishingPoint), new Vector(finishingPoint, startingPoint));
		Graphics graphics = new Graphics(vectors);
		Point startingPoint1 = new Point(1.99999, 1.99999);
		Point middlePoint1 = new Point(5, 5);
		Point finishingPoint1 = new Point(5, 8);
		List<Vector> vectors1 = Arrays.asList(new Vector(startingPoint1, middlePoint1),
				new Vector(middlePoint1, finishingPoint1),
				new Vector(finishingPoint1, startingPoint1));
		Graphics graphics1 = new Graphics(vectors1);
		assertEquals(1, Check.intersect(graphics, graphics1), "判断结果不正确");
		long endTime = new Date().getTime();
		System.out.println(endTime - beginTime);
	}
	
}
