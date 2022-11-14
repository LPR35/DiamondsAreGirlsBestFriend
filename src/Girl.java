public class Girl {

    private String name;
    private Diamond aDiamond = new Diamond();

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void compareDiamonds(int size, double value) {
        aDiamond.compareValue(size, value);
    }

    public int getDiamondSize() {
        return aDiamond.getSize();
    }

    public double getDiamondValue() {
        return aDiamond.getValue();
    }

    public void setDiamondSize(int size) {
        aDiamond.setSize(size);
    }
}
