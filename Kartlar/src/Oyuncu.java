import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oyuncu implements Sort {
    private List<Kart>Kartlistesi;
    public Oyuncu(List<Kart> kartlistesi) {

        Kartlistesi = kartlistesi;
    }

    public List<Kart> getKartlistesi() {
        return Kartlistesi;
    }

    public void setKartlistesi(List kartlistesi) {
        Kartlistesi = kartlistesi;
    }
    public void KartEkle(Kart kartekle)
    {
        Kartlistesi.add(kartekle);
    }

    }

