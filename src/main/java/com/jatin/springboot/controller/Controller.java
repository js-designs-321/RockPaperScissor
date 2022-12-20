package com.jatin.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jatin.springboot.service.GameService;

@RestController
@RequestMapping("/play")
public class Controller {
	
	@Autowired
	private GameService gameService; 
	
	@GetMapping("/move/{userMoveString}")
	public ResponseEntity<String> getUserMoveAndFindWinner(@PathVariable String userMoveString){
		
		ResponseEntity<String> result = gameService.playMovesAndProduceResult(userMoveString);
		return result; 
		
	}
	
}
