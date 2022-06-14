public class Main {
    public static void main(String[] args) {

        int schet = 250; // начальный счет клиента
        int add = 750; // пополнение счета клиента
        int fullSchet = schet + add; // полный счет клиента

        boolean addSchet = fullSchet > 1000;
        int bonus;
        if (addSchet == true) {
            bonus = fullSchet / 100;
        } else {
            bonus = 0;
        }
        System.out.println((bonus) + " сумма бонуса");
        System.out.println((fullSchet + bonus) + " итоговая сумма");
    }
}
