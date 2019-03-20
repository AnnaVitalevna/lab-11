package lab.pkg11;

import lab.pkg11.OtherPackage.MyFriend;
import lab.pkg11.OtherPackage.Stranger;
import lab.pkg11.MyPackage.MyParents;
import lab.pkg11.MyPackage.Me;

public class Lab11 {
    public static void main(String[] args) {
        Me me = new Me();
        me.showStudentProfile();
        MyParents parents = new MyParents();
        MyFriend friend = new MyFriend();
        Stranger stranger = new Stranger();
    }
}
