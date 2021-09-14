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
        Lobster lobster = new Lobster();
        addObject(lobster,284,315);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,381,402);
        lobster2.setLocation(313,452);
        lobster.setLocation(188,299);
        Worm worm9 = new Worm();
        addObject(worm9,353,316);
        Worm worm10 = new Worm();
        addObject(worm10,96,413);
        Worm worm11 = new Worm();
        addObject(worm11,83,297);
        Worm worm12 = new Worm();
        addObject(worm12,184,119);
        Worm worm13 = new Worm();
        addObject(worm13,443,463);
        Worm worm14 = new Worm();
        addObject(worm14,146,528);
        Worm worm15 = new Worm();
        addObject(worm15,192,447);
        Worm worm16 = new Worm();
        addObject(worm16,375,515);
        crab.setLocation(293,183);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,76,466);
        lobster3.setLocation(35,520);
        lobster2.setLocation(35,459);
        lobster.setLocation(122,503);
        crab.setLocation(519,28);
        lobster2.setLocation(76,130);
        crab.setLocation(296,232);
        lobster.setLocation(489,483);
        lobster.setLocation(516,406);
        lobster3.setLocation(89,356);
        worm10.setLocation(123,484);
        lobster2.setLocation(356,63);
    }
}