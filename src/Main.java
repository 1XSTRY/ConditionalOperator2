public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
        //task4();
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


}