/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int numDown = 0;
    	int numUp =0;
    	int numLeft =0;
    	int numRight =0;
    	
    	int[] cords = new int[2];
    	for(int row =0;row<field.length;row++) {
    		for(int col =0;col<field[row].length;col++) {
    			if(field[row][col]=='c') {
    				//w
    				//o
    				//c
    				if(row-2>=0&&field[row-1][col]=='o'&&field[row-2][col]=='w') {
    					numDown++;
    				}
    				//c
    				//o
    				//w
    				if(row+2<field.length&&field[row+1][col]=='o'&&field[row+2][col]=='w') {
    					numUp++;
    				}
    				//cow
    				if(col+2<field[row].length&&field[row][col+1]=='o'&&field[row][col+2]=='w') {
    					numLeft++;
    				}	
    				//woc
    				if(col-2>=0&&field[row][col-1]=='o'&&field[row][col-2]=='w') {
    					numRight++;
    				}
    			}
    			
    		}
    	}
    	
    	if(numDown==1) {
    		for(int row =0;row<field.length;row++) {
        		for(int col =0;col<field[row].length;col++) {
        			if(field[row][col]=='c') {
        				if(row-2>=0&&field[row-1][col]=='o'&&field[row-2][col]=='w') {
        					cords[0]=row;
        					cords[1]=col;
        				}
        			}
        		}
    		}
    	}else if(numUp==1) {
    		for(int row =0;row<field.length;row++) {
        		for(int col =0;col<field[row].length;col++) {
        			if(field[row][col]=='c') {
        				
        			}
        		}
    		}
    	}else if(numLeft==1) {
    		for(int row =0;row<field.length;row++) {
        		for(int col =0;col<field[row].length;col++) {
        			if(field[row][col]=='c') {
        				
        			}
        		}
    		}
    	}else if(numRight==1){
    		for(int row =0;row<field.length;row++) {
        		for(int col =0;col<field[row].length;col++) {
        			if(field[row][col]=='c') {
        				
        			}
        		}
    		}
    	}
    	//look for letter c
    	//look for o and w around said letter
    	//take note of the direction
    	
    	//IDEAS
    	//make an array of all the cows locations??
    	//do another loop?
//    	
//    	for(int col =0;col<field[0].length;col++) {
//    		for(int row =0;row<field.length;row++) {
//    			
//    		}
//    	}
    	
        return null;
    }
}
