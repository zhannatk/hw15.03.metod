public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 401;
        checkLeapYear(year);


        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        switch (checkOS(clientOS, clientDeviceYear)) {
            case 1:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 2:

                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 3:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            case 4:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для вас ничего нет");
        }


        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        countDeliveryDays(deliveryDays);

    }


    public static void checkLeapYear(int year) { // задача 1

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }


    public static int checkOS(int clientOS, int year) { // задача 2
        if (clientOS == 0) {
            if (year < 2023) {
                return 1;
            } else {
                return 2;
            }
        } else if (clientOS == 1) {
            if (year < 2023) {
                return 3;
            } else {
                return 4;
            }
        } else return 0;
    }

    public static int countDeliveryDays(int deliveryDistance) { // задача 3
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
        }
        if (deliveryDistance > 20 || deliveryDistance <= 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 || deliveryDistance <= 100) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays + " срок доставки.");
        }

        return deliveryDays;
    }
}


