public class Diamond {

    private double value;
    private int size;

    public Diamond() {
        size = -1;
        value = 0;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }

    public void compareValue(int newSize, double newValue) {
        if (newValue > value) {
            value = newValue;
            size = newSize;
            System.out.println("Woohoo, the girl took the diamond");
        }
        else {
            System.out.println("Aaargh, the diamond was rejected");
        }
    }
}
