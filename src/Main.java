import java.time.LocalDate;

public class Main {
    public static boolean Сheckingleap(int yearMethod) { // метод проверяет високосность года
        if (yearMethod % 100 == 0) {
            return (false);
        } else if (yearMethod % 400 == 0 || yearMethod % 4 == 0) { //
            return true;
        } else {
            return false;
        }
    }

    public static void task1() {
        System.out.println("=========================   ");
        System.out.println("Задача 1");
        int year = 1900;
        if (Сheckingleap(year)) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }
    }

    public static int сheckDevice(int OS, int year) { // проверка девайса
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && year < currentYear) {
            return 1;
        } else if (OS == 1 && year < currentYear) {
            return 2;
        } else if (OS == 0 && year >= currentYear) {
            return 3;
        } else if (OS == 1 && year >= currentYear) {
            return 4;
        } else {
            return 5;
        }
    }

    public static void task2() {
        System.out.println("=========================   ");
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        if (сheckDevice(clientOS, clientDeviceYear) == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (сheckDevice(clientOS, clientDeviceYear) == 2) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (сheckDevice(clientOS, clientDeviceYear) == 3) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (сheckDevice(clientOS, clientDeviceYear) == 4) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (сheckDevice(clientOS, clientDeviceYear) == 5) {
            System.out.println("Неизвестная операционная система.");
        }
    }

    public static int deliveryTimeCalculation(int distance) { // Расчет времени доставки
        int deliveryTime = 1;
        if (distance <= 20) {
            return deliveryTime;
        } else if (distance > 20 && distance <= 60) {
            deliveryTime++;
            return deliveryTime;
        } else if (distance > 60 && distance <= 100) {
            deliveryTime += 2;
            return deliveryTime;
        } else {
            return 4;
        }

    }

    public static void task3() {
        System.out.println("=========================   ");
        System.out.println("Задача 3");
        int deliveryDistance = 111;
        if (deliveryTimeCalculation(deliveryDistance) <= 3) {
            System.out.println(" Потребуется дней: " + deliveryTimeCalculation(deliveryDistance));
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
