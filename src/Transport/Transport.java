package Transport;

public class Transport {

    private final String brand; // марка автомобиля
    private final String model; // модель автомобиля
    private final String productionCountry; // страна сборки
    private final int productionYear; // год выпуска
     private String color; // цвет кузова
    private int maximumSpeed; // максимальная скорость передвижения

    // конструктор
    public Transport(String brand,
               String model,
               String productionCountry,
               int productionYear,
               String color,
               int maximumSpeed) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (productionYear <= 2001) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.color = color;
        this.maximumSpeed = maximumSpeed;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        if (maximumSpeed == 200) {
            this.maximumSpeed = maximumSpeed;
        } else {
            this.maximumSpeed = 170;
        }
    }
    public void printTransport() {
        System.out.println("марка автобуса: " + this.brand +
                ", модель автобуса: " + this.model +
                ", год выпуска автобуса: " + this.productionYear +
                ", страна производства: " + this.productionCountry +
                ", цвет кузова: " + this.color +
                ", максимальная скорость передвижения: " + maximumSpeed);
    }

    }



