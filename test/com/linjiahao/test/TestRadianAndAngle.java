package com.linjiahao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.linjiahao.point.Point;
import com.linjiahao.vector.Vector;

class TestRadianAndAngle {

	@Test
	void test() {
		Vector vector = new Vector();
		vector.setStartingPoint(new Point(20, 30));
		vector.setFinishingPoint(new Point(10, 20));
		assertEquals(-135, vector.getAngle(), "角度不对");
		assertEquals(Math.PI * 3 / -4, vector.getRadian(), "弧度不对");
	}

}
