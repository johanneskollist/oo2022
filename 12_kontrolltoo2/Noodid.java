public abstract class Noodid {
    public int kvint;
    public int terts;
    public int mainTone;

    public Noodid (int mainTone, int terts, int kvint){
        this.kvint = kvint;
        this.terts = terts;
        this.mainTone = mainTone;
    }

    public void naitaNoot(){
        System.out.println("Põhitoon on: " + this.mainTone);
    }
    public void naitaTerts(){
        System.out.println("Terts on: "+ this.terts);
    }
    public void naitaKvint(){
        System.out.println("Kvint on: " + this.kvint);
    }
}