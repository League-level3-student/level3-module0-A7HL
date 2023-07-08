package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel{

    private static final long serialVersionUID = 1L;
    private int windowWidth;
    private int windowHeight;
    private int pixelWidth;
    private int pixelHeight;
    private int rows;
    private int cols;

    // 1. Create a 2D array of pixels. Do not initialize it yet.

    private Color color;
    public Pixel[][] pixels;

    public GridPanel(int w, int h, int r, int c) {
        this.windowWidth = w;
        this.windowHeight = h;
        this.rows = r;
        this.cols = c;

        this.pixelWidth = windowWidth / cols;
        this.pixelHeight = windowHeight / rows;

        color = Color.BLACK;

        setPreferredSize(new Dimension(windowWidth, windowHeight));

        // 2. Initialize the pixel array using the rows and cols variables.
        pixels = new Pixel[this.rows][this.cols];

        // 3. Iterate through the array and initialize each element to a new pixel.
        for(int row =0;row<pixels.length;row++) {
        	for(int col =0;col<pixels[row].length;col++) {
        		pixels[row][col] = new Pixel(col*pixelWidth,row*pixelHeight);
        	}
        }

    }

    public void setColor(Color c) {
        color = c;
    }

    public void clickPixel(int mouseX, int mouseY) {
        // 5. Use the mouseX and mouseY variables to change the color
        //    of the pixel that was clicked. *HINT* Use the pixel's dimensions.
    	int column = mouseX/pixelWidth;
    	int row = mouseY/pixelHeight;
    	pixels[row][column].color = color;
    	
    }

    @Override
    public void paintComponent(Graphics g) {
        // 4. Iterate through the array.
        //    For every pixel in the list, fill in a rectangle using the pixel's color.
        //    Then, use drawRect to add a grid pattern to your display.
    	 for(int row =0;row<pixels.length;row++) {
         	for(int col =0;col<pixels[row].length;col++) {
         		Pixel p = pixels[row][col];
         		g.fillRect(p.x, p.y, pixelWidth, pixelHeight);
         		g.drawRect(p.x, p.y, pixelWidth, pixelHeight);
         	}
         }
    	 
    }
}
