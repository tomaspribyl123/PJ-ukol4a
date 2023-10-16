public class BarvaRGB1 extends BarvaRGB{
    public BarvaRGB1(int r, int g, int b) {
        super(r, g, b);
    }

    public double vypocetIntenzity() {
        return (r + g + b) / 3.0;
    }
}