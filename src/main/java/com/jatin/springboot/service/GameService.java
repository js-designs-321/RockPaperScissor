package com.jatin.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.jatin.springboot.exception.InvalidMoveException;
import com.jatin.springboot.util.ComputerMoveGenerator;
import com.jatin.springboot.util.FindWinner;
import com.jatin.springboot.util.MOVE;
import com.jatin.springboot.util.RESULT;

@Service
public class GameService {
	
	@Autowired
	private ComputerMoveGenerator computerMoveGenerator; 
	
	@Autowired
	private FindWinner findWinner; 
	
	Logger logger = LoggerFactory.getLogger(GameService.class);
	
	public ResponseEntity<String> playMovesAndProduceResult(String userMoveString) {
		
		MOVE userMove; 
		
		try {
			userMove = MOVE.valueOf(userMoveString);
		}catch(IllegalArgumentException e){
			logger.debug("Invalid move by user " , userMoveString);
			throw new InvalidMoveException("Invalid Move : " + userMoveString);
		}
		
		MOVE compMove = computerMoveGenerator.getComputerMove();
		
		RESULT result = findWinner.findWinner(userMove, compMove); 
		
		return ResponseEntity.ok(result.toString()); 
		
	}

}
