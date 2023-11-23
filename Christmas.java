public class Christmas {
    public static void main(String[] args) {

        Child andy = new Child("Andy", false);
        Child frank = new Child("Frank", true);

        ChristmasWish dinosaur = new ChristmasWish("dinosaur", "jelly beans");
        ChristmasWish car = new ChristmasWish("toy car", "cotton candy",
                "gift wrap", "yellow");

//        TEST FOR THE CHAIN OF RESPONSIBILITY
        LetterProcessor letterProcessor = new LetterProcessor();

        Letter letter1 = new Letter(andy, dinosaur);
        Letter letter2 = new Letter(frank, car);

        System.out.println("Pre-processing:\n" + letter1);
        letter1 = letterProcessor.process(letter1);
        System.out.println("Post-processing:\n" + letter1);

        System.out.println();

        System.out.println("Pre-processing:\n" + letter2);
        letter2 = letterProcessor.process(letter2);
        System.out.println("Post-processing:\n" + letter2);

        System.out.println();

//        TEST FOR THE BUILDER
        Santa santa = new Santa();

        System.out.println(santa.assemblePresent(letter1));
        System.out.println(santa.assemblePresent(letter2));

        System.out.println();

//        TEST FOR MEDIATOR (AND THE WHOLE SYSTEM IN GENERAL)
        Elf elf = new Elf();
        elf.connectToSanta(santa);
        santa.assignElf(elf);
        andy.assignElf(elf);
        frank.assignElf(elf);
        System.out.println("Once upon a time, Andy wished for dinosaurs. But Andy was a naughty kid and that's how it went:");
        dinosaur = new ChristmasWish("dinosaur", "jelly beans");
        andy.addWish(dinosaur);
        andy.submitWishes();
        System.out.println();
        System.out.println("There was also Frank. Frank was a good kid, he wished for a toy car. Here's how that went:");
        frank.addWish(car);
        frank.submitWishes();
        System.out.println();
        System.out.println("One last child had a letter for Santa that day but there was no elf assigned, so they couldn't even do that :(");
        Child mark = new Child("Mark", false);
        mark.addWish(dinosaur);
        mark.submitWishes();
    }
}
