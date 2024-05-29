

import java.time.LocalDate;



public class BottleOfWater extends Product {
    
    private float volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();

    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = spark;
        this.volume = volume;
        this.pack = pack;

    }

    public float getVolume() {
        return volume;
    }
    public String getPack() {
        return pack;
    }
    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + releaseDate + " " + volume + " " + pack + " " + isSpark;
    }

}
