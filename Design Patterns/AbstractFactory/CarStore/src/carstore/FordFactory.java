/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sithum
 */
public class FordFactory extends Car
{
    PartAbstractFactory partFactory;
    
    public FordFactory(PartAbstractFactory parts)
    {
        partFactory = parts;
    }
    
    @Override
    public void createCar() 
    {
        System.out.println("Constructing " + brand + "...");
        engine = partFactory.createEngine();
        chassis = partFactory.createChassis();
        tire = partFactory.createTire();
        window = partFactory.createWindow();
    }
    
}
