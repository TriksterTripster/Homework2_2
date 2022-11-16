public class Main {

    public static void main(String[] args) {
        int initialAccount = 300;
        int add = 1300;

        int bonus = 0;
        if (add > 1000) {
         bonus =  add / 100;
        }
        int finalAccount = initialAccount + add + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " +finalAccount);





    }
}
