import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }
        if(number==reverseNumber){
            System.out.println(number + " It's a polindrom!!!");
            return true;
        }else{
            System.out.println(number + " It's not a polindrom");
            return false;
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        isPalindrom(number);
    }
}