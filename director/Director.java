package builder.director;

import builder.builder.Builder;

public class Director {
        
    public void makeSUV(Builder builder) {

        builder.reset();
        builder.setSeats(4);
        builder.setEngine("suv8");
        builder.setTripComputer();
        builder.setGPS();

    }

    public void makeSportCar(Builder builder) {

        builder.reset();
        builder.setSeats(4);
        builder.setEngine("sc93");
        builder.setTripComputer();
        builder.setGPS();
        
    }
}
