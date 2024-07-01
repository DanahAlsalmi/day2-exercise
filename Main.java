import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
            • Input: Weight (kg) = 70, Height (m) = 1.75
            • Expected Output: BMI = 22.86
        */

//        System.out.println("*Question 1*");
//        System.out.print("Please enter your Weight in (KG): ");
//        double weight=input.nextDouble();
//        System.out.print("Please enter your Height in (M): ");
//        double height= input.nextDouble();
//        double bmi=(weight / (height * height));
//        System.out.printf("BMI = %.2f\n",bmi);
//        System.out.println();


        /*
             2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
            • Input: Obtained Marks = 85, Total Marks = 100
            • Expected Output: Percentage = 85.0%
        */


//        System.out.println("*Question 2*");
//        System.out.print("please enter the Obtained marks :");
//        double ob_mark=input.nextDouble();
//        System.out.print("please enter the total of mark :");
//        double total_mark= input.nextDouble();
//        double percentage =(ob_mark / total_mark) * 100;
//        System.out.println("Percentage :"+percentage+"%");
//        System.out.println();


        /*
            3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
            • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
            • Expected Output: Amount in EUR = 85.0
        */

//        System.out.println("*Question 3*");
//        System.out.print("please enter the Amount inr USD :");
//        double amount=input.nextDouble();
//        System.out.print("please enter the exchange rate (USD to EUR):");
//        double exchange_rate=input.nextDouble();
//        double result=amount*exchange_rate;
//        System.out.printf("Amount in EUR = %.1f\n",result);
//        System.out.println();



        /*
            4. Create a program that takes a string as input,
            calculates its length, and then reverses the string using the StringBuilder class,
            finally printing both the length and reversed string.
            • Input: "Hello, World!"
            • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
        */
//        System.out.println("*Question 4*");
//        System.out.print("please enter word or sentence :");
//        String word=input.nextLine();
//        System.out.println("Length of the word or sentence :"+word.length());
//        System.out.print("Reversed word or sentence :");
//
//        StringBuilder rev = new StringBuilder(word);
//        System.out.println(rev.reverse());
//        System.out.println();



        /*
            5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
            • Expected Output: "brown fox"
        */

//        System.out.println("*Question 5*");
//        System.out.print("please enter a sentence :");
//        String sentence=input.nextLine();
//        System.out.print("Enter start index :");
//        int start_index= input.nextInt();
//        System.out.print("Enter end index : ");
//        int end_index=input.nextInt();
//        String extracted_substring=sentence.substring(start_index,end_index);
//        System.out.println("Extracted Substring: \"" + extracted_substring + "\"");
//        System.out.println();


        /*
            6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
            • Expected Output: Keyword "jumps" is present in the sentence.
        */

//        System.out.println("*Question 6*");
//        System.out.print("Enter a sentence :");
//        String sentence2= input.nextLine();
//        System.out.print("Enter a keyword :");
//        String keyword= input.nextLine();
//        String result2 = sentence2.contains(keyword) ? "present" : "not present";
//        System.out.println("Keyword '" + keyword + "' is " + result2 + " in the sentence.");
//        System.out.println();



        /*
            7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
            • Expected Output: "The quick brown cat jumps over the lazy dog"
         */
//        System.out.println("*Question 7*");
//        System.out.print("Write a sentence :");
//        String sentence3= input.nextLine();
//        System.out.print("Write a word to replace :");
//        String word2= input.nextLine();
//        System.out.print("Replacement word :");
//        String word3= input.nextLine();
//
//        System.out.println("the new sentence :"+sentence3.replace(word2,word3));
//        System.out.println();



        /*
             8. Write a program that takes two strings as input and check if they are equal, ignoring
             the case, then prints whether they are equal or not.
             • Input: String 1 = "Hello", String 2 = "hello"
             • Expected Output: Strings are equal (ignoring case).
         */
//           System.out.println("*Question 8*");
//           System.out.print("First String :");
//           String s1= input.nextLine();
//           System.out.print("Second String :");
//           String s2= input.nextLine();
//           String result3 = s1.equalsIgnoreCase(s2) ? "Strings are equal (ignoring case)." : "Strings are not equal.";
//           System.out.println(result3);














    }
}