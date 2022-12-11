package Practice;

public class VowelAndConsonant {
    public static void main(String[] args) {
        int countV=0;
        int countC=0;
       String s1="DEEPAK";


        //converting the entire string into lower case
         s1=s1.toLowerCase();

        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i)=='a' || s1.charAt(i) =='e' || s1.charAt(i) =='i' || s1.charAt(i) =='o' || s1.charAt(i) =='u') {
                //increment the vowel counter
                countV++;
            }
            //check whether char is consonant
            else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                countC++;
            }
        }
            System.out.println("NO OF VOWELS IN STRING IS:"+countV);
            System.out.println("NUMBER OF CONSONANT IN STRING IS:"+countC);
        }
    }

