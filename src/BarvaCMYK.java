public class BarvaCMYK extends BarvaRGB {
    private double c;
    private double m;
    private double y;
    private double k;

    public BarvaCMYK(double c, double m, double y, double k) {
        super((int)((1.0 - c) * (1.0 - k) * 255), (int)((1.0 - m) * (1.0 - k) * 255), (int)((1.0 - y) * (1.0 - k) * 255));
        this.c = c;
        this.m = m;
        this.y = y;
        this.k = k;
    }

    public double vypocetIntenzity() {
        return (1.0 - c) * (1.0 - k);
    }

    public String vyjadriBarvuCMYK() {
        return "c:" + c + " m:" + m + " y:" + y + " k:" + k;
    }
}