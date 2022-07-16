

Class Vehicle {
    String seating = 5;
    int speed = 50;
    int geaar = 1;

    void chnageGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }
}

    Vehicle v1 = new Vehicle();
    Vehicle v2 =  new Vehicle();



    int total;

    int x;

    //Primitive declarations with assignments
    x = 234;

    byte b = 89;

    boolean check = true;

    //Reference variable declarations with assignments

    Vehicle vehicle = new Vehicle();

    Vehicle car = new Vehicle();

    Vehicle mazda = car;
