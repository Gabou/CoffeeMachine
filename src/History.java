import java.util.ArrayList;
import java.util.List;

class History {

    private List<Drink> drinks = new ArrayList<>();

    private String getTotalConsumedDrinks() {
        StringBuilder consummedDrinks = new StringBuilder();

        for (Drink drink : Drink.values()) {
            consummedDrinks.append(drink.getLetter()).append(":");
            consummedDrinks.append(drinks.stream().filter(x -> drink.getLetter().equals(x.getLetter())).count()).append(" ");
        }
        return consummedDrinks.toString();
    }

    private double getTotalEarnedMoney() {
        return drinks.stream().mapToDouble(Drink::getPrice).sum();
    }

    String getHistory(){
        return getTotalConsumedDrinks() + getTotalEarnedMoney();
    }

    void addDrink(Drink drink) {
        drinks.add(drink);
    }
}
