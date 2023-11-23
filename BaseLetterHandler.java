public abstract class BaseLetterHandler implements LetterHandler {
    LetterHandler next;
    public BaseLetterHandler() {
    }

    @Override
    public void setNext(LetterHandler handler) {
        next = handler;
    }

    @Override
    public Letter handle(Letter letter) {
        if (next != null)
            next.handle(letter);
        return letter;
    }
}
