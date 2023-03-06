package User;

import Address.IAddress;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String work;
    private int age;
    private ArrayList<IAddress> arrayList;
    private Date lastDate;

    public User(String name, String lastName, String email, String password, String work, int age, ArrayList<IAddress> arrayList, Date lastDate) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.work = work;
        this.age = age;
        this.arrayList = arrayList;
        this.lastDate = lastDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<IAddress> arrayList) {
        this.arrayList = arrayList;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
}
