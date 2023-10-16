public class BarvaRGB2 extends BarvaRGB{
    public BarvaRGB2(int r, int g, int b) {
        super(r, g, b);
    }

    public double vypocetIntenzity() {
        return 0.3 * r + 0.59 * g + 0.11 * b;
    }
}