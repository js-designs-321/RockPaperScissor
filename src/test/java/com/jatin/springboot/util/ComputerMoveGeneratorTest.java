package com.jatin.springboot.util;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComputerMoveGeneratorTest {

	@Autowired
	private ComputerMoveGenerator computerMoveGenerator; 
	
	@Test
	void checkGeneratedMoves() {
		MOVE compMove = computerMoveGenerator.getComputerMove(); 
		assertTrue(compMove == MOVE.PAPER || 
				compMove == MOVE.ROCK ||
				compMove == MOVE.SCISSOR);
	}
	
	
}
