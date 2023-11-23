public class LetterPackagingHandler extends BaseLetterHandler {
    @Override
    public Letter handle(Letter letter) {
        if (letter.wish.packagingType == null)
            letter.wish.setPackagingType("gift box");
        if (letter.wish.packagingColor == null)
            letter.wish.setPackagingColor("red and green");
        return super.handle(letter);
    }
}
