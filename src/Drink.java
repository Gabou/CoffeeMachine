public enum Drink {

    TEA("tea","T",0.4),
    COFFEE("coffee","C",0.6),
    CHOCOLATE("chocolate","H",0.5),
    ORANGE_JUICE("orange juice","O",0.6);


    private String name;
    private String letter;
    private double price;

    Drink(String name, String letter, double price) {
        this.name = name;
        this.letter = letter;
        this.price = price;
    }

    public String getLetter() {
        return letter;
    }

    public double getPrice() {
        return price;
    }
}
