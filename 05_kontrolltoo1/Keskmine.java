public class Keskmine{
    public static void main(String[] args)throws Exception{
        KaalutudKeskmine kaalutudkeskmine = new KaalutudKeskmine();
        double kahega = kaalutudkeskmine.Ainepunktid(3, 6, "A", "D");
        System.out.println("Kahe ainekursuse põhjal kaalutud keskmine hinne: " + kahega);

        Integer[] punktid = {6, 4, 3, 3};
        String[] hinded = {"B", "C", "A", "D"};
        double kogum = kaalutudkeskmine.kogumistKKH(punktid, hinded);
        System.out.println("Etteantud hinnete põhjal Kaalutud keskmine: " + kogum);
        kaalutudkeskmine.KaalutudKeskmineFaili();
        

    }
}