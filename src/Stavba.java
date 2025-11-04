public class Stavba {
    protected float rozloha;
    protected int pocetPoschodi;
    protected int pocetOken;

    // Toto je metoda
    public float vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(jmenoRodiny);
        //System.out.println(lukrativniOblast * (pocetOken * 300 + rozloha * 5500 + pocetLoznic * 800));
        float vypocet = lukrativniOblast * (pocetOken * 300 + rozloha * 5500);
        return vypocet;
        // return lukrativniOblast * (pocetOken * 300 + rozloha * 5500 + pocetLoznic * 800);
    }
}
