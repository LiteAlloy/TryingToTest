
package piglatin;

import java.util.Scanner;

public class PigLatin {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите одно английское слово. Мы переведём его на язык PigLatin.");
        String theWord = in.nextLine();
        
        String lolWord = theWord.substring(1, 2).toUpperCase() +
                         theWord.substring(2, theWord.length()) +
                         theWord.substring(0, 1).toLowerCase() + 
                         "ay";
        
        System.out.println();
        System.out.println(lolWord);
        
        //p.s. Спасибо, Пайтон! 
    }
    
}
