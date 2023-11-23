public class Letter {
    Child author;
    ChristmasWish wish;

    public Letter(Child author, ChristmasWish wish) {
        this.author = author;
        this.wish = wish;
    }

    @Override
    public String toString() {
        return "Dear Santa, " +
                "\nI wish for " + wish +
                "\n" + author.name +
                "\n~";
    }
}
