import java.util.ArrayList;

public class Elka {
    private int elkaId;
    private ArrayList<ElkaToy> elkaToys;

    public Elka(int elkaId, ArrayList<ElkaToy> elkaToys) {
        this.elkaId = elkaId;
        this.elkaToys = elkaToys;
    }

    @Override
    public String toString() {
        return  "Ёлка №" + elkaId +
                " игрушки: " + elkaToys;
    }

    public ArrayList<ElkaToy> getElkaToys (){
        return elkaToys;
    }
}
