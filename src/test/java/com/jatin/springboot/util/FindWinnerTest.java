package com.jatin.springboot.util;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindWinnerTest {
	
	@Autowired
	private FindWinner findWinner;
	
	@Test
	void userRockCompScissorPlayerShouldWin() {
		assertEquals(RESULT.PLAYER_WINS,findWinner.findWinner(MOVE.ROCK, MOVE.SCISSOR));
	}
	
	@Test
	void userScissorCompPaperPlayerShouldWin() {
		assertEquals(RESULT.PLAYER_WINS,findWinner.findWinner(MOVE.SCISSOR, MOVE.PAPER));
	}
	
	@Test
	void userPaperCompRockPlayerShouldWin() {
		assertEquals(RESULT.PLAYER_WINS,findWinner.findWinner(MOVE.PAPER, MOVE.ROCK));
	}
	
	@Test
	void compRockUserScissorCompShouldWin() {
		assertEquals(RESULT.COMPUTER_WINS,findWinner.findWinner(MOVE.SCISSOR, MOVE.ROCK));
	}
	
	@Test
	void compScissorUserPaperCompShouldWin() {
		assertEquals(RESULT.COMPUTER_WINS,findWinner.findWinner(MOVE.PAPER, MOVE.SCISSOR));
	}
	
	@Test
	void compPaperUserRockCompShouldWin() {
		assertEquals(RESULT.COMPUTER_WINS,findWinner.findWinner(MOVE.ROCK, MOVE.PAPER));
	}
	
	@Test
	void compRockUserRockShouldBeTie() {
		assertEquals(RESULT.IT_IS_A_TIE,findWinner.findWinner(MOVE.ROCK, MOVE.ROCK));
	}
	
	@Test
	void compScissorUserScissorsShouldBeTie() {
		assertEquals(RESULT.IT_IS_A_TIE,findWinner.findWinner(MOVE.SCISSOR, MOVE.SCISSOR));
	}
	
	@Test
	void compPaperUserPaperShouldBeTie() {
		assertEquals(RESULT.IT_IS_A_TIE,findWinner.findWinner(MOVE.PAPER, MOVE.PAPER));
	}
	
}
