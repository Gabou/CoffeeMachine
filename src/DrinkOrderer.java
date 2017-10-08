class DrinkOrderer {

    private static final String MESSAGE_DELIMITER = ":";

    String createCommand(Drink drink, int sugar, double money, boolean extraHot) {

        if (money < drink.getPrice()) {
            return sendMessage("Missing " + (drink.getPrice() - money) + " dollar");
        }

        String command = drink.getLetter();
        if (extraHot) {
            command+= "h";
        }
        command += MESSAGE_DELIMITER;

        if(sugar != 0) {
            command += sugar;
            command += ":0";
        }else {
            command += MESSAGE_DELIMITER;
        }

        return command;
    }

    String sendMessage(String message) {
        return "M:" + message;
    }

}
