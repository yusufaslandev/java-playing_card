import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Kart>deste1=new ArrayList<>();
        List<Kart>deste2=new ArrayList<>();
        List<Kart>deste3=new ArrayList<>();
        List<Kart>deste4=new ArrayList<>();

        Masa mymasa = new Masa();
        Oyuncu oyuncu1=new Oyuncu(deste1);
        Oyuncu oyuncu2=new Oyuncu(deste2);
        Oyuncu oyuncu3=new Oyuncu(deste3);
        Oyuncu oyuncu4=new Oyuncu(deste4);
        mymasa.karistir();

          for(int j=0;j<13;j++) {
               oyuncu1.KartEkle(mymasa.KartVer());
               oyuncu2.KartEkle(mymasa.KartVer());
               oyuncu3.KartEkle(mymasa.KartVer());
               oyuncu4.KartEkle(mymasa.KartVer());
           }
        oyuncu1.setKartlistesi(oyuncu1.sort(oyuncu1.getKartlistesi()));
        oyuncu2.setKartlistesi(oyuncu2.sort(oyuncu2.getKartlistesi()));
        oyuncu3.setKartlistesi(oyuncu1.sort(oyuncu3.getKartlistesi()));
        oyuncu4.setKartlistesi(oyuncu1.sort(oyuncu4.getKartlistesi()));
        System.out.println("\n");
        System.out.println("oyuncu 1 kartları" + "\n");
        System.out.print(oyuncu1.getKartlistesi());
        System.out.println("\n");
        System.out.println("oyuncu 2 kartlari:" + "\n");
        System.out.print(oyuncu2.getKartlistesi());
        System.out.println("\n");
        System.out.println("oyuncu 3 kartlari:" + "\n");
        System.out.print(oyuncu3.getKartlistesi());
        System.out.println("\n");
        System.out.println("oyuncu 4 kartlari:" + "\n");
        System.out.print(oyuncu4.getKartlistesi());
        System.out.println("\n");




        }
    }



