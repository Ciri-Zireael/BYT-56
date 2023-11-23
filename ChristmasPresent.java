public class ChristmasPresent {
    Child receiver;
    String toy;
    String candy;
    String packagingType;
    String packagingColor;

    public ChristmasPresent() {
    }

    public Child getReceiver() {
        return receiver;
    }

    public void setReceiver(Child receiver) {
        this.receiver = receiver;
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
        String rec = "";
        if (receiver != null)
            rec = "Present for " + receiver + ":\n";
        return rec + "\t" + toy + " and " + candy + " in " + packagingColor + " " + packagingType;
    }
}
