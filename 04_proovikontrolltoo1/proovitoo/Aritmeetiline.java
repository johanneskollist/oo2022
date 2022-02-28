public class Aritmeetiline {  
    public static void main(String[] args) {       
        double [] numArray = new double [] {25, 22, 53};   
        double sum = 0;  
            
        for (int i = 0; i < numArray.length; i++) {   
           sum = sum + numArray[i];  
        }    
        System.out.println("Elementide summa: " + sum);  
        System.out.println("Aritmeetiline keskmine: " + sum/3);
    }  
}  
/*public class Aritmeetiline{
    public static void main(String[] args){
        double [] numArray = {15, 18, 20};
        double KE = calculateKE(numArray);

        System.out.format("Aritmeetiline = %.6f", KE);
    }

    public static double calculateKE(double numArray[]){
        int length = numArray.length;
        double sum = 0;
        for(double i=0; i<numArray.length; i++){
            sum = sum + numArray[];
        } 
    }

}*/