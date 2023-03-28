package Exercise_23;

public class Manager_321 extends Emp_32 {
    private double bonus;
    public void setBonus(double bonus){

        this.bonus=bonus;
    }
    public double getIncome() {
        double amt;
        amt = getSal() + bonus;
        return amt;
    }
}

