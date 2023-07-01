package _04_Crazy_Digital_Painting;

import java.awt.Color;

public class CrazyDigitalPainting {
    // 1. Create two final static integers for the width and height of the display.
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
	

    // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.
	Color[][] arrC = new Color[WIDTH][HEIGHT];


    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.
    	
        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
        //    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
    		for(int r = 0;r<arrC.length;r++) {
    			for(int c = 0;c<arrC[r].length;c++) {
    				//arrC[r][c]= new Color(r % 256, (r * c) % 256, c % 256);
    				//arrC[r][c]= new Color(r/(c+1)% 256, (r+c)% 256, r % 256);
    				//arrC[r][c]= new Color(r/(c+1)% 256, (r+c)% 256, Math.abs(c*200+32-r) % 256);
    				//arrC[r][c]= new Color(r/(c+1)% 256, Math.abs(c*200+32-r) % 256, r%256);
    				//arrC[r][c]= new Color(Math.abs(c*200+32-r) % 256, (r+c)% 256,r/(c+1)% 256 );
    				arrC[r][c]= new Color(Math.abs(c*200+32-r) % 256, (r+c)% 256,r% 256 );
    				
    			}
    		}
        // 5. Come up with your own pattern to make a cool crazy image.

        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
    		//ColorArrayDisplayer cAD = new ColorArrayDisplayer();
    		ColorArrayDisplayer.displayColorsAsImage(arrC);
    		
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
    }
}
