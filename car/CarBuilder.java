package builder.car;

import builder.builder.Builder;

public class CarBuilder implements Builder{

    private Car car = new Car();

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        
    }

    @Override
    public void setEngine(String engine) {

    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }

    public Car getResult() {
        return this.car;
    };

}
