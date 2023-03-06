package Address;

import User.User;

public class AddressManager {

    static User user;

    public static void addList(IAddress s){
        user.getArrayList().add(s);
    }
    public static void removeList(IAddress s){
        user.getArrayList().remove(s);
    }
}
