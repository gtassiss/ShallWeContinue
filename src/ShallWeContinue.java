
import java.util.Scanner;

public class ShallWeContinue {


    public static void main(String[] args)
    {
        String ans;


        Scanner scan= new Scanner (System.in);
//This do while method asks the user to input "y" in order to continue and "n" to respond Thank you.  

        do{

            System.out.println("Do you want to Continue?");
            ans=scan.next ();
            if( ans.equalsIgnoreCase ( "n" ) )
            {
                System.out.println("Thank you!");

                // System.exit ( 0 );
            }


        }while(ans.equalsIgnoreCase ( "y" )||ans.equalsIgnoreCase ( "n" ));


    }
}