class Punkt2D{
	double X=0, Y=0;
	
	public Punkt2D(){
		this(0, 0);
	}
	
	public Punkt2D(double uusX, double uusY){
		X = uusX;
		Y = uusY;
	}
	
	public String kirjutaAndmed2D(){
    return "x="+X+" y="+Y;
	}
	
	public double kaugusNullist2D(){
		return Math.sqrt(Math.pow(X, 2)+Math.pow(Y, 2));
	}
    public double kaugusNullist(){
        return kaugusNullist2D();
    }
}