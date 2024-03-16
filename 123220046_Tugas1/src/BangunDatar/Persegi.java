package BangunDatar;

public class Persegi implements OperasiBidang {
    private double panjang, lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double luas() {
        return panjang*lebar;
   }
    
    
    
}
