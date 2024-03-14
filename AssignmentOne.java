import java.util.Arrays;
import java.util.Scanner;
public class AssignmentOne {
    public static void main(String[] args) {
        // question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for n");
        int n = sc.nextInt();
        System.out.println(evenNums(n));

        // question 2
//        question2(sc);
//        question3(sc);
//        question4(sc);
        question5(sc);

    }
    // question 1
    public static String evenNums(Integer n) {
        String answer = "";
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                answer += String.valueOf(i) + " ";
            }
        }
        return answer;
    }

    public static void question2 (Scanner sc) {
        int[] arr = new int[5];
        int sum = 0;
        int average;
        System.out.println("Enter 5 digits to be put in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);
        System.out.println("Values less than average");
        for (int num:arr) {
            if (num < average) {
                System.out.println(num);
            }
        }
    }

    public static void question3 (Scanner sc) {
        int num1, num2, answer = 0;
        String operator;
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num1");
        num2 = sc.nextInt();
        System.out.println("Enter an operator (+,-,/,*)");
        operator = sc.next();

        switch (operator) {
            case "+": answer = num1 + num2;break;
            case "/": answer = num1 / num2;break;
            case "-": answer = num1 - num2; break;
            case "*": answer = num1 * num2; break;
        }
        System.out.println("Question3 answer: "+ String.valueOf(answer) + "\n");
    }

    public static void question4 (Scanner sc) {
        int num;
        int[] bingoArr = {10,20,30,40,50};
        boolean bingoed = false;
        System.out.println("Enter a number from 1 to 50");
        num = sc.nextInt();
        while (num<1 || num>50) {
            System.out.println("Invalid number, enter a number from 1 to 50");
            num = sc.nextInt();
        }
        for (int elem:bingoArr) {
            if (num == elem) {
                bingoed = true;
                break;
            }
        }
        if (bingoed) {
            System.out.println("BINGO");
        } else {
            System.out.println("No BINGO");
        }
    }

    public static void question5 (Scanner sc) {
        String[] answer = new String[5];
        String word;
        System.out.println("Input 5 words");
        for (int i = 0; i< 5; i++) {
            System.out.println("Type word #: "+ String.valueOf(i+1));
            word = sc.next();
            // turn string to char array and reverse
            char[] reverseWord = new char[word.length()];
            for (int j=0; j < word.length(); j++) {
                reverseWord[j] = word.charAt(word.length()-1-j);
            }
            answer[i] = String.valueOf(reverseWord);
        }
        System.out.println("Below are the 5 reversed words in alphabetical order");
        Arrays.sort(answer);
        for (String w:answer) {
            System.out.println(w);
        }
    }
}
