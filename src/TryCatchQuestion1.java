import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchQuestion1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            int num=Scanner.nextInt();
            if (num!=0){
                throw new Exception("Not Zero!");
            }
            System.out.println("I am happy with the input"); //when the input is 0
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Entry"); //when the input is 12xy

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage()); //when the input is -1
        }
    }
}

