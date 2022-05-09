import java.util.Scanner;

public class Akordid{

    public static void main(String[] args){
        System.out.println("Sisesta põhitoon: ");
        Scanner input = new Scanner(System.in);
        int mainTone = input.nextInt();
        int terts = mainTone + 4;
        int kvint = mainTone + 7;
        Kontrolli(mainTone, terts, kvint);
        }
    static void Kontrolli(int mainTone, int terts, int kvint){
        
        if (mainTone == 62){
            DNoot dnoot = new DNoot(mainTone, terts, kvint);
            dnoot.naitaNoot();
            dnoot.naitaTerts();
            dnoot.naitaKvint();
        } else if (mainTone == 67){
            GNoot gnoot = new GNoot(mainTone, terts, kvint);
            gnoot.naitaNoot();
            gnoot.naitaTerts();
            gnoot.naitaKvint();
        } else if (mainTone == 69){
            ANoot anoot = new ANoot(mainTone, terts, kvint);
            anoot.naitaNoot();
            anoot.naitaTerts();
            anoot.naitaKvint();
        } else {
            System.out.println("Sisesta arv uuesti: ");
        }
    }
}