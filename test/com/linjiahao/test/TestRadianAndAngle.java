package com.linjiahao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.linjiahao.point.Point;
import com.linjiahao.vector.Vector;

@RunWith(Parameterized.class)
class TestRadianAndAngle {

	static Stream<Arguments> getParams() {
		return Stream.of(Arguments.of(10d, 20d, 20d, 30d, -45d, -Math.PI / 4),
		        Arguments.of(10d, 10d, 20d, 0d, 45d, Math.PI / 4),
		        Arguments.of(10d, 10d, 10d, 0d, 90d, Math.PI / 2),
		        Arguments.of(10d, 10d, 0d, 0d, 135d, Math.PI * 3 / 4),
		        Arguments.of(10d, 10d, 0d, 10d, 180d, Math.PI),
		        Arguments.of(10d, 10d, 0d, 20d, -135d, -Math.PI * 3 / 4),
		        Arguments.of(10d, 10d, 10d, 20d, -90d, -Math.PI / 2),
		        Arguments.of(10d, 10d, 20d, 20d, -45d, -Math.PI / 4),
		        Arguments.of(10d, 10d, 20d, 10d, 0d, 0d));
	}

	@ParameterizedTest
	@MethodSource("getParams")
	void test(double x1, double y1, double x2, double y2, double angle, double radian) {
		Vector vector = new Vector();
		vector.setStartingPoint(new Point(x1, y1));
		vector.setFinishingPoint(new Point(x2, y2));
		assertEquals(angle, vector.getAngle(), "角度不对");
		assertEquals(radian, vector.getRadian(), "弧度不对");
	}

}
