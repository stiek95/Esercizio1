package Esercizio1;
import java.math.*;
// Esercizio 1
public class Main {

    public static void main(String[] args) {
        BigDecimal dig1 = new BigDecimal(1);
        BigDecimal dig0 = new BigDecimal(1);
        BigDecimal Result = BigDecimal.valueOf(0);
        int Counter= 2;
        while (true) {
            Result = dig0.add(dig1);
            dig0 = dig1;
            dig1 = Result;
            //Controllo se il numero ha 1000 cifre
            if (CifreNum(Result) == 1000) {
                System.out.println("il numero della sequenza e': " + ++Counter );
                break;
            }
         ++Counter;
        }
    }
    public static int CifreNum(BigDecimal Result){
        String s = "" + Result;
        return s.length();
    }
}
