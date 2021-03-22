import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    /*  
    * Create a crab and initialize its two images.  
    */
   
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
    }
    public void act()
    {
        checkKeyPress();
        move();
        lookForWorm();
        
    }
    public void move()
    {
        move(5);
        lookForWorm();
    }
    
    /*
     * check wether we have stumbled about a worm if we have ate it and if not eat it
     */
    public void lookForWorm()
    {
        if (isTouching (Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound ("au.wav");
        }
    }
    
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        }
    }
   
}
    
  