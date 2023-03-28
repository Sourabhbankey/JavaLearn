package Exercise_23;

import java.io.IOException;

public class UserInput_43 {
    public  void acceptInput() throws IOException{
        System.out.println("Enter  a character:");
        char ch =(char)System.in.read();
        System.out.println("You inputted "+ ch);
    }
}
