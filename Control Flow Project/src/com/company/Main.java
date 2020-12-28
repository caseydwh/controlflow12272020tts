package com.company;
import java.util.*;
import java.lang.Math;


public class Main {

        public static void printNumbers()
        {
            System.out.println("Numbers: ");
            for(int c = 48; Character.isDigit(c); c++){
                    System.out.println(c + ": " + (char)c);
            }
        }
        public static void printLowerCase()
        {
            System.out.println("Lower Case Letters: ");
            for(int a = 97; Character.isLowerCase(a); a++){
                System.out.println(a + ": " + (char)a);
            }
        }
        public static void printUpperCase()
        {
            System.out.println("UpperCase Letters: ");
            for(int b = 65; Character.isUpperCase(b); b++){
                System.out.println(b + ": " + (char)b);
            }

        }

        public static String getAnswer(){
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
                return answer;
            }

        public static int getAnswerInt() {
            Scanner scan = new Scanner(System.in);
            for (;;) {
                if(!scan.hasNextInt()){
                    System.out.print("Enter only integers please!");
                    scan.next();
                    continue;
                }
                int choose = scan.nextInt();
                if (choose >= 0 && String.valueOf(choose).length() < 3) {
                    System.out.print("Thank you!   ");
                }
                else{
                    System.out.print("Invalid Input, i.e. 6, 32, 13 - Reenter Number: ");
                    getAnswerInt();
                }
                return choose;
            }
        }
    public static void interactiveQuestions() {
        System.out.print("Let's get started. Do you have a red car? (yes, no): ");
        String answer1 = getAnswer();
        if(answer1.matches("yes|no|y|n|Y|Yes")) {
            System.out.print("Next question! What is the name of your favorite pet?: ");
            String answer2 = getAnswer();
            if(answer2.length()<2){
                System.out.println("It has to be longer than that!");
                answer2 = getAnswer();
            }
            System.out.print("Thank you! What is the age of your favorite pet? (enter digits): ");
            int answer3 = getAnswerInt();
            System.out.print("What is your lucky number? (digits!): ");
            int answer4 = getAnswerInt();
            System.out.print("Do you have a favorite quarterback? If so, what's their jersey number? If not, just enter a number: ");
            int answer5Int = getAnswerInt();
                System.out.print("What is the two digit model year of your car? (2007 -> 07): ");
                int answer6 = getAnswerInt();
                System.out.print("What is the first name of your favorite actor or actress?: ");
                String answer7 = getAnswer();
                System.out.println("Enter any random number between 1 and 50: ");
                int answer8 = getAnswerInt();
                System.out.println("Time for the magic! Let me get you a set of lottery numbers...");
                int max = 65;
                int min = 1;
                int range = max - min + 1;
                int randomNum1 = (int) (Math.random() * range) + min;
                int randomNum2 = (int) (Math.random() * range) + min;
                int randomNum3 = (int) (Math.random() * range) + min;

                int magicNumber = answer4;
                int lotto1 = answer4 + answer6;
                int lotto2 = 42;
                int lotto3 = answer3 + answer4;
                int lotto4 = answer8 - randomNum1;
                int lotto5 = answer2.charAt(2) - '0';

                if(lotto1 > 65){
                    lotto1 = lotto1 - 65;
                }
                else if(lotto2 > 65){
                    lotto2 = lotto2 - 100;
                }
                else if(lotto3 > 65){
                    lotto3 = lotto3 - 65;
                }
                else if(lotto4 > 65){
                    lotto4 = lotto4 - 65;
                }
                else if(lotto5 > 65){
                    lotto5 = lotto5 - 65;
                }
                else if(magicNumber > 75){
                    magicNumber = magicNumber - 75;
                }
                if(lotto1 < 1 ){
                    lotto1 = lotto1 + 65;
                }
                else if(lotto2 < 1 ){
                    lotto2 = lotto2 + 65;
                }
                else if(lotto3 < 1 ){
                    lotto3 = lotto3 + 65;
                }
                else if(lotto4 < 1 ){
                    lotto4 = lotto4 + 65;
                }
                else if(lotto5 < 1 ){
                    lotto5 = lotto5 + 65;
                }
                else if(magicNumber < 1 ){
                    magicNumber = magicNumber + 75;
                }

                ArrayList<Integer> LottoNumbers = new ArrayList<Integer>();
                LottoNumbers.add(lotto1);
                LottoNumbers.add(lotto2);
                LottoNumbers.add(lotto3);
                LottoNumbers.add(lotto4);
                LottoNumbers.add(lotto5);
                Collections.sort(LottoNumbers);

                System.out.println("Your numbers are....");
                System.out.print("Lottery: " + LottoNumbers);
                System.out.print("  Magic Ball: " + magicNumber + "\n");
            }
        else{
            System.out.println("That's not a valid response! Try again.");
            Main.interactiveQuestions();
        }

        System.out.println("Would you like to play again? y/n");
        String answerRestart = getAnswer();
        if(answerRestart.matches("y|yes")){
            Main.interactiveQuestions();
        }
        else{
            System.out.println("Thank you! Goodbye.");
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Main.printNumbers();
            Main.printLowerCase();
            Main.printUpperCase();
        System.out.print("Please enter your name!: ");
        String name = scan.next();
        System.out.println("Hello " + name);
        System.out.println("Would you like to continue to the interactive portion? yes/no");
        String interactiveAnswer = scan.next();
        if(interactiveAnswer.equalsIgnoreCase("yes") || interactiveAnswer.equalsIgnoreCase("y")){
            Main.interactiveQuestions();
        }
        else{
            System.out.println("No problem! Please return later to complete the survey.");
            System.exit(0);
        }

    }
}
