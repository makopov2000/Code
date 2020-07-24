package com.java8.Map;


import java.util.HashMap;

public class Compare_Objects_in_Map_Via_Contain {
	
public static void main(String[] args) {
        
        //create new HashMap
        HashMap<Integer, Rectangle> hMapShapes = new HashMap<Integer, Rectangle>();
        
        //add custom Rectangle objects
        hMapShapes.put( 1, new Rectangle(10, 15) );
        hMapShapes.put( 2, new Rectangle(20, 25) );
        hMapShapes.put( 3, new Rectangle(30, 35) );
        
        boolean valueExists = hMapShapes.containsValue( new Rectangle(20, 25) );
        System.out.println( valueExists );
    }

}

class Rectangle{
    
    int width;
    int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;                
    }
 
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + height;
        result = prime * result + width;
        return result;
    }
 
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (height != other.height)
            return false;
        if (width != other.width)
            return false;
        return true;
    }
    
}
