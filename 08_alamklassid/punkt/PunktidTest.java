public class PunktidTest {
	public static void main(String[] args) {
		
		Punkt2D punktid[] = new Punkt2D[3];

		punktid[0] = new Punkt2D(1, 1);
		punktid[1] = new Punkt3D(2, 14, 1);
		punktid[2] = new Punkt2D(1213, 12);

		double kaugusNullistMax = 0;
		for(int i=0; i<3; i++){
			if(punktid[i].kaugusNullist2D() > kaugusNullistMax){
				kaugusNullistMax = punktid[i].kaugusNullist2D();
			}
		}
		System.out.println(kaugusNullistMax);
		
		
		
		
		
	}
}