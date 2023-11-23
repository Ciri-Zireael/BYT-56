public class LetterCandyHandler extends BaseLetterHandler {
    @Override
    public Letter handle(Letter letter) {
        if (letter.wish.candy == null)
            letter.wish.setCandy("chocolate");
        return super.handle(letter);
    }
}
