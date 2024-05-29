

import java.time.LocalDate;



public class HotDrink extends Product{
    private int temperature;
    private float volume;

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, float volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }



    @Override
    public String toString() {

        return name + " " + price + " " + releaseDate + " " + temperature + " " + volume;
    }
}
