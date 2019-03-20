package lab.pkg11.MyPackage;

public class MyParents extends Me {
    public MyParents() {
        Me me = new Me("my parents");
        System.out.println("    Name: " + name);
        System.out.println("    Age: " + age);
        System.out.println("    Phone: " + phone);
    }
}
