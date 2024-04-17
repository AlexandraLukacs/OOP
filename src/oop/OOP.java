package oop;


public class OOP {

    
    public static void main(String[] args) {
        Fuzet fuzet1 = new Fuzet();
        fuzet1.fajta = "Csíkos";
        fuzet1.meret = "A4";
        fuzet1.minta = "Virágos";
        fuzet1.lapSzam = 40;
        fuzet1.anyag();
        
        Fuzet fuzet2 = new Fuzet();
        fuzet2.fajta = "Kockás";
        fuzet2.meret = "A5";
        fuzet2.minta = "Autós";
        fuzet2.lapSzam = 100;
        fuzet2.anyag();
        
        Fuzet fuzet3 = new Fuzet();
        fuzet3.fajta = "Sima";
        fuzet3.meret = "A3";
        fuzet3.minta = "Állatos";
        fuzet3.lapSzam = 80;
        fuzet3.anyag();
    }
    
}
