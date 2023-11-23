import java.util.Objects;

public class Elf implements AbstractElf {
    LetterProcessor letterProcessor;
    Santa santa;

    public Elf() {
        letterProcessor = new LetterProcessor();
    }

    @Override
    public void deliverLetter(Letter letter) {
        System.out.println("Elf received the letter from " + letter.author.name);
        String original = letter.toString();
        Letter processedLetter = letterProcessor.process(letter);
        if (Objects.equals(original, processedLetter.toString())) {
            System.out.println("Letter was fine and there was no need for adjustments");
        }
        else
            System.out.println("Letter got processed:\n" + processedLetter);
        if (santa != null) {
            System.out.println("Elf passed on the letter to Santa");
            santa.getLetter(processedLetter);
        }
        else
            System.out.println("Sorry, Santa seems unavailable at the moment. Letter couldn't get delivered");
    }

    @Override
    public void deliverPresent(ChristmasPresent present) {
        System.out.println("Elf received the present and passed it on to " + present.receiver.name);
        present.receiver.receivePresent(present);
    }

    public void connectToSanta(Santa santa) {
        this.santa = santa;
    }
}
