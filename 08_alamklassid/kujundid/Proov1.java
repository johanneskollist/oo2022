public class Proov1{
    public static double kyljePindaladeSumma(Kujund[] m){
        double summa=0;
        for(Kujund k: m){summa+=k.kyljePindala();}
        return summa;
    }
    public static void main(String[] arg){
        Kujund[] kd=new Kujund[3];
        kd[0]=new Risttahukas(2, 3, 4);
        kd[1]=new Risttahukas(4, 6, 10);
        kd[2]=new Silinder(2, 2);
        System.out.println(kd[1].kyljePindala());
        System.out.println(kd[2].kyljePindala());
        System.out.println(kyljePindaladeSumma(kd));
    }
}