package Exercise_23;

public class UseDemo_271 {
    public static void main(String[] args) {
        Demo_27 obj = new Demo_27();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Before Doubling");
        for (int x : arr) {
            System.out.println(x);
        }
        obj.doubler(arr);
        System.out.println("after doubling");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}