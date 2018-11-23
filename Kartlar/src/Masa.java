import java.util.*;

public class Masa {

    ArrayList<Kart>Kartdestesi=new ArrayList<>();
    ArrayList<Kart> Temp=new ArrayList<>();
    ArrayList<Integer> kagitlistesi=new ArrayList();
    ArrayList<Integer> tiplistesi=new ArrayList();
    private int now;
    public Masa(){
        for (int i=2;i<15;i++)
        {
            kagitlistesi.add(i);
        }
        tiplistesi.add(15); //sinek
        tiplistesi.add(16); //karo
        tiplistesi.add(17); //maca
        tiplistesi.add(18); //kupa
        now=0;
        for (int i=0;i<52;i++)
        {
            Kartdestesi.add(new Kart(kagitlistesi.get(i%13),tiplistesi.get(i/13)));
        }
        }
     public  void karistir()
     {
         for(int i=0;i<52;i++)
         {
             Random x=new Random();
             int t=x.nextInt(52);
             Temp.add(i,Kartdestesi.get(i));
             Kartdestesi.set(i,Kartdestesi.get(t));
             Kartdestesi.set(t,Temp.get(i));
         }
         System.out.println("karistirilmis kartlar");
         for (int j=0;j<Kartdestesi.size();j++)
         {
             System.out.println(Kartdestesi.get(j));
         }
     }

     public Kart KartVer()
     {
        if(now <Kartdestesi.size()) {
            return Kartdestesi.get(now++);

        }
        else
        return null;
     }

    }



