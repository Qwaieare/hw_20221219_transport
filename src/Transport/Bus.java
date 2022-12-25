package Transport;

   public class Bus extends Transport {

    public Bus(String brand,
               String model,
               String productionCountry,
               int productionYear,
               String color,
               int maximumSpeed) {
        super(brand, model, productionCountry, productionYear, color, maximumSpeed);
    }
   @Override
   public void printTransport() {
       System.out.println("марка автобуса: " + getBrand() +
               ", модель автобуса: " + getModel() +
               ", год выпуска автобуса: " + getProductionYear() +
               ", страна производства: " + getProductionCountry() +
               ", цвет кузова: " + getColor() +
               ", максимальная скорость передвижения: " + getMaximumSpeed());
   }

}
