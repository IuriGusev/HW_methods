public class Main {
    public static boolean main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        private static void printIsLeap ( int Year){
            return (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0);
            System.out.println(printIsLeap(2022) ? "високосный" : "не високосный");
        }

        //Task 2
        private static void printMessage ( int productionYear, int OS){
            if (OS == 0) {
                if (productionYear < 2015) {
                    System.out.println("Установить облегченную версия IOS");
                } else {
                    System.out.println("Установить IOS по ссылке");
                }
            } else {
                if (productionYear < 2015) {
                    System.out.println("Установить облегченную версию Android");
                } else {
                    System.out.println("Установить Android по ссылке");
                }
            }
            System.out.println(printMessage(2022, 1));
        }

        //Task 3
        private static void printCalculateDeliveryDays ( int distance);
        {
            int distance = 200;
            int start = 20;
            int step = 40;
            int result = 1; //кол-во дней
            if (distance >= start) {
                result = (Math.abs((distance - start) / step) + 2);
            }
            System.out.println("Постребуется дней для доставки:" + printCalculateDeliveryDays(200));
        }
    }
}