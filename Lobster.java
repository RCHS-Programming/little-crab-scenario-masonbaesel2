import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (Mason Baesel) 
 * @version (3/16/21)
 */
public class Lobster extends Actor
{
   public void act()
    {
        turnAtEdge();
        randomTurn();
        move();
        lookForCrab();
        
    }
    public void move()
    {
        move(5);
        lookForCrab();
    }
    
    /*
     * check wether we have stumbled about a crab if we have ate it and if not eat it
     */
    public void lookForCrab()
    {
        if (isTouching (Crab.class))
        {
            removeTouching(Crab.class);
        }
    }
    
    /*
     * make the Lobster turn randomly left or right between 0 and 45 degrees.
     */
    public void randomTurn()
    {
       if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(91 - 45));
        } 
    }
    
    public void turnAtEdge()
    { 
        if (isAtEdge() )
        {
            turn(17);
        }
    }
}
