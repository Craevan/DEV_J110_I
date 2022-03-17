public class Main {
    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        PublishingHouse prospect = new PublishingHouse("Проспект", "Москва");
        PublishingHouse piter = new PublishingHouse("Питер", "Санкт-Петербург");
        PublishingHouse bxv = new PublishingHouse("БХВ", "Санкт-Петебург");        // ошибка сделана намеренно
        PublishingHouse dialectika = new PublishingHouse("Диалектика", "Киев");

        Books[] books = new Books[ARRAY_SIZE];
        books[0] = new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных",
                new String[]{"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter);

        books[1] = new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное",
                "Вигерс Карл", 2019, piter);

        books[2] = new Books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, dialectika);
        books[3] = new Books("C/C++. Процедурное программировани", "Полубенцева М.И.", 2017, bxv);
        books[4] = new Books("Конституция РФ", 2017, prospect);

        Books.printAll(books);

        for (Books book : books) {
            if (book.getPh().getCity().equals("Санкт-Петебург"))
                book.getPh().setCity("Санкт-Петербург");
        }
        System.out.println("===========================================================================");

        Books.printAll(books);
    }

}
