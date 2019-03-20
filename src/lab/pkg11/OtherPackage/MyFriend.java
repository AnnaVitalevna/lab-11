package lab.pkg11.OtherPackage;

import lab.pkg11.MyPackage.Me;

public class MyFriend extends Me {
    public MyFriend() {
        Me me = new Me("my friend");
        System.out.println("    Name: " + name);
        System.out.println("    Age: " + age);

    }
}
