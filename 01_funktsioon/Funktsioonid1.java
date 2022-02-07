public class Funktsioonid1{
    public static double tollideks(double sentimeeter){
        return sentimeeter*0.3937;
    }
    //tehke funktsiooniga sentimeetrid
    public static void main(String[] arg){
        if(arg.length>0){
            double t=Double.parseDouble(arg[0]);
            System.out.println(tollideks(t));
        }
    }
}

