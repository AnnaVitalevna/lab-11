package lab.pkg11.OtherPackage;

import lab.pkg11.MyPackage.Me;

public class Stranger {
    public Stranger() {
        Me me = new Me("stranger");
        System.out.println("    Name: " + me.name);
    }
}
