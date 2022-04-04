public class Risttahukas extends Kujund {
    double pikkus, laius;
    public Risttahukas(double uusPikkus, double uusLaius, double uusKorgus){
        pikkus=uusPikkus; laius=uusLaius; korgus=uusKorgus;
    }
    @Override
    public double pohjaYmbermoot(){
        return laius+pikkus+laius+pikkus;
        
    }
}