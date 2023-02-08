public class Main {
    public static void main(String[] args) {
        System.out.println("Задач1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS2 == 1) {
            System.out.println("Установите версию приложения для IOS по ссыылке");
        } else if (clientDeviceYear < 2015 && clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS2 == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задача3");
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год  является високосным");
        } else {
            System.out.println(year + " год  не является високосным");
        }
        System.out.println("Задача4");
        int deliveryDistance = 95;
        int distance20 = 20;
        int distance60 = distance20 + 20;
        int distance100 = distance60 + 20;
        int maxDistance = 101;
        if (deliveryDistance <= distance20) {
            System.out.println("Потребуется дней " + (distance20 / distance20));
        } else if (deliveryDistance > distance20 && deliveryDistance <= distance100) {
            System.out.println("Потребуется дней " + (distance60 / distance20));
        } else if (deliveryDistance > distance100 && deliveryDistance < maxDistance) {
            System.out.println("Потребуется дней " + (distance100 / distance20));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача5");
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Укажите месяц");

        }
    }
}