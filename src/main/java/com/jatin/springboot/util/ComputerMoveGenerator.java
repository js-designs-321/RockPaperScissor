package com.jatin.springboot.util;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class ComputerMoveGenerator {
	
	public int randomValue(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end);
    }
	
	public MOVE getComputerMove() {
		MOVE[] values = MOVE.values();
		int random = randomValue(0, values.length);
		return values[random]; 
	}
	
}
