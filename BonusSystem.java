package McCafe;

public class BonusSystem {
    private int bonusKarteFelder;
    private boolean gratisKaffe;

    public void BonusKarteFelder(int anzahl){
        if(anzahl == 5 || anzahl == 10 || anzahl == 14){
            this.gratisKaffe = true;
        }
    }
}
