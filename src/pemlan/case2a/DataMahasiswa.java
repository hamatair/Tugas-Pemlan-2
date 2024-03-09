package pemlan.case2a;

import java.util.ArrayList;

public class DataMahasiswa {
    public ArrayList<String> namas = new ArrayList<>();
    public ArrayList<String> nims = new ArrayList<>();
    public ArrayList<String> alamats = new ArrayList<>();

    public String getNamas(int i) {
        return namas.get(i);
    }

    public void setNamas(String namas) {
        this.namas.add(namas);
    }

    public String getNims(int i) {
        return nims.get(i);
    }

    public void setNims(String nims) {
        this.nims.add(nims);
    }

    public String getAlamats(int i) {
        return alamats.get(i);
    }

    public void setAlamats(String alamats) {
        this.alamats.add(alamats);
    }
}
