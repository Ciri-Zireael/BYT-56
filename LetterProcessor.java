public class LetterProcessor {
    LetterHandler baseHandler;
    LetterHandler toyHandler;
    LetterHandler candyHandler;
    LetterHandler packagingHandler;
    public LetterProcessor() {
        baseHandler = new BaseLetterHandler(){};
        toyHandler = new LetterToyHandler();
        candyHandler = new LetterCandyHandler();
        packagingHandler = new LetterPackagingHandler();

        baseHandler.setNext(toyHandler);
        toyHandler.setNext(candyHandler);
        candyHandler.setNext(packagingHandler);
    }

    public Letter process(Letter letter) {
        return baseHandler.handle(letter);
    }
}
