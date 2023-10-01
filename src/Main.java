public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 (){
        char iOS = 0;
        char android = 1;
        int clientOs =1;

        if (clientOs == android){
            System.out.println("Установите версию приложения для android по ссылке");
        }else if (clientOs == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2 (){
        char iOS = 0;
        char android = 1;
        int clientOs =1;
        char oldModel = 2015;
        int clientModel = 2013;

        if (clientOs == android && clientModel >= oldModel){
            System.out.println("Установите версию приложения для android по ссылке");
        }else if (clientOs == iOS && clientModel >= oldModel) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOs == android && clientModel < oldModel) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (clientOs == iOS && clientModel < oldModel) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void task3 (){
        int year = 2021;

        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        }
        else {
            System.out.println(year + " не является високосным годом");
        }




    }
    public static void task4 (){
        int deliveryDistance = 95;
        int deliveryTime;

        if (deliveryDistance >=1 && deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = -1;
        }

        if (deliveryTime != -1) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка невозможна");
        }
    }
    public static void task5 (){
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.err.println("Номер месяца должен быть от 1 до 12.");
        }
    }


}