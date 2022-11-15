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

        //Проверка суммы пополнения меньше 1000
        int testInitialAmount = 400;
        int testAddedAmount = 900;
        int testFinalAmount = testInitialAmount + testAddedAmount;
        int testBonusAmount;
        if (testAddedAmount > 1000) {
            testBonusAmount = testAddedAmount / 100;
        } else {
            testBonusAmount = 0;
        }
        int testFinalAmoutWithBonus = testInitialAmount + testAddedAmount + testBonusAmount;
        System.out.println("Начальная сумма на счету: " + testInitialAmount + " рублей");
        System.out.println("Сумма пополнения: " + testAddedAmount + " рублей");
        System.out.println("Сумма на счету после пополнения: " + testFinalAmount + " рублей");
        System.out.println("Бонусные рубли: " + testBonusAmount + " рублей");
        System.out.println("Итоговая сумма на счету клиента: " + testFinalAmoutWithBonus + " рублей");

        //Проверка суммы пополнения 1000
        int SecondTestInitialAmount = 400;
        int SecondTestAddedAmount = 1000;
        int SecondTestFinalAmount = SecondTestInitialAmount + SecondTestAddedAmount;
        int SecondTestBonusAmount;
        if (SecondTestAddedAmount > 1000) {
            SecondTestBonusAmount = testAddedAmount / 100;
        } else {
            SecondTestBonusAmount = 0;
        }
        int SecondTestFinalAmoutWithBonus = SecondTestInitialAmount + SecondTestAddedAmount + SecondTestBonusAmount;
        System.out.println("Начальная сумма на счету: " + SecondTestInitialAmount + " рублей");
        System.out.println("Сумма пополнения: " + SecondTestAddedAmount + " рублей");
        System.out.println("Сумма на счету после пополнения: " + SecondTestFinalAmount + " рублей");
        System.out.println("Бонусные рубли: " + SecondTestBonusAmount + " рублей");
        System.out.println("Итоговая сумма на счету клиента: " + SecondTestFinalAmoutWithBonus + " рублей");
    }
}





