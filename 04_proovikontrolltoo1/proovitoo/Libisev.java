public class Libisev{
    public static double keskmine(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static double[] libe(double[] arvud){
        double[] v=new double[arvud.length-2];
        for(int i=0; i<v.length; i++){
            v[i]=keskmine(arvud[i], arvud[i+1], arvud[i+2]);
        }
        return v;
    }
    public static void main(String[] arg){
        System.out.println(keskmine(2, 6, 7));
        double[] sisend={3, 7, 8, 11};
        double[] vastus=libe(sisend);
        for(int i=0; i<vastus.length; i++){
            System.out.println(vastus[i]);
        }
    }
}