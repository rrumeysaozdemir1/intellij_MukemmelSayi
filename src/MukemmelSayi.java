import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total=0;
        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        for(int i=1 ; i<number ; i++ ){
            if(number % i == 0){
                total+=i;

            }
        }
        if(number == total){
            System.out.println("Perfect Number!");
        }
        else{
            System.out.println("Not Perfect Number!");
        }
    }
}
