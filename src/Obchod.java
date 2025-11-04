import java.util.jar.JarFile;

public class Obchod extends Stavba{

    private int pocetPokladen;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladen){
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladen = pocetPokladen;
    }

    // Toto je metoda
    public float vypocetCenyDomu(int lukrativniOblast, String nazevObchodu){
        System.out.println(nazevObchodu);
        //System.out.println(lukrativniOblast * (pocetOken * 300 + rozloha * 5500 + pocetLoznic * 800));
        float vypocet = lukrativniOblast * (pocetOken * 300 + rozloha * 5500);
        return vypocet;
        // return lukrativniOblast * (pocetOken * 300 + rozloha * 5500 + pocetLoznic * 800);
    }


}
