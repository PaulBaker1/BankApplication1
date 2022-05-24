package models;

import java.util.Random;
import java.util.Scanner;

public class NewAccount {
    private String newAccountName;
    private String newAccountSurname;
    private String newAccountLogin;
    private double newAccountNumber;
    private double newAccountCardNumber;

    public String recieveNewAccountName() {

            System.out.print("Please enter the name of the new account (cannot contain numbers or special characters): ");
            Scanner myObj = new Scanner(System.in);
            newAccountName = myObj.nextLine();
            if (newAccountName.matches(".*[^a-zA-Z].*")) {

                    System.out.println("Sorry Name cannot contain numbers or special characters");
            }
        return newAccountName;
    }

    public String recieveNewAccountSurname() {
        System.out.print("Please enter the surname of the new account (cannot contain numbers or special characters): ");
        Scanner myObj = new Scanner(System.in);
         newAccountSurname = myObj.nextLine();
        if(newAccountSurname.matches(".*[^a-zA-Z].*")) {
            System.out.println("Sorry Surname cannot contain numbers or special characters");
        }
         return newAccountSurname;
    }

    public String recieveNewAccountLogin() {
        System.out.print("Please enter the login of the new account (must contain numbers or special characters): ");
        Scanner myObj = new Scanner(System.in);
        newAccountLogin = myObj.nextLine();
        if(!newAccountLogin.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Sorry Login must contain at least one numbers or special characters");
        }
        return newAccountLogin;
    }

    public double randomAccountNumber() {
        Random random = new Random();
        return newAccountNumber = random.nextInt(10000000);
    }

    public double randomAccountCardNumber() {
        Random random = new Random();
        return newAccountCardNumber = random.nextInt(10000000);
    }

    public String getNewAccountName() {
        return newAccountName;
    }

    public void setNewAccountName(String newAccountName) {
        this.newAccountName = newAccountName;
    }

    public String getNewAccountSurname() {
        return newAccountSurname;
    }

    public void setNewAccountSurname(String newAccountSurname) {
        this.newAccountSurname = newAccountSurname;
    }

    public String getNewAccountLogin() {
        return newAccountLogin;
    }

    public void setNewAccountLogin(String newAccountLogin) {
        this.newAccountLogin = newAccountLogin;
    }

    public double getNewAccountNumber() {
        return newAccountNumber;
    }

    public void setNewAccountNumber(double newAccountNumber) {
        this.newAccountNumber = newAccountNumber;
    }

    public double getNewAccountCardNumber() {
        return newAccountCardNumber;
    }

    public void setNewAccountCardNumber(double newAccountCardNumber) {
        this.newAccountCardNumber = newAccountCardNumber;
    }
}
