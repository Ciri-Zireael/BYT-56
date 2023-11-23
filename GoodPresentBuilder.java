public class GoodPresentBuilder implements ChristmasPresentBuilder {

    ChristmasPresent present;
    ChristmasWish wish;

    GoodPresentBuilder() {
    }

    @Override
    public void selectPackaging() {
        present.setPackagingColor(wish.packagingColor);
        present.setPackagingType(wish.packagingType);
    }

    @Override
    public void addToy() {
        present.setToy(wish.toy);
    }

    @Override
    public void addCandy() {
        present.setCandy(wish.candy);
    }

    @Override
    public ChristmasPresent getPresent(ChristmasWish wish) {
        this.wish = wish;
        present = new ChristmasPresent();
        selectPackaging();
        addToy();
        addCandy();
        return present;
    }
}
