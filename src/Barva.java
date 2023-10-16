public class Barva {
    protected int r;
    protected int g;
    protected int b;

    public Barva(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String vyjadriBarvu() {
        return "r:" + r + " g:" + g + " b:" + b;
    }
}
