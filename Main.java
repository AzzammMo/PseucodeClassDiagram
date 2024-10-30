import model.*;

public class Main {
    public static void main(String[] args) {
        Roda roda = new Roda(4);
        Setir setir = new Setir("Setir Standard");
        Mesin mesin = new Mesin("Mesin SOHC"); // Mesin untuk AutoCarRpl
        Fuel fuel = new Fuel("Bensin");

        System.out.println("Komponen kendaraan berhasil dibuat:");
        System.out.println("- Roda: " + roda.getJumlahRoda() + " roda");
        System.out.println("- Setir: " + setir.getTipe());
        System.out.println("- Mesin: " + mesin.getJenisMesin());
        System.out.println("- Bahan Bakar: " + fuel.getJenisBahanBakar());
        
        System.out.println(); 

        AutoCarRpl autoCar = new AutoCarRpl(roda, setir, mesin, fuel);

        System.out.println("Informasi AutoCarRpl:");
        autoCar.bahanBakar(); 
        autoCar.kecepatan();  
        System.out.println("Jenis Mesin: " + autoCar.getJenisMesin()); 

        System.out.println("Memulai AutoCarRpl...");
        autoCar.start();
        autoCar.drive();

        System.out.println(); 

        Mio mio = new Mio(roda, setir, new Mesin("Mesin SOHC"), fuel);
        System.out.println("Informasi Mio:");
        mio.bahanBakar(); 
        mio.kecepatan();   
        System.out.println("Jenis Mesin: " + mio.getJenisMesin()); 
        System.out.println("Memulai Mio...");
        mio.start();
        mio.drive();
    }
}
