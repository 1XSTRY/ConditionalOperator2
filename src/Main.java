public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        task3();
        task4();
       //task5();
    }
    public static void task1 (){
        char iOS = 0;
        char android = 1;
        int clientOs =1;
        char oldModel = 2014;
        char newModel = 2023;
        int clientModel = 2014;

        if (clientOs == 1 && clientModel >= 2015){
            System.out.println("Установите версию приложения для android по ссылке");
        }else if (clientOs == 0 && clientModel >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOs == 1 && clientModel < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (clientOs == 0 && clientModel < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void task3 (){
        int year = 2021;

        if (year >= 1584 && year % 4 == 0) {
            System.out.println(year + " является високосным годом");
        }
            else {
            System.out.println(year + " не является високосным годом");
        }



    }
    public static void task4 (){
        int deliveryDistance = 95;
        int days = getDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }

    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


}