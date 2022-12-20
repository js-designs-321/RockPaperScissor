package com.jatin.springboot.util;

import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ComputerMoveGenerator {
	
	Logger logger = LoggerFactory.getLogger(ComputerMoveGenerator.class);
	
	public int randomValue(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end);
    }
	
	public MOVE getComputerMove() {
		MOVE[] values = MOVE.values();
		int random = randomValue(0, values.length);
		logger.debug("Random move by computer ",values[random]);
		return values[random]; 
	}
	
}
