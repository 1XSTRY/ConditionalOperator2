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

        if (clientOs == 1){
            System.out.println("Установите версию приложения для " + android +" по ссылке");
        }else {
            System.out.println("Установите версию приложения для " + iOS + " по ссылке");
        }
    }


}