import java.lang.reflect.Parameter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
    // Vytvoření nových objektů z třídy Domov
    Domov dumNovaku = new Domov(125.5f, 10, 3);
    Domov dumZajicu = new Domov(64.3f, 4,2);
    Domov dumKraliku = new Domov(103.7f,6,2);

    //
    float cenaDomuNovaku = dumNovaku.vypocetCenyDomu(1, "Novákovi");
    float cenadomuZajicu = dumZajicu.vypocetCenyDomu(3, "Zajícovi");
    float cenaDomuKraliku = dumKraliku.vypocetCenyDomu(2, "Králikovi");

    // Volání Setter
    dumNovaku.setPocetOken(12);

    // Volání Getter
    int pocetOkenNovaku = dumNovaku.getPocetOken();

    System.out.println(pocetOkenNovaku);
    System.out.println(cenadomuZajicu + cenaDomuNovaku);

    Obchod kaufland = new Obchod(10265f, 2, 12);
    Obchod globus = new Obchod(12759f, 1, 13);

    float cenaKauflandu = kaufland.vypocetCenyDomu(1, "Kaufland");
    System.out.println(cenaKauflandu);
    }
    */

    /*
    Pes lajka = new Pes("Bígl", 12.3f, false, 8);
    lajka.vydejZvuk();

    Kocka mourek = new Kocka("Mývalí", 6.2f, true, 14);
    mourek.vydejZvuk();
    */

    Banka mBank = new Banka(10, 1000, 2,10);
    System.out.println(mBank.vypocetSporicihoUctu());
    Banka moneta = new Banka(10, 1000, 5,20);
    System.out.println(moneta.vypocetSporicihoUctu());
    Banka airbank = new Banka(10, 1000, 12,100);
    System.out.println(airbank.vypocetSporicihoUctu());
}
}
