public class DNoot extends Noodid{
    public DNoot (int mainTone, int terts, int kvint){
        super(mainTone, terts, kvint);
    }

    @Override    
    public void naitaNoot(){
        System.out.println("D põhitoon on: " + this.mainTone);
    }
    @Override
    public void naitaTerts(){
        this.terts = this.mainTone + 4;
        System.out.println("D terts on: "+ this.terts);
    }
    public void naitaKvint(){
        this.kvint = this.mainTone + 7;
        System.out.println("D kvint on: " + this.kvint);
    }
}