import java.util.*;
public class Keskmised3_proov{
    public static void main(String[] arg){
        Keskmised3 k = new Keskmised3();
        k.lisa(5);
        k.lisa(8);
        k.lisa(12);
        k.lisa(34);
        k.lisa(10);
        System.out.println(Arrays.toString(k.libisevKeskmine()));
    }
}