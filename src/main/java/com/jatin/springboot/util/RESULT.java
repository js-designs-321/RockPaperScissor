package com.jatin.springboot.util;

public enum RESULT {
	
	PLAYER_WINS ("Player wins"),
	COMPUTER_WINS ("Computer wins"),
	IT_IS_A_TIE ("It is a tie");
	
	private String result; 
	
	private RESULT(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return result; 
	}
	
}
