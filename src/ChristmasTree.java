
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot rob  = new Robot("mini");
	
	
    public static void main(String[] args) {

        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.moveUp();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
        ohChristmasTree.drawPresents();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down

void moveUp() {
	rob.setSpeed(1000);
	rob.move(250);
}
    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    
rob.penDown();
rob.setPenColor(0,85,68);

        // 1. Make a variable for turnAmount and set it to 175
int x = 175;

        // 2. Start the Robot facing to the right
rob.turn(-90);
rob.move(10);
rob.setAngle(90);

        // 5. Repeat steps 3 through 11, 11 times
for(int t = 0; t<15; t++) {

            // 3. Move the robot the width of the tree
  rob.move((int)treeWidth);
            // 4. Turn the robot the current turnAmount to the right
rob.turn((int)x);
            // 6. Set the treeWidth to the current treeWidth times the scale
    treeWidth = treeWidth*scale;
            // 7. Move the robot the width of a tree again
    rob.move((int)treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
    rob.turn((int)-x);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    treeWidth = treeWidth*scale;
            // 11. Decrease turnAmount by 1
x = x-1;
}
}
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
    
rob.turn((int)treeWidth/2);

        // 2. Change the robot so that it is pointing straight down
rob.setAngle(180);

        // 4. Set the pen width to the tree width divided by 10


        // 5. Change the color of the line the robot draws to brown
rob.penDown();
rob.setPenColor(0,85,68);
rob.setAngle(90);

rob.move((int)(treeWidth-40)/2);
rob.setPenWidth((int)treeWidth/10);
rob.setAngle(180);
rob.setPenColor(109,68,68);

        // 3. Move the robot a quarter the tree width
rob.move((int)treeWidth/4);

    }
    
    void drawStar() {
    	rob.setSpeed(1000);
    	rob.move(50);
    	rob.turn(18);
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    for(int i=0; i <5; i++) {

    	rob.penDown();
    	rob.setPenColor(255,255,000);
    	rob.turn(144);
    	rob.move(30);
    }
    rob.penUp();
    for(int i=0; i <5; i++) {


    	rob.turn(-144);
    	rob.move(30);
    }
    rob.setAngle(180);
    rob.move(30);
    rob.setAngle(0);
    
    }
    
    void drawPresents() {
    	rob.penUp();
    	rob.setPenWidth(1);
    	rob.setAngle(180);
    	rob.move(10);
    	rob.setAngle(270);
    	rob.move(30);
    	rob.penDown();
    	rob.setRandomPenColor();
    	for(int i=0; i<4;i++) {
    		rob.move(30);
    		rob.turn(90);
    	}
    	for(int i = 0; i<30; i++) {
    		rob.move((int)30-i);
    		rob.turn(90);
    		
    	}
    	rob.penUp();
    	rob.move(90);
    	rob.penUp();
    	rob.penDown();
    	rob.setRandomPenColor();
    	for(int i = 0; i<30; i++) {
    		rob.move((int)30-i);
    		rob.turn(90);
    		
    	}
    }
}




