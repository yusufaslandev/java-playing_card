public class Kart {

    private int kagit;
    private int tip;

    public int getKagit() {
        return kagit;
    }

    public void setKagit(int kagit) {
        this.kagit = kagit;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public Kart(Integer kagit, Integer tip) {
        this.kagit = kagit;
        this.tip = tip;
    }
    public String toString()
    {
        if (tip==15)
        {
            if (kagit==11) return "sinek " + " J";
            if (kagit==12) return "sinek " + " Q";
            if (kagit==13) return "sinek " + " K";
            if (kagit==14) return "sinek " + " A";
            return  " sinek " + kagit;
        }
        if (tip==16)
        {
            if (kagit==11) return " maca " + " J";
            if (kagit==12) return " maca"  + " Q";
            if (kagit==13) return " maca " + " K";
            if (kagit==14) return " maca " + " A";
            return  " maca " + kagit;

        }
        if (tip==17)
        {
            if (kagit==11) return " karo " + " J";
            if (kagit==12) return " karo " + " Q";
            if (kagit==13) return " karo " + " K";
            if (kagit==14) return " karo " + " A";
            return  " karo " + kagit;
        }
        if (tip==18)
        {
            if (kagit==11) return " kupa " + " J";
            if (kagit==12) return " kupa " + " Q";
            if (kagit==13) return " kupa " + " K";
            if (kagit==14) return " kupa " + " A";
            return  " kupa " + kagit;
        }

        return tip + " " + kagit;
    }





}
