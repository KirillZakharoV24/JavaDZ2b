public class DZ2b {
    public static void main(String[] args) {

        //Начальная сумма
        int currentBalance = 100;

        //Сумма пополнения
        int replenishmentAmount = 10000;

        //Бонусные рубли
        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100);

        } else {
            bonus = 0;
        }

        //Итоговая сумма
        int totalAmount = currentBalance + replenishmentAmount + bonus;

        System.out.println("Итоговая сумма: " + totalAmount + " рублей ");
        System.out.println("Количество бонусных рублей: " + bonus);
    }


}
