package com.LongIntegerADT;

public class ArraySimpleList implements SimpleList<ArrayEntry> {
	
	// # of positions in the list
	private int n;
	// Current size of array
	private int arraySize;
	ArrayEntry[] _lstAE;
    
    public ArraySimpleList() {
        n = 0;
        arraySize = 0;
        
    }
    
    public ArraySimpleList(int size) {
    	arraySize = size;
    	
    	_lstAE = new ArrayEntry[size];
    	for (int i=0;i<arraySize;i++){
    		_lstAE[i]=new ArrayEntry(0,i);
    	}
    }
    
    public void insertFirst(int value) {
    	
    	if(n==0){
    		n++;
    		_lstAE[0]=new ArrayEntry(value,0);
    	}
    	else{
    		n++;
        	for(int i = n-1;i>0;i--){
        		_lstAE[i]=new ArrayEntry(_lstAE[i-1].getValue(),i);	
        	} 
        	_lstAE[0]= new ArrayEntry(value, 0);
    	}	
    }
    
    public void insertLast(int value) {
    	if(n==0){
    		n++;
    		_lstAE[0]=new ArrayEntry(value,0);
    	}
    	else{
    		_lstAE[n]=new ArrayEntry(value,n);
    		n++;
    	}
    }
    
    public ArrayEntry first() {
    	
    	return _lstAE[0];
    }

    public ArrayEntry last() {
    	
    	return _lstAE[n-1];
    }

    public boolean isFirst(ArrayEntry p) {
    	int pIndex = p.getIndex();
    	
    	if(pIndex==0)
    		return true;
    	else
    		return false;
    }

    public boolean isLast(ArrayEntry p) {
    	int pIndex2 = p.getIndex();
    	
    	if(pIndex2 == n-1)
    		return true;
    	else
    		return false;
    }

    public ArrayEntry before(ArrayEntry p) {
    	int pIndex3 = p.getIndex();
    	
    	if(pIndex3 <= 0)
    		return null;
    	else
    		return _lstAE[pIndex3-1];
    }

    public ArrayEntry after(ArrayEntry p) {
    	int pIndex4 = p.getIndex();
    	
    	if(pIndex4 >= n-1)
    		return null;
    	else
    	    return _lstAE[pIndex4+1];
    }

    public boolean isEmpty() {
    	if(n==0)
    		return true;
    	else
    		return false;
    }

    public int size() {
        return arraySize;
    }
    
    @Override
	public boolean isArray() {
		// TODO Auto-generated method stub
		return true;
	}
}

