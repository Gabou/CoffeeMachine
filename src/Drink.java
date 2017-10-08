public enum Drink {

    TEA("tea","T"),
    COFFEE("coffee","C"),
    CHOCOLATE("chocolate","H");


    private String name;
    private String letter;

    Drink(String name, String letter) {
        this.name = name;
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public String getLetter() {
        return letter;
    }
}
