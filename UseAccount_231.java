package Exercise_23;

import java.util.Scanner;

public class UseAccount_231 {
    public static void main(String[] args) {
        Account_231 []  A = new Account_231[2];
        Scanner kb = new Scanner(System.in);
        for (int i=0; i< args.length; i++) {
            int id = kb.nextInt();
            String str = kb.next();
            double amt = kb.nextDouble();
            A[i]=new Account_231(id, str, amt);

        }
        System.out.println("Following are details :");
       for (int i=0; i<2; i++){
           A[i].show();
       }
        /*  for(Account_231 x: A){
            x.show();
        }

        */

           // Account_231 obj = new Account_231(id, str, amt);
       Account_231 obj2 = new Account_231(102,", sourabh",95000.5);
        //obj.show();
        obj2.show();
    }
}
