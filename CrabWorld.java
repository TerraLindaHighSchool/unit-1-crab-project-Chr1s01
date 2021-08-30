import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,219,212);
        Worm worm = new Worm();
        addObject(worm,61,62);
        Worm worm2 = new Worm();
        addObject(worm2,273,67);
        Worm worm3 = new Worm();
        addObject(worm3,428,86);
        Worm worm4 = new Worm();
        addObject(worm4,78,201);
        Worm worm5 = new Worm();
        addObject(worm5,444,237);
        Worm worm6 = new Worm();
        addObject(worm6,217,391);
        Worm worm7 = new Worm();
        addObject(worm7,472,348);
        Worm worm8 = new Worm();
        addObject(worm8,334,200);
    }
}