package com.linjiahao.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.linjiahao.lineSegment.LineSegment;

@RunWith(Parameterized.class)
class TestLineSegmentOverlap {

	static Stream<Arguments> getParams() {
		// 测试用例不健全
		return Stream.of(Arguments.of(1d, 18d, 20d, 30d, -1), Arguments.of(9d, 0d, 10d, 10d, -1),
		        Arguments.of(9d, 1d, 10d, 10d, 0), Arguments.of(9d, 2d, 10d, 10d, 1),
		        Arguments.of(10d, 0d, 10d, 10d, 0), Arguments.of(11d, -1d, 10d, 10d, 0),
		        Arguments.of(19d, 1d, 10d, 10d, 1), Arguments.of(20d, 0d, 10d, 10d, 0),
		        Arguments.of(21d, 0d, 10d, 10d, -1), Arguments.of(11.0, -2.0, 10d, 10d, 1),
		        Arguments.of(11.0, -0.0, 10d, 10d, 1), Arguments.of(19.0, 0.0, 10d, 10d, 1),
		        Arguments.of(20.0, -0.0, 10d, 10d, 0), Arguments.of(20.0, -1.0, 10d, 10d, 1),
		        Arguments.of(21.0, -0.0, 10d, 10d, -1), Arguments.of(21.0, -1.0, 10d, 10d, 0),
		        Arguments.of(21.0, -2.0, 10d, 10d, 1));
	}

	@ParameterizedTest
	@MethodSource("getParams")
	void test(double s1, double l1, double s2, double l2, int overlap) {
		LineSegment lineSegment = new LineSegment(s1, l1);
		LineSegment lineSegment2 = new LineSegment(s2, l2);
		assertEquals(overlap, lineSegment.overlap(lineSegment2), "正向判读错误");
		assertEquals(overlap, lineSegment2.overlap(lineSegment), "反向判读错误");
	}

}
