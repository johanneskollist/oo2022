public class Proov3{
    public static void main(String[] arg){
        int[][] laud=new int[10][10];
        //laud[2][3]=1;
        String juhis="kee";
        Kilpkonn k1=new Kilpkonn();
        laud[k1.kysiY()][k1.kysiX()]=1;
        if(arg.length>0){juhis=arg[0];}
        for(int i=0;i<juhis.length(); i++){
            if(juhis.charAt(i)=='e'){k1.edasi();} else{k1.keera();}
            //System.out.println(laud[2][3]);
            laud[k1.kysiY()][k1.kysiX()]=1;
        } 
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(laud[i][j]);
            }
            System.out.println();
        }
        //System.out.println(String.join("", laud[0]));

    }
}