class DrinkOrderer {

    private static final String MESSAGE_DELIMITER = ":";
    private History history;

    DrinkOrderer() {
        history = new History();
    }

    String createCommand(Drink drink, int sugar, double money, boolean extraHot) {

        if (money < drink.getPrice()) {
            return sendMessage("Missing " + (drink.getPrice() - money) + " dollar");
        }

        StringBuilder command = new StringBuilder();

        command.append(drink.getLetter());
        if (extraHot) {
            command.append("h");
        }
        command.append(MESSAGE_DELIMITER);

        if(sugar != 0) {
            command.append(sugar);
            command.append(":0");
        }else {
            command.append(MESSAGE_DELIMITER);
        }

        history.addDrink(drink);
        return command.toString();
    }

    String sendMessage(String message) {
        return "M:" + message;
    }

    void displayHistory() {
        System.out.println(history.getHistory());
    }

}
