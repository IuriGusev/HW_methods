import java.time.Year;

public class Main {
    public static void main(String[] args) {
        printIsLeap(2022);
        printMessage(2022, 0);
        printCalculateDeliveryDays (110);

    }
        //Task 1
        public static void printIsLeap ( int Year) {
            if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){
                System.out.println("високосный");
        } else {
            System.out.println("не високосный");}
        }

        //Task 2
        public static int printMessage (int productionYear, int OS){
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
            return productionYear;
        }

    //Task 3
    public static void printCalculateDeliveryDays(int deliveryDistance) {
            int intervalDistance = 40;
            int startDistance = 20;
            int deliveryDays = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставка не осуществляется");
        } else {
            deliveryDays = deliveryDays + ((deliveryDistance - startDistance) / intervalDistance) + 1;
        }
            System.out.println("Потребуется дней " + deliveryDays);
        }
}