public class GNoot extends Noodid{
    public GNoot (int mainTone, int terts, int kvint){
        super(mainTone, terts, kvint);
    }

    @Override    
    public void naitaNoot(){
        System.out.println("G põhitoon on: " + this.mainTone);
    }
    @Override
    public void naitaTerts(){
        this.terts = this.mainTone + 4;
        System.out.println("G terts on: "+ this.terts);
    }
    public void naitaKvint(){
        this.kvint = this.mainTone + 7;
        System.out.println("G kvint on: " + this.kvint);
    }
}