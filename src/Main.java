public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        byte table = 1;
        int pencil = 8;
        short box = 5;
        long  brick = 500L;
        float cereal = 2.5f;
        double saltWeight = 5.5;
        boolean boxHeaver = box < 10;

        //Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double werightOfAllBoxers = boxer1 + boxer2;
        double werightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксёров=" + werightOfAllBoxers);
        System.out.println("Разница в весе боксёров=" + werightDifference);

        //Задание 3
        int banana = 80;
        int milk =105;
        int iceCream = 100;
        int egg = 70;
        int weightGram = banana * 5 + milk * 2 + iceCream * 2 + egg *4;
        System.out.println("вес в граммах -" + weightGram);
        System.out.println("вес в клограммах -" + (double) weightGram/ 1000);

        // Задание 4
        int weightDeal = 7000;
        int dietFirst = 250;
        int dietSecound = 500;
        System.out.println("Спортсмен сбросит 7 кг через -"+ weightDeal / dietFirst + "дней");
        System.out.println("Спортсмен сбросит 7кг через -" + weightDeal / dietSecound + "дней");

        // Задание 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristySalary = 76230;
        int increasedSalaryMasha = mashaSalary / 100 * 10 + mashaSalary;
        int increasedSalaryDenis = denisSalary / 100 * 10 + denisSalary;
        int increasedSalaryKristy = kristySalary / 100 * 10 +kristySalary;
        System.out.println("разница в годовом доходе Маши составляет -" + (increasedSalaryMasha - mashaSalary)* 12);
        System.out.println("разница в годовом доходе Дениса составляет -" + (increasedSalaryDenis - denisSalary)* 12);
        System.out.println("разница в годовом доходе Кристиы составляет -" + (increasedSalaryKristy) * 12);
        ;
    }
}