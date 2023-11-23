public class LetterToyHandler extends BaseLetterHandler {
    @Override
    public Letter handle(Letter letter) {
        if (letter.wish.toy == null)
            letter.wish.setToy("teddy bear");
        return super.handle(letter);
    }
}
