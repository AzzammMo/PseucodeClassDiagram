package model;

public class Mio extends AutoCarRpl {
    public Mio(Roda roda, Setir setir, Mesin mesin, Fuel fuel) {
        super(roda, setir, mesin, fuel);
    }

    @Override
    public void bahanBakar() {
        System.out.println("Mio menggunakan bahan bakar bensin.");
    }

    @Override
    public void kecepatan() {
        System.out.println("Kecepatan maksimum Mio adalah 80 km/jam.");
    }

    @Override
    public String getJenisMesin() {
        return "Mesin SOHC (Single Overhead Camshaft)"; 
    }
}
