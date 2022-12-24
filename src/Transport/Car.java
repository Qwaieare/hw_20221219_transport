package Transport;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;


    public class Car extends Transport {

        // Определяем свойства класса

        private final String carBodyType; // тип кузова
        private final int numberOfSeats; // количество мест
        private double engineVolume; // объем двигателя в литрах
        private String transmission; // коробка передачи
        private String vehicleRegistrNumber; // регистрационный номер
        private boolean summerOrWinterTires; // признак «Летняя» или «Зимняя резина»
        private Key key;
        private static Insurance insurance;

       // конструктор класса
        public Car(String brand,
                   String model,
                   int productionYear,
                   String productionCountry,
                   String carBodyType,
                   String color,
                   double engineVolume,
                   String transmission,
                   String vehicleRegistrNumber,
                   int numberOfSeats,
                   int maximumSpeed)  {
            super(brand, model, productionCountry, productionYear, color, maximumSpeed);


                this.engineVolume = engineVolume;
                this.transmission = transmission;
                this.vehicleRegistrNumber = vehicleRegistrNumber;
                this.summerOrWinterTires = summerOrWinterTires;

                if (carBodyType != null && !carBodyType.isEmpty() && !carBodyType.isBlank()) {
                    this.carBodyType = carBodyType;
                } else {
                    this.carBodyType = "седан";
                }
                if (numberOfSeats >= 5) {
                    this.numberOfSeats = 5;
                } else {
                    this.numberOfSeats = numberOfSeats;
                }


            if (key == null) {
                this.key = new Key();
            } else {
                this.key = key;
            }
            if (insurance == null) {
                this.insurance = new Insurance();
            } else {
                this.insurance = insurance;
            }

        }

        // геттеры для неизменяющихся параметров

        public String getCarBodyType() {
            return carBodyType;
        }
        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        // Созданы геттеры и сеттеры для изменяющихся параметров

        public double getEngineVolume() {
            return engineVolume;
        }
        public void setEngineVolume(double engineVolume) {
            if (engineVolume <= 1.5) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }

        public String getTransmission() {
            return transmission;
        }
        public void setTransmission(String transmission) {
            if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
                this.transmission = transmission;
            } else {
                this.transmission = "АКПП";
            }
        }

        public String getVehicleRegistrNumber() {
            return vehicleRegistrNumber;
        }
        public void setVehicleRegistrNumber(String vehicleRegistrNumber) {
            if (vehicleRegistrNumber != null && !vehicleRegistrNumber.isEmpty() && !vehicleRegistrNumber.isBlank()) {
                this.vehicleRegistrNumber = vehicleRegistrNumber;
            } else {
                this.vehicleRegistrNumber = "х000хх000";
            }
        }

        public boolean isSummerOrWinterTires() {
            return summerOrWinterTires;
        }
        public void setSummerOrWinterTires(boolean summerOrWinterTires) {
            this.summerOrWinterTires = summerOrWinterTires;
        }

            // геттеры и сеттеры вложенного класа
            public Key getKey () {
                return key;
            }
            public void setKey (Key key){
                this.key = key;
            }

            // геттеры и сеттеры встроенного класса
            public Insurance getInsurance() {
                return insurance;
            }

            public void setInsurance (Insurance insurance){
                this.insurance = insurance;
            }

        // метод проверки регистрационного номера на корретность
        public boolean isDigitVehicleRegistrNumber() {
            if (vehicleRegistrNumber.length() != 9) {
                return false;
            }
            char[] chars = vehicleRegistrNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                return false;
            }
            if (!Character.isDigit(chars[1]) ||
                    !Character.isDigit(chars[2]) ||
                    !Character.isDigit(chars[3]) ||
                    !Character.isDigit(chars[6]) ||
                    !Character.isDigit(chars[7]) ||
                    !Character.isDigit(chars[8])) {
                return false;
            }
            return true;
        }

        // метод проверки смены автопокрышек по сезону
        public static void changeSummerOrWinterTires() {

            GregorianCalendar calendar;
            calendar = new GregorianCalendar(2022, Calendar.DECEMBER, 18);
            int month = calendar.get(Calendar.MONTH);
            boolean summerOrWinterTires = (month > 11 || month <= 3);
            if (summerOrWinterTires != summerOrWinterTires) {
                System.out.println("зимняя резина");
            } else {
                System.out.println("летняя резина ");
            }
        }

        // вложенный класс
        public static class Key {
            private final boolean remoteStart; // удаленный запуск двигателя
            private final boolean keylessCarAccess; // бесключевой доступ



            // конструктор вложенного класса с параметрами
            public Key(boolean remoteStart, boolean keylessCarAccess) {
                this.remoteStart = remoteStart;
                this.keylessCarAccess = keylessCarAccess;
            }
            // конструктор по дефолту
            public Key() {
                this(false, false);
            }


            // геттеры вложенного класса
            public  boolean isRemoteStart() {
                return remoteStart;
            }
            public boolean isKeylessCarAccess() {
                return keylessCarAccess;
            }
        }


        // встроенный класс
        public static class Insurance {

            private final LocalDate exppireDate; // срок действия страховки
            private final double cost; // стоимость страховки
            private final String number; // номер страховки


            // конструктор встроенного класса
            public Insurance(LocalDate exppireDate, double cost, String number) {

                if (exppireDate == null) {
                    this.exppireDate = LocalDate.now().plusDays(365);
                } else {
                    this.exppireDate = exppireDate;
                }
                this.cost = cost;

                if (number == null) {
                    this.number = "123456789";
                } else {
                    this.number = number;
                }
            }

            // задали страховку
            public Insurance() {
                this(null, 10_0000, null);
            }

            public LocalDate getExppireDate() {
                return exppireDate;
            }

            public double getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }

            // проверка срока годности страховки
            public void checkExppireDate() {
                if (exppireDate.isBefore(LocalDate.now()) || exppireDate.isEqual(LocalDate.now())) {
                    System.out.println("Нужно оформить новую страховку");
                }
            }
            public void checkNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки не корректный");
                }
            }
        }
        public String toString () {
            return "Автомобиль марки " + getBrand() +
                    ", модель " + getModel() +
                    ", год выпуска " + getProductionYear() +
                    ", страна сборки " + getProductionCountry() +
                    ", тип кузова " + this.carBodyType +
                    ", цвет кузова " + getColor() +
                    ", объем двигателя в литрах " + this.engineVolume +
                    ", коробка передач " + this.transmission +
                    ", регистрационный номер " + this.vehicleRegistrNumber +
                    ", количество мест " + this.numberOfSeats +
                    ", признак автошин ";
        }


    }
















