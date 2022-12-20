package com.jatin.springboot.service;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jatin.springboot.exception.InvalidMoveException;

@SpringBootTest
public class GameServiceTest {
	
	@Autowired
	private GameService gameService; 
	
	@Test
	void invalidMoveShouldReturnException() {
		assertThrows(InvalidMoveException.class,() -> {gameService.playMovesAndProduceResult("abc");});
	}
	
	@Test
	void invalidMove2ShouldReturnException() {
		assertThrows(InvalidMoveException.class,() -> {gameService.playMovesAndProduceResult("RoCK");});
	}
	
	@Test
	void invalidMove3ShouldReturnException() {
		assertThrows(InvalidMoveException.class,() -> {gameService.playMovesAndProduceResult("SCISSORS");});
	}
	
}
