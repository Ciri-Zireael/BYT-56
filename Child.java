import java.util.ArrayList;
import java.util.List;

public class Child extends InterestedParty{
    String name;
    boolean wasGood;
    ArrayList<ChristmasWish> wishList;

    public Child(String name, boolean wasGood) {
        this.name = name;
        this.wasGood = wasGood;
        wishList = new ArrayList<>();
    }

    public void addWish(ChristmasWish wish) {
        wishList.add(wish);
    }

    public void submitWishes() {
        for (ChristmasWish wish : wishList)
            sendLetter(wish);
    }

    private void sendLetter(ChristmasWish wish) {
        if (elf == null) {
            System.out.println("There's no elf assigned to this kid which means no sending the letter. What a terrible oversight");
            return;
        }
        Letter letter = new Letter(this, wish);
        System.out.println(name + " sent a letter:\n" + letter);
        elf.deliverLetter(letter);
    }

    public void receivePresent(ChristmasPresent present) {
        System.out.println(name + " received a present:\n\t" + present);
    }

    @Override
    public String toString() {
        return name;
    }
}
