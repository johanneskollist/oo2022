class Punkt3D extends Punkt2D{
    double Z;
    public Punkt3D(double uusX, double uusY, double uusZ){
        super(uusX, uusY); 
        Z=uusZ;
    }
    public double kaugusNullist3D(){
		return Math.sqrt(Math.pow(X, 2)+Math.pow(Y, 2))+Math.pow(Z, 2);
	}
}