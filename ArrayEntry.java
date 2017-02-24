package com.LongIntegerADT;

public class ArrayEntry extends Position {

	// This entry's index within the array.
    private int index;
	
    public ArrayEntry(int value, int index) {
        super(value);
		
		this.index = index;
    }
	public ArrayEntry(){
		
	}
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int pIndex) {
		index = pIndex;
	}
}

