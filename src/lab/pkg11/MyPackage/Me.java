package lab.pkg11.MyPackage;

public class Me {
    public String name = "Anna Belousova";
    private int passport = 521323795;
    protected int age = 19;
    String phone = "+79994579859";

    public Me() {

    }

    public Me(String who){
        System.out.println("\nThe information for " + who + ":");
    }

    public void showStudentProfile() {
        System.out.println("\nMy profile:");
        System.out.println("    Name: " + name);
        System.out.println("    Age: " + age);
        System.out.println("    Phone: " + phone);
        System.out.println("    Passport: " + passport);
    }
}
