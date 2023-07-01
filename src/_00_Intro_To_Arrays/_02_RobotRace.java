package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
		public static void main(String[] args) {
			
        // 2. create an array of 5 robots.
			Robot[] robs = new Robot[5];
        // 3. use a for loop to initialize the robots.
			for(int i =0;i<5;i++) {
				robs[i]= new Robot();
				robs[i].setY(550);
				robs[i].setX(220+i*110);
			}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
			boolean notFinished = true;
//		while(notFinished) {
//			for(int i = 0;i<5;i++) {
//				Random ran = new Random();
//				int k = ran.nextInt(50);
//				robs[i].move(k);
//				if(robs[i].getY()<0) {
//					System.out.println("Robot #"+i+" is the winner!");
//					notFinished = false;
//				}
//			}
//		}
		
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
		int[] arr = new int[5];
		while(notFinished) {
			for(int i = 0;i<5;i++) {
				
				Random ran = new Random();
				arr[i] = ran.nextInt(50);
			}
			for(int j =0;j<5;j++) {
				robs[j].move(arr[j]);
				if(robs[j].getY()<0) {
					System.out.println("Robot #"+j+" is the winner!");
					notFinished = false;
				}
			}
		}
		}

}
