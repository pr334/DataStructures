package com.LongIntegerADT;

public abstract class Position {

	private int value;
	
	public Position(int value){
		this.value = value;		
	}
	public Position(){
		this.value = 0;		
	}
	public int getValue(){
		return value;
	}
	
	//public int setValue()
}

