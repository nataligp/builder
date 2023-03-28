package builder;

import builder.car.CarBuilder;
import builder.director.Director;
import builder.manual.ManualBuilder;

public class app{
    
    public static void main( String[] args ){

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();
        director.makeSUV(carBuilder);
        director.makeSUV(manualBuilder);
        director.makeSportCar(carBuilder);
        director.makeSportCar(manualBuilder);
        carBuilder.getResult();
        manualBuilder.getResult();

    }
}
