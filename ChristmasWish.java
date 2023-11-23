public class ChristmasWish {
    String toy;
    String candy;
    String packagingType;
    String packagingColor;

    public ChristmasWish(String toy, String candy) {
        this.toy = toy;
        this.candy = candy;
    }

    public ChristmasWish(String toy, String candy, String packagingType, String packagingColor) {
        this.toy = toy;
        this.candy = candy;
        this.packagingType = packagingType;
        this.packagingColor = packagingColor;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public String getPackagingColor() {
        return packagingColor;
    }

    public void setPackagingColor(String packagingColor) {
        this.packagingColor = packagingColor;
    }

    @Override
    public String toString() {
        String packaging = "any packaging";
        if (packagingType != null && packagingColor != null)
            packaging = packagingColor + " " + packagingType;
        return toy + " and " + candy +
                " in " + packaging;
    }
}
