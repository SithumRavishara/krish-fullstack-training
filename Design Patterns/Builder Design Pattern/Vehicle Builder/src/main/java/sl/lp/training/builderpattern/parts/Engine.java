package sl.lp.training.builderpattern.parts;

public class Engine implements Part {

    public Engine() {
    }
        
    private double hp;

    private int cc;

    private int cylinders;

    public double getPrice() {        
        return 8000d;
    }

    public String getSupplier() {        
        return "Toyota";
    }

    public String getName() {
        return "Motor";
    }

}