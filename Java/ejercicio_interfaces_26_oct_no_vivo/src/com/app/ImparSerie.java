package com.app;

public class ImparSerie extends Serie{

    private int val;

    public ImparSerie(){
        val = 1;
    }

    @Override
    public int next() {
        int current = 2*val+1;
        val++;
        return current;
    }
    
}