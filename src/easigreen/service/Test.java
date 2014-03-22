package easigreen.service;

public class Test
{
    public static void main(String[] args)
    {
        new Test().run();
    }

    public void run()
    {
        Technology tech1 = new Technology(-10, 2, -20,      // general
                                          5, 0, 0, 0, 0, 0, // fossil
                                          5, 0, 0, 0, 0, 0, // nuclear
                                          0, 0, 0, 0, 0, 0, // renewable
                                          0, 0, 0,          // oil
					  3);               // quality

	Technology techNorm = new Technology(-10, 0, 0,        // general
                                             0, 0, 3, 0, 0, 0, // fossil
                                             0, 0, 3, 0, 0, 0, // nuclear
                                             0, 0, 3, 0, 0, 0, // renewable
                                             2, 3, 4,          // oil
					     2);               // quality

	Technology techSuper = new Technology(-10, 0, 0,        // general
                                               0, 0, 3, 0, 0, 0, // fossil
                                               0, 0, 3, 0, 0, 0, // nuclear
                                               0, 0, 3, 0, 0, 0, // renewable
                                               2, 3, 4,          // oil
					       9);               // quality
    }
}