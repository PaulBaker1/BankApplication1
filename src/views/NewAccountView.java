package views;

import models.NewAccount;

public class NewAccountView {

    NewAccount model = new NewAccount();

   public void declareNewBankAccount(String newAccountName, String newAccountSurname,
                                           double newAccountNumber, String newAccountLogin, double newAccountCardNumber) {
        newAccountName =  model.recieveNewAccountName();
        newAccountSurname = model.recieveNewAccountSurname();
        newAccountLogin = model.recieveNewAccountLogin();
        newAccountNumber = model.randomAccountNumber();
        newAccountCardNumber = model.randomAccountCardNumber();
}

    public void printNewBankAccount(String newAccountName, String newAccountSurname,
                                           double newAccountNumber, String newAccountLogin, double newAccountCardNumber) {

        System.out.println("Users name: " + model.getNewAccountName());
        System.out.println("Users surname: " + model.getNewAccountSurname());
        System.out.println("Users login: " + model.getNewAccountLogin());
        System.out.println("Users account number: " + model.getNewAccountNumber());
        System.out.println("Users account card number : " + model.getNewAccountCardNumber());


    }
}
