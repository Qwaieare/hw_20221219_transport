package Transport;

import java.security.Key;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "лифтбек", "желтый", 1.7, "МКПП", "м976мм125", 5, 175, new Car.Key(), new Car.Insurance());
        Car car2 = new Car("Audi A8", "50 L TDI quattro", 2020, "Германия", "седан", "черный", 3.0, "АКПП", "у048но797", 5, 300, new Car.Key(), new Car.Insurance());
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "купе", "черный", 3.0, "АКПП", "у049но797", 5, 300, new Car.Key(), new Car.Insurance());
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Ю.Корея", "внедорожник", "красный", 2.4, "АКПП", "у050но797", 5, 245, new Car.Key(), new Car.Insurance());
        Car car5 = new Car("Hyundai", "Avante", 2016, "Ю.Корея", "седан", "оранжевый", 1.6, "МКПП", "у051но797", 5, 275, new Car.Key(), new Car.Insurance());

        System.out.println("АВТОМОБИЛИ:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        Car.changeSummerOrWinterTires();

        System.out.println();
        System.out.println("АВТОБУСЫ:");
        Bus bus1 = new Bus("ПАЗ", "32053", "Россия", 2010, "белый", 95);
        Bus bus2 = new Bus("ПАЗ", "320405-04", "Россия", 2018, "белый", 100);
        Bus bus3 = new Bus("КАВЗ", "4235 АВРОРА", "Россия", 2016, "красный", 100);

        bus1.printTransport();
        bus2.printTransport();
        bus3.printTransport();

        System.out.println();
        System.out.println(Car.getKey().isKeylessCarAccess() ? "безключевой доступ" : "ключевой доступ" +
                ", " + (Car.getKey().isRemoteStart() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки: " + Car.getInsurance().getNumber() +
                ", стоимость страховки: " + Car.getInsurance().getCost() +
                ", срок действия страховки: " + Car.getInsurance().getExppireDate());
    }


}

















