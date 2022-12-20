package com.jatin.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jatin.springboot.exception.InvalidMoveException;
import com.jatin.springboot.util.ComputerMoveGenerator;
import com.jatin.springboot.util.MOVE;
import com.jatin.springboot.util.RESULT;

@Service
public class GameService {
	
	@Autowired
	private ComputerMoveGenerator computerMoveGenerator; 
	
	public ResponseEntity<String> getMovesAndProduceResult(String userMoveString) {
		
		MOVE userMove; 
		
		try {
			userMove = MOVE.valueOf(userMoveString);
		}catch(IllegalArgumentException e){
			throw new InvalidMoveException("Invalid Move : " + userMoveString);
		}
		
		MOVE compMove = computerMoveGenerator.getComputerMove();
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
		
		return ResponseEntity.ok(result.toString()); 
		
	}

}
