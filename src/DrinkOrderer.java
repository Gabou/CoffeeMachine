class DrinkOrderer {

    String createCommand(Drink drink, int sugar) {

        String command = drink.getLetter();
        command += ":";

        if(sugar != 0) {
            command += sugar;
            command += ":0";
        }else {
            command += ":";
        }

        return command;
    }

    String sendMessage(String message) {
        return "M:" + message;
    }
}
