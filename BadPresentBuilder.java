public class BadPresentBuilder implements ChristmasPresentBuilder{

    ChristmasPresent present;

    BadPresentBuilder() {
    }
    @Override
    public void selectPackaging() {
        present.setPackagingColor("brown");
        present.setPackagingType("gift bag");
    }

    @Override
    public void addToy() {
        present.setToy("twig");
    }

    @Override
    public void addCandy() {
        present.setCandy("coal");
    }

    @Override
    public ChristmasPresent getPresent(ChristmasWish wish) {
        present = new ChristmasPresent();
        selectPackaging();
        addToy();
        addCandy();
        return present;
    }
}
