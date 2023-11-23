public interface LetterHandler {
    void setNext(LetterHandler handler);
    Letter handle(Letter letter);
}
