public class Main {
    public static void main(String[] args) {
        //проверка суммы пополнения больше 1000
        int initialAmount = 400;
        int addedAmount = 1100;
        int finalAmount = initialAmount + addedAmount;
        int bonusAmount;
        if (addedAmount > 1000) {
            bonusAmount = addedAmount / 100;
        } else {
            bonusAmount = 0;
        }
        int finalAmoutWithBonus = initialAmount + addedAmount + bonusAmount;
        System.out.println("Начальная сумма на счету: " + initialAmount + " рублей");
        System.out.println("Сумма пополнения: " + addedAmount + " рублей");
        System.out.println("Сумма на счету после пополнения: " + finalAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
        System.out.println("Итоговая сумма на счету клиента: " + finalAmoutWithBonus + " рублей");
    }
}





