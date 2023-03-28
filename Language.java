package Exercise_23;

public class Language {
    public void greetings(){

    }
}
class Hindi extends Language{
    public void greetings(){
        System.out.println("Suprabhat!");
    }
}
class English extends Language{
    public void greetings(){
        System.out.println("GOOD MORNING!");
    }
}
class French extends Language{
    public void greetings(){
        System.out.println("Bon jour!!");
    }
}
class UseLanguage{
    public static void main(String[] args) {
        Language l = new Hindi();
        l.greetings();
        l = new English();
        l.greetings();
        l = new French();
        l.greetings();
 //Lecture No. 34;
    }
}