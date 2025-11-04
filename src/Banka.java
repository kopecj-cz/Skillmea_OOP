public class Banka {

    private int rokyUlozky;
    private float pocatecniVklad;
    private float urokovaSazba;
    private float poplatekBanky;
    private float konecnaCastka;

    Banka(int rokyUlozky, float pocatecniVklad, float urokovaSazba, float poplatekBanky){
        this.rokyUlozky = rokyUlozky;
        this.pocatecniVklad = pocatecniVklad;
        this.urokovaSazba = urokovaSazba;
        this.poplatekBanky = poplatekBanky;
    }

    public float vypocetSporicihoUctu(){
        konecnaCastka = pocatecniVklad;

        for (int i = 0; i < rokyUlozky; i++){
            konecnaCastka += konecnaCastka * (urokovaSazba/100) - poplatekBanky;
        }
        return konecnaCastka;
    }

}