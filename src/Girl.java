public class Girl {

    private String name;
    private Diamond diamond = new Diamond();

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void compareDiamonds(int size, double value) {
        diamond.compareValue(size, value);
    }

    public int getDiamondSize() {
        return diamond.getSize();
    }

    public double getDiamondValue() {
        return diamond.getValue();
    }

    public void setDiamondSize(int size) {
        diamond.setSize(size);
    }
}
