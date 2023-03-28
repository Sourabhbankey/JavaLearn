package Exercise_23;

public class Account_231 {
    private  int acctid;
    private String name;
    private double bal;

    public Account_231(int id, String str,double amt){
        acctid=id;
        name=str;
        bal =amt;
    }
    public void show()
    {

        System.out.println("acctId= "+acctid+"name= "+name+ "bal "+bal);
    }

}
