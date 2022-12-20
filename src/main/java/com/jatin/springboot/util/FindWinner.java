package com.jatin.springboot.util;

import org.springframework.stereotype.Component;

@Component
public class FindWinner {

	public RESULT findWinner(MOVE userMove,MOVE compMove) {
		
		RESULT result; 
		
		if((userMove == MOVE.PAPER && compMove == MOVE.ROCK) || 
				(userMove == MOVE.SCISSOR && compMove == MOVE.PAPER) || 
				(userMove == MOVE.ROCK && compMove == MOVE.SCISSOR) ) {
			result = RESULT.PLAYER_WINS;
		}else if((compMove == MOVE.PAPER && userMove == MOVE.ROCK) || 
				(compMove == MOVE.SCISSOR && userMove == MOVE.PAPER) || 
				(compMove == MOVE.ROCK && userMove == MOVE.SCISSOR) ) {
			result = RESULT.COMPUTER_WINS;
		}else {
			result = RESULT.IT_IS_A_TIE;
		}
		
		return result;
	}
	
}
