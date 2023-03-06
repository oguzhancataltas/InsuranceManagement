package Account;

import Insurance.Insurance;
import User.User;

import java.util.ArrayList;

public abstract class Account {

    User user;
    ArrayList<Insurance> insurances;

    public enum AuthenticationStatus {
        SUCCESS, FAIL;

    }
    public abstract void calculate();

    public abstract void insurancePolicy();

    public final void showUserInfo(){
        System.out.println("İsim Soyisim : " + this.user.getName() + " " + this.user.getLastName() +
                        "\nYaş : " + this.user.getAge() +
                        "\nEmail : " + this.user.getEmail() +
                        "\nMeslek : " + this.user.getWork() +
                        "\nAdress : " + this.user.getArrayList());

    }

    public void login(String email, String password){
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)){
//            AuthenticationStatus.SUCCESS;
        }else {
//            AuthenticationStatus.FAIL;
        }
    }

}
