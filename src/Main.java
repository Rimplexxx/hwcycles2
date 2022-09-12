public class Main {
    public static void main(String[] args) {

        //task 1
        int deposits = 29_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposits;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        //task2
        int x = 0;
        while (x < 10) {
            x = x + 1;
            System.out.print(x + " ");
        }
        System.out.println();
        for (x = 10; x >= 1; x--) {
            System.out.print(x + " ");
            System.out.println();
        }

        //task3
        int totalpeople = 12_000_000;
        int humans = 1000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            totalpeople = totalpeople + (totalpeople / humans * (fertility - mortality));
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + totalpeople);
        }

        //task4-6
        int deposits2 = 15_000;
        int total2 = 0;
        int month2 = 0;
        while (month2 <= 108) {
            total2 *= 1.07;
            total2 = total2 + deposits2;
            month2++;

            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + total2 + " рублей");
            }
        }

        //task 7
        int friday = 2;
        for (int days = 0; days <= 31; days++) {
            if (friday == days) {
                friday += 7;
                System.out.println("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчет");
            }
        }

        //task 8
        int after = 2122;
        int before = 1822;
        while (before < after) {
            before = before + 79;
            if (before > after) {
                break;
            } else {
                System.out.println(before);
            }
        }

        //task9
        int two = 2;
        for (int t = 1; t <= 10; t++) {
            System.out.println(two + "*" + t + "=" + two*t);
        }
    }
}