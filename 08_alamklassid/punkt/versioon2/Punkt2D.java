class Punkt2D{
	double X=0, Y=0;
	
	public Punkt2D(double uusX, double uusY){
		X = uusX;
		Y = uusY;
	}
	
	public double kaugusNullist2D(){
		return Math.sqrt(Math.pow(X, 2)+Math.pow(Y, 2));
	}
}