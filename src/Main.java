public class Main {
    public static void main(String[] args) {

        int check = 250; // начальный счет клиента
        int add = 1750; // пополнение счета клиента
        int fullCheck = check + add; // полный счет клиента

        boolean addCheck = fullCheck > 1000;
        int bonus;
        if (addCheck) {
            bonus = fullCheck / 100;
        } else {
            bonus = 0;
        }
        System.out.println((bonus) + " сумма бонуса");
        System.out.println((fullCheck + bonus) + " итоговая сумма");
    }
}
