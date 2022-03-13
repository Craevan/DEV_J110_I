public class PublishingHouse {

    private String city;
    private String name;

    public PublishingHouse(String name, String city) {
        setName(name);
        setCity(city);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null)
            throw new IllegalArgumentException("!!! Пустая ссылка !!!");
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("!!! Пустая ссылка !!!");
        this.name = name;
    }
}
