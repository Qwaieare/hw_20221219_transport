package Transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car ("Lada", "Grande", 2015, "Россия", "лифтбек", "желтый",  1.7, "МКПП",  "м976мм125", 5);


        Car car2 = new Car("Audi A8", "50 L TDI quattro", 2020, "Германия", "седан", "черный", 3.0, "АКПП", "у048но797", 5);

        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "купе", "черный", 3.0, "АКПП", "у049но797", 5);

        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Ю.Корея", "внедорожник", "красный", 2.4, "АКПП", "у050но797", 5);

        Car car5 = new Car("Hyundai", "Avante", 2016, "Ю.Корея", "седан", "оранжевый", 1.6, "МКПП", "у051но797", 5);

                System.out.println(car1);
                System.out.println(car2);
                System.out.println(car3);
                System.out.println(car4);
                System.out.println(car5);
                Car.changeSummerOrWinterTires();
            }
            private static void printInfo(Car car) {

                System.out.println(car.getKey().isKeylessCarAccess() ? "безключевой доступ" : "ключевой доступ" +
                        ", " + (car.getKey().isRemoteStart() ? "удаленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость страховки: " + car.getInsurance().getCost() +
                        ", срок действия страховки: " + car.getInsurance().getExppireDate());
            }


    }
