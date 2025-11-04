public class Domov extends Stavba{
// Toto jsou vlastnosti (fields)
private boolean alarm;
private int pocetLoznic;
private String material;
private String barva;

// Toto je konstruktor
Domov(float rozloha, int pocetOken, int pocetLoznic){
    this.rozloha = rozloha;
    this.pocetOken = pocetOken;
    this.pocetLoznic = pocetLoznic;
}



// Bettter pro získání dat v private field - READ ONLY
public int getPocetOken(){
    return pocetOken;
}

// Setter pro získání dat v private fields - READ i WRITE
public void setPocetOken(int novyPocetOken){
    pocetOken = novyPocetOken;
}



}
