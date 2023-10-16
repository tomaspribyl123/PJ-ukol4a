// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BarvaRGB1 barvaRGB1 = new BarvaRGB1(255, 0, 0);
        BarvaRGB2 barvaRGB2 = new BarvaRGB2(255, 0, 0);
        BarvaCMYK barvaCMYK = new BarvaCMYK(0.1,0.2,0.4,0.3);

        System.out.println("BarvaRGB1: " + barvaRGB1.vyjadriBarvu());
        System.out.println("BarvaRGB2: " + barvaRGB2.vyjadriBarvu());
        System.out.println("BarvaCMYK: " + barvaCMYK.vyjadriBarvu());

        double intenzitaRGB1 = barvaRGB1.vypocetIntenzity();
        double intenzitaRGB2 = barvaRGB2.vypocetIntenzity();
        double intenzitaCMYK = barvaCMYK.vypocetIntenzity();

        System.out.println("Intenzita BarvaRGB1: " + intenzitaRGB1);
        System.out.println("Intenzita BarvaRGB2: " + intenzitaRGB2);
        System.out.println("Intenzita BarvaCMYK: " + intenzitaCMYK);
    }
}