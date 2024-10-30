package model;

public class AutoCarRpl implements Transportasi {
    private Roda roda;
    private Setir setir;
    private Mesin mesin;
    private Fuel fuel;

    public AutoCarRpl(Roda roda, Setir setir, Mesin mesin, Fuel fuel) {
        this.roda = roda;
        this.setir = setir;
        this.mesin = mesin;
        this.fuel = fuel;
    }

    @Override
    public void bahanBakar() {
        System.out.println("Auto Car menggunakan bahan bakar " + fuel.getJenisBahanBakar());
    }

    @Override
    public void kecepatan() {
        System.out.println("Auto Car memiliki kecepatan maksimum yang dapat diatur.");
    }

    @Override
    public String getJenisMesin() {
        return mesin.getJenisMesin(); 
    }

    public void start() {
        System.out.println("Auto Car telah dimulai.");
    }

    public void drive() {
        System.out.println("Auto Car sedang berjalan.");
    }
}
