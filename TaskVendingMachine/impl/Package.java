

public enum Package {
    PLASTIC("Пластик"), GLASS("Стелко");

    private final String material;

    Package (String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
