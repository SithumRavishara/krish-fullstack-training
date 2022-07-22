package sl.lp.training.builderpattern;

import sl.lp.training.builderpattern.parts.Engine;
import sl.lp.training.builderpattern.parts.GearBox;
import sl.lp.training.builderpattern.parts.Headlight;
import sl.lp.training.builderpattern.parts.Seat;
import sl.lp.training.builderpattern.parts.Tire;
import sl.lp.training.builderpattern.parts.Wheel;

public class VehicleInvoiceApp {

    public VehicleInvoiceApp() {
    }

    public static void main(String[] args) {
        VehicleBuilder builder = new VehicleBuilder();
        
        //build the vehicle
        builder
                .addPart(new Engine())
                .addPart(new GearBox())
                .addPart(new Headlight())
                .addPart(new Headlight())
                .addPart(new Wheel())
                .addPart(new Wheel())
                .addPart(new Wheel())
                .addPart(new Wheel())                
                .addPart(new Tire())
                .addPart(new Tire())
                .addPart(new Tire())
                .addPart(new Tire())
                .addPart(new Seat())
                .addPart(new Seat())
                .addPart(new Seat())
                .addPart(new Seat())
                .addPart(new Seat())                
                .build();
    }

}