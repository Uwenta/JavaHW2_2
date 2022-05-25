public class Main {
    public static void main(String[] args) {

        int mobileAccount = 100; // начальная сумма на счете
        int addSum = 1_100; // сумма пополнения
        int oneBonus = 100; // 1 бонус дают за эту сумму

        // mobileAccount = (addSum > 1000) ? mobileAccount + addSum + (addSum / oneBonus) : mobileAccount + addSum;
        //альтернативный расчет суммы на счете

        int bonus = (addSum > 1_000) ? addSum / oneBonus : 0;
        mobileAccount = mobileAccount + addSum + bonus;
        System.out.println("Итоговый счет: " + mobileAccount + "  Бонус: " + bonus);

    }
}