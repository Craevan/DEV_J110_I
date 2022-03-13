public class Main {

    public static void main(String[] args) {
        Countries[] countries = {new Countries("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                                new Countries("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                                new Countries("France", 643_800, 67_800_000, "Paris", 2_100_000),
                                new Countries("Andora", 467_000, 85_400, "Andora la Vella", 22_600),
                                new Countries("Singapore", 725_000, 5_700_000),

                                new Countries("Тест_нет_населения", 900_000, "Столица"),
                                new Countries("Тест_нет_населения и столицы", 800_000)};

        Countries.printAll(countries);

        // Тест метода для расчета плотности населения

        for (Countries someCountry : countries) {
            System.out.printf("Плотность %s равна %.2f жителей на кв. км.\n",someCountry.getName(), someCountry.densityOfPopulation());
        }
    }
}
