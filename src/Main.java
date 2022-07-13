public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int replenish = 1150;
        int bonus = (balance + replenish) / 100;
        if (replenish <= 1000){
            bonus = 0;
        }
        int total = balance + replenish;
        System.out.println ("Итоговый счёт" + total);
        System.out.println ("Количество бнусов" + bonus);

    }
}
