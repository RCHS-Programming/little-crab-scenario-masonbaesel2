import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    /*  
    * Create a crab and initialize its two images.  
    */
   
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
        wormsEaten = 0;
    }
    public void act()
    {
        
        checkKeyPress();
        switchImage();
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
            wormsEaten += 1;
            
            getWorld().showText("Score: " + wormsEaten, 50, 500);
            if (wormsEaten == 10)
            {
            Greenfoot.playSound ("fanfare.wav");Greenfoot.stop();
            }
        }
        
        {
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
    //switch image of the crab to make it look animated
    public void switchImage()
    {
        if (getImage() == image1)
        {
            setImage (image2);
        }
        else
        {
            setImage (image1);
        }
    }
}
    
  