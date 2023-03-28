package Exercise_23;

public class UseManager_321 {
    public static void main(String[] args) {
        Manager_321 Boss = new Manager_321();
        Boss.setData("Ashish",7000.0);
        Boss.setBonus(25000.0);

        System.out.println("manager's name:"+Boss.getName());

        System.out.println("Manager's name"+ Boss.getIncome());
    }
}