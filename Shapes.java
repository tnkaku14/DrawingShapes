import java.awt.*;
import java.util.*;

public class Shapes {
    public static void main(String[] args) {
    
        Turtle yertle = new Turtle();
        int shapeSides = 5;
        int shapeAngle = 360/shapeSides;
        int turns = 12;
        
        // Task 1: Draw a regular shape
        yertle.up();
        yertle.setPosition(100,-100);
        yertle.down();
                
        for (int i=0;i<shapeSides;i++){
            yertle.forward(50);
            yertle.right(shapeAngle);
        }

        // Task 2: Draw a regular shape many times
        yertle.up();
        yertle.setPosition(100,100);
        yertle.down();
        
        for(int t=0;t<turns;t++){
            for (int i=0;i<shapeSides;i++){
               yertle.forward(50);
               yertle.right(shapeAngle);
            }
            yertle.right(360/turns);
        }
        // Task 3: How many times does Turtle turn!
        yertle.up();
        yertle.setPosition(-100,100);
        yertle.down();
        
        int numTurns = 0;
        
        for(int t=0;t<turns;t++){
            for (int i=0;i<shapeSides;i++){
               yertle.forward(50);
               yertle.right(shapeAngle);
               numTurns++;
            }
            yertle.right(360/turns);
            numTurns++;
            
        }
        System.out.println("Yertle has turned " + numTurns + " times!");

        // Extension 1:
        yertle.up();
        yertle.setPosition(-100,-100);
        yertle.down();

        int numShapes = (int)((Math.random()*4)+1);
        shapeSides = (int)((Math.random()*7)+4);
        shapeAngle = 360/shapeSides;
        turns = (int)((Math.random()*6)+10);
        for(int t=0;t<turns;t++){
            for (int i=0;i<shapeSides;i++){
               yertle.forward(50);
               yertle.right(shapeAngle);
               numTurns++;
            }
            yertle.right(360/turns);
            numTurns++;
        }
        // Extension 2:
        yertle.hide();
    }
}
