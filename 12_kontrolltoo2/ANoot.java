public class ANoot extends Noodid{
    public ANoot (int mainTone, int terts, int kvint){
        super(mainTone, terts, kvint);
    }

    @Override    
    public void naitaNoot(){
        System.out.println("A põhitoon on: " + this.mainTone);
    }
    @Override
    public void naitaTerts(){
        this.terts = this.mainTone + 4;
        System.out.println("A terts on: "+ this.terts);
    }
    public void naitaKvint(){
        this.kvint = this.mainTone + 7;
        System.out.println("A kvint on: " + this.kvint);
    }
}