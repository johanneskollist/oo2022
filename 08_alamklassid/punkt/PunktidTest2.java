public class PunktidTest2{
    public static void main(String[] args) {
		
		Punkt2D punktid[] = new Punkt2D[3];
		
		punktid[0] = new Punkt2D(1, 1);
		punktid[1] = new Punkt3D(2, 14, 1);
		punktid[2] = new Punkt2D(1, 2);

		double kaugusNullistMax = 0;
		for(int i=0; i<3; i++){
		  double kaugus=punktid[i].kaugusNullist2D();
		  if(punktid[i] instanceof Punkt3D){
			 Punkt3D p=(Punkt3D)punktid[i];
			 kaugus=p.kaugusNullist3D();	
		  } 
            if(kaugus > kaugusNullistMax){
				kaugusNullistMax = kaugus;
			}
		}
		System.out.println(kaugusNullistMax);
				
	}
}