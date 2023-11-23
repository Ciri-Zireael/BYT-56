public class Santa extends InterestedParty {
    ChristmasPresentBuilder goodBuilder = new GoodPresentBuilder();
    ChristmasPresentBuilder badBuilder = new BadPresentBuilder();

    public Santa() {
    }

    public void getLetter(Letter letter) {
        System.out.println("Santa received the letter");
        ChristmasPresent present = assemblePresent(letter);
        System.out.println("Santa assembled a present");
        present = addressPresent(present, letter.author);
        sendPresent(present);
    }

    public ChristmasPresent assemblePresent(Letter letter) {
        ChristmasPresent present;
        if (letter.author.wasGood)
            present = goodBuilder.getPresent(letter.wish);
        else
            present = badBuilder.getPresent(letter.wish);
        return present;
    }

    public ChristmasPresent addressPresent(ChristmasPresent present, Child child) {
        present.setReceiver(child);
        return present;
    }

    private void sendPresent(ChristmasPresent present) {
        System.out.println("Santa sent out the present");
        elf.deliverPresent(present);
    }
}
