import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    public int[] zahlIndex= {1,2,3,4,5,6,7,8,9,10,11};
    public Character[] buchstabenIndex={'a','b','c','d','e','f','g','h','i','j','k'};
    public HashMap<EinzelFeld, FeldStatus>feld;

    public ArrayList<String> feldArrayList = new ArrayList();


    public Game(){
        feld=new HashMap();
        for (int i=0; i<zahlIndex.length; i++){
            for (int j=0; j<buchstabenIndex.length;j++){
                feld.put(new EinzelFeld(zahlIndex[i], buchstabenIndex[j]), FeldStatus.leer);
            }
        }

    }

}
