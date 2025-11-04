public class Kocka extends Zvire {

    private int ulovenoMysi;

    Kocka(String rasa, float hmotnost, boolean jeSamec, int ulovenoMysi){
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.jeSamec = jeSamec;
        this.ulovenoMysi = ulovenoMysi;
    }

    @Override
    public  void vydejZvuk() {
        System.out.println("mňau mňau");
    }


}
