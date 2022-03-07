import java.util.*;
import java.io.*;

public class KaalutudKeskmine{
    HashMap<String, String> hinneArvuks = new HashMap<String, String>();
    public HashMap <String, String> hindedSisse() {
        hinneArvuks.put("A", "5");
        hinneArvuks.put("B", "4");
        hinneArvuks.put("C", "3");
        hinneArvuks.put("D", "2");
        hinneArvuks.put("E", "1");
        hinneArvuks.put("F", "0");
        return hinneArvuks;
    }
    public double Ainepunktid(double punkt1, double punkt2, String hinne1, String hinne2){
        hindedSisse();
        String saadudhinne1 = hinneArvuks.get(hinne1);
        String saadudhinne2 = hinneArvuks.get(hinne2);
        int hinne1numbrina = Integer.parseInt(saadudhinne1);
        int hinne2numbrina = Integer.parseInt(saadudhinne2);
        double vastus = ((hinne1numbrina * punkt1) + (hinne2numbrina * punkt2)) / (punkt1 + punkt2);
        return vastus;
    }
    public double kogumistKKH(Integer[] punktid, String[] hinded) {
        hindedSisse();
        ArrayList<String> hindedArvuna = new ArrayList<String>();
        for(int i = 0; i < hinded.length; i++) {
            hindedArvuna.add(hinneArvuks.get(hinded[i]));
        }
        double vahetulemus = 0;
        int eapd = 0;
        for(int i = 0; i < punktid.length; i++) {
            int hinne = Integer.parseInt(hindedArvuna.get(i));
            int punkt = punktid[i];
            eapd += punkt;
            vahetulemus += hinne * punkt;
        }
        double vastus = vahetulemus / eapd;
        return vastus;
    }
    public void KaalutudKeskmineFaili()throws IOException{
        int a = 0;
        ArrayList<String> hinded = new ArrayList<String>();
        ArrayList<Integer> punktid = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new FileReader("sisend.txt"));
        while(reader.readLine() !=null){
            a++;
            System.out.println(a);
        }
        reader.close();
        BufferedReader sisestus = new BufferedReader(new FileReader("sisend.txt"));
        for(int i=0; i<a; i++){
            String row [] = sisestus.readLine().split(","); 
            punktid.add(Integer.parseInt(row[2]));
            hinded.add(row[1]);
        }
        sisestus.close();
        
    }



}