package JavaW2;

public class PseudoCode {
    public static void main(String args[]) {
        int c = 0;
        int isPrime = 3;
        boolean prime = true;

        for(int k = 2; k <= isPrime -1; k++) {
            if(isPrime % k == 0){
                prime = false;
            }
        }
        System.out.println(prime);
}
     //Variable c = 0; // zählt wie oft teilbar war
    //Gehe mit der Variable k von 1 bis n und überprüfe {
    //     If (kein Rest bei der Division n / k ) {
    //          c++;
    //     }
    //}
    //if (c > 0) {
    //     Primzahl = false;
    //}
    //else {
    //     Primzahl = true;
    //}
}
