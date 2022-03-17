public class Countries {

    private String name;
    private double square;
    private int population;
    private String capitalName;
    private int capitalPopulation;

    public Countries(String name, double square) {
        setName(name);
        setSquare(square);
    }

    public Countries(String name, double square, String capitalName) {
        setName(name);
        setSquare(square);
        setCapitalName(capitalName);
    }

    public Countries(String name, double square, int population, String capitalName, int capitalPopulation) {
        setName(name);
        setSquare(square);
        setPopulation(population);
        setCapitalName(capitalName);
        setCapitalPopulation(capitalPopulation);
    }

    public Countries(String name, double square, int population) {
        setName(name);
        setSquare(square);
        setPopulation(population);

        capitalName = null;
        capitalPopulation = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException(Constants.NULL.toString());
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square <= 0)
            throw new IllegalArgumentException(Constants.NEGATIVE_OR_ZERO.toString());
        this.square = square / 1000.0;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0)
            throw new IllegalArgumentException(Constants.NEGATIVE_OR_ZERO.toString());
        this.population = population / 1000;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        if (capitalName == null)
            throw new IllegalArgumentException(Constants.NULL.toString());
        this.capitalName = capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(int capitalPopulation) {
        if (capitalPopulation <= 0)
            throw new IllegalArgumentException(Constants.NEGATIVE_OR_ZERO.toString());
        this.capitalPopulation = capitalPopulation / 1000;
    }

    public double densityOfPopulation() {
        return getPopulation() / getSquare();
    }

    public void print() {

        if (getCapitalName() == null && getPopulation() != 0) {
            System.out.println(getName() + ": "
                    + getSquare() + Constants.SQUARE
                    + getPopulation() + Constants.POPULATION);
        }

        else if (getPopulation() == 0) {
            if (getCapitalName() == null) {
                System.out.println(getName() + ": "
                        + getSquare() + Constants.SQUARE
                        + Constants.UNKNOWN_POPULATION);
            }
            else {
                System.out.println(getName() + ": "
                        + getSquare() + Constants.SQUARE
                        + Constants.UNKNOWN_POPULATION
                        + getCapitalName() + "; "
                        + Constants.UNKNOWN_POPULATION);
            }
        }

        else {
            System.out.println(getName() + ": "
                    + getSquare() + Constants.SQUARE
                    + getPopulation() + Constants.POPULATION
                    + getCapitalName() + "; "
                    + getCapitalPopulation() + Constants.POPULATION);
        }

    }

    public static void printAll(Countries[] countries) {
        for (Countries country : countries)
            country.print();
    }

    private enum Constants {
        NULL("Пустая ссылка на строку."),
        NEGATIVE_OR_ZERO("Число должно быть больше ноля."),
        POPULATION(" тыс. чел.; "),
        SQUARE(" тыс. кв. км.; "),
        UNKNOWN_POPULATION("население неизвестно; ");

        private final String title;

        Constants(String title) {
            this.title = title;
        }

        private String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return getTitle();
        }
    }

}
