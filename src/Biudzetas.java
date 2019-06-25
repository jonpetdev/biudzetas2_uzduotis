import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {


    ArrayList<PajamuIrasas> pajamuIrasasArrayList= new ArrayList<>();
    ArrayList<IslaiduIrasas> islaiduIrasasArrayList=new ArrayList<>();

    Scanner sc= new Scanner(System.in);
    int exit=0;
    Biudzetas() {

        while (exit==0) {

            System.out.println("pasirinkite: Pajamos -[1], Islaidos -[2], Balansas -[3]");
            while (!sc.hasNextInt()) {
                sc.next();
            }
            int pas1 = sc.nextInt();
            if (pas1 == 1) {
                System.out.println("Pasirinkite: Irasyt -[1], Gauti -[2], Trinti -[3]");
                while (!sc.hasNextInt()) {
                    sc.next();
                }
                int pas2 = sc.nextInt();
                if (pas2 == 1) {
                    pridetoPajamuIrasa();
                } else if (pas2 == 2) {
                    gautiPajamuIrasa();
                } else if(pas2 == 3){
                    trintiP();
                }
            } else if (pas1 == 2) {
                System.out.println("Pasirinkite: Irasyt -[1], Gauti -[2], Trinti =[3]");
                while (!sc.hasNextInt()) {
                    sc.next();
                }
                int pas3 = sc.nextInt();
                if (pas3 == 1) {
                    pridetiIslaiduIrasa();
                } else if (pas3 == 2) {
                    gautiIslaiduIrasa();
                } else if (pas3== 3){
                    trintiI();
                }
            }else if (pas1==3){
                balansas();
            }
        }
    }


    public void pridetoPajamuIrasa(){


        PajamuKategorija pajamuKategorija = null;
        System.out.println("Pasirinkite kategorija:Atlyginimas -[1],Vokelis -[2], Chalturke -[3]");
        while(!sc.hasNextInt()){
            sc.next();
        }
        int pasirink1= sc.nextInt();
        switch(pasirink1){
            case 1:
                pajamuKategorija=PajamuKategorija.ATLYGINIMAS;
                break;
            case 2:
                pajamuKategorija=PajamuKategorija.VOKELIS;
                break;
            case 3:
                pajamuKategorija=PajamuKategorija.CHALTURKE;
                break;
                default:
                    System.out.println("nera tokio pasirinkimo");
                    break;

        }
        System.out.println("Iveskite suma:");
        while(!sc.hasNextFloat()){
            sc.next();
        }
        float suma = sc.nextFloat();
        LocalDateTime data= LocalDateTime.now();
        System.out.println("pasirinkite tipa:");

        while(!sc.hasNextBoolean()){
            sc.next();
        }
        boolean bankas = sc.nextBoolean();
        System.out.println("info:");
        while(!sc.hasNext()){
            sc.next();
        }
        String info = sc.next();
        int counter = IslaiduIrasas.countas++;
        PajamuIrasas pajamuIrasas = new PajamuIrasas(suma,data,info,bankas,pajamuKategorija, counter);
        pajamuIrasasArrayList.add(pajamuIrasas);


    }

    public void pridetiIslaiduIrasa(){
        IslaiduKategorija islaiduKategorija = null;
        System.out.println("Pasirinkite kategorija: Maistas -[1],Pramogos -[2], Butas -[3], Komunaliniai -[4], Kuras -[5]");
        while(!sc.hasNextInt()){
            sc.next();
        }
        int pasirink1= sc.nextInt();
        switch(pasirink1){
            case 1:
                islaiduKategorija=IslaiduKategorija.MAISTAS;
                break;
            case 2:
                islaiduKategorija=IslaiduKategorija.PRAMOGOS;
                break;
            case 3:
                islaiduKategorija=IslaiduKategorija.BUTAS;
                break;
            case 4:
                islaiduKategorija=IslaiduKategorija.KOMUNALINIAI;
                break;
            case 5:
                islaiduKategorija=IslaiduKategorija.KURAS;
                break;
            default:
                System.out.println("nera tokio pasirinkimo");
                break;

        }
        System.out.println("Iveskite suma:");
        while(!sc.hasNextFloat()){
            sc.next();
        }
        float suma = sc.nextFloat();
        LocalDateTime data= LocalDateTime.now();
        System.out.println("pasirinkite tipa:");

        while(!sc.hasNextBoolean()){
            sc.next();
        }
        boolean bankas = sc.nextBoolean();
        System.out.println("info:");
        while(!sc.hasNext()){
            sc.next();
        }
        String info = sc.next();
        int counter = IslaiduIrasas.countas++;
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas(suma,data,info,bankas,islaiduKategorija,counter);
        islaiduIrasasArrayList.add(islaiduIrasas);


    }

    public void gautiPajamuIrasa(){
        System.out.println("Pasirinkite: gauti pagal indexa-[1], gauti visus -[2]");

        while(!sc.hasNextInt()){
            sc.next();
        }
        int pas2= sc.nextInt();
        if(pas2==1){
            System.out.println("Iveskite indeksa");
            while(!sc.hasNextInt()){
                sc.next();
            }
            int pas3=sc.nextInt();
            if(pas3>pajamuIrasasArrayList.size()){
                System.out.println("nera tokio iraso");
            }else {
                System.out.println("unikalius sk: "+pajamuIrasasArrayList.get(pas3).getCounter()
                        +"indeksas:" + pas3 + " suma:" + pajamuIrasasArrayList.get(pas3).getSuma()
                        + " info:" + pajamuIrasasArrayList.get(pas3).getInfo()
                        + " data:" + pajamuIrasasArrayList.get(pas3).getData()
                        + " kategorija:" + pajamuIrasasArrayList.get(pas3).getPajamuKategorija()
                        + " bankas:" + pajamuIrasasArrayList.get(pas3).isBankas());
            }
        }else if(pas2==2){

            for(int i=0; i<pajamuIrasasArrayList.size();i++){
                System.out.println("unikalius sk: "+pajamuIrasasArrayList.get(i).getCounter()
                        +"indeksas:" +i+" suma:"+pajamuIrasasArrayList.get(i).getSuma()
                        +" info:"+pajamuIrasasArrayList.get(i).getInfo()
                        +" data:"+pajamuIrasasArrayList.get(i).getData()
                        +" kategorija:"+pajamuIrasasArrayList.get(i).getPajamuKategorija()
                        +" bankas:"+pajamuIrasasArrayList.get(i).isBankas());
            }
        }else{
            System.out.println("nera tokio pasirinkimo");
        }


    }

    public void gautiIslaiduIrasa(){
        System.out.println("Pasirinkite: gauti pagal indexa-[1], gauti visus -[2]");

        while(!sc.hasNextInt()){
            sc.next();
        }
        int pas2= sc.nextInt();
        if(pas2==1){
            System.out.println("Iveskite indeksa");
            while(!sc.hasNextInt()){
                sc.next();
            }
            int pas3=sc.nextInt();
            if(pas3>islaiduIrasasArrayList.size()){
                System.out.println("nera tokio iraso");
            }else {
                System.out.println("unikalius sk: "+islaiduIrasasArrayList.get(pas3).getCounter()
                        +"indeksas:" + pas3 + " suma:" + islaiduIrasasArrayList.get(pas3).getSuma()
                        + " info:" + islaiduIrasasArrayList.get(pas3).getInfo()
                        + " data:" + islaiduIrasasArrayList.get(pas3).getData()
                        + " kategorija:" + islaiduIrasasArrayList.get(pas3).getIslaiduKategorija()
                        + " bankas:" + islaiduIrasasArrayList.get(pas3).isBankas());
            }
        }else if(pas2==2){

            for(int i=0; i<islaiduIrasasArrayList.size();i++){
                System.out.println("unikalius sk: "+islaiduIrasasArrayList.get(i).getCounter()
                        +"indeksas:" +i+" suma:"+islaiduIrasasArrayList.get(i).getSuma()
                        +" info:"+islaiduIrasasArrayList.get(i).getInfo()
                        +" data:"+islaiduIrasasArrayList.get(i).getData()
                        +" kategorija:"+islaiduIrasasArrayList.get(i).getIslaiduKategorija()
                        +" bankas:"+islaiduIrasasArrayList.get(i).isBankas());
            }
        }else{
            System.out.println("nera tokio pasirinkimo");
        }
    }

    public void balansas(){
        float pajamuSuma = 0;
        float islaiduSuma = 0;
        float balansas;
        for(int i=0;i<pajamuIrasasArrayList.size();i++){
            pajamuSuma=pajamuSuma+pajamuIrasasArrayList.get(i).getSuma();
        }
        for(int i=0;i<islaiduIrasasArrayList.size();i++){
            islaiduSuma=islaiduSuma+islaiduIrasasArrayList.get(i).getSuma();
        }
        balansas=pajamuSuma-islaiduSuma;
        System.out.println("Balansas: "+balansas);
    }

    public void trintiP(){
        System.out.println("Esami irasai:");
        for(int i=0; i<pajamuIrasasArrayList.size();i++){
            System.out.println("unikalius sk: "+pajamuIrasasArrayList.get(i).getCounter()
                    +" indeksas:" +i+" suma:"+pajamuIrasasArrayList.get(i).getSuma()
                    +" info:"+pajamuIrasasArrayList.get(i).getInfo()
                    +" data:"+pajamuIrasasArrayList.get(i).getData()
                    +" kategorija:"+pajamuIrasasArrayList.get(i).getPajamuKategorija()
                    +" bankas:"+pajamuIrasasArrayList.get(i).isBankas());
        }
        System.out.println("\n irasykite unikalu nr. kuri norite istrinti:");
        while(!sc.hasNextInt()){
            sc.next();
        }
        int skP=sc.nextInt();
        for (int i=0;i<pajamuIrasasArrayList.size();i++){
            if(pajamuIrasasArrayList.get(i).getCounter()==skP){
                pajamuIrasasArrayList.remove(i);
                System.out.println("Irasas istrintas");
            }

        }
    }

    public void trintiI(){
        System.out.println("Esami irasai:");
        for(int i=0; i<islaiduIrasasArrayList.size();i++){
            System.out.println("unikalius sk: "+islaiduIrasasArrayList.get(i).getCounter()
                    +" indeksas:" +i+" suma:"+islaiduIrasasArrayList.get(i).getSuma()
                    +" info:"+islaiduIrasasArrayList.get(i).getInfo()
                    +" data:"+islaiduIrasasArrayList.get(i).getData()
                    +" kategorija:"+islaiduIrasasArrayList.get(i).getIslaiduKategorija()
                    +" bankas:"+islaiduIrasasArrayList.get(i).isBankas());
        }
        System.out.println("\n irasykite unikalu nr. kuri norite istrinti:");
        while(!sc.hasNextInt()){
            sc.next();
        }
        int skP=sc.nextInt();
        for (int i=0;i<islaiduIrasasArrayList.size();i++){
            if(islaiduIrasasArrayList.get(i).getCounter()==skP){
                islaiduIrasasArrayList.remove(i);
                System.out.println("Irasas istrintas");
            }

        }
    }





}
