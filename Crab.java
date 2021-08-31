import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 *@author Chr1s01
 *@version 8/25/2020
 
 */
public class Crab extends Actor
{
    public void act()
    {
        //  move();
         turnAtEdge();
         checkKeyPress();
         onCollision();
    }


    // Moves the crab
    
    // Turns the crab at the edge
    private void turnAtEdge()
    {
        
    }
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress ( )
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(30);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        
    }
    
    // Check for collisions with other objects
    private void onCollision ( )
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
        
    }

}
