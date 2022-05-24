//private String newAccountName;
//private String newAccountSurname;
//private String newAccountLogin;
//private int newAccountNumber;
//private int newAccountCardNumber;

package controllers;

import models.NewAccount;
import views.NewAccountView;

public class NewAccountController {

    // decklarujemy zmienne klasowe model i view
    private NewAccount model;
    private NewAccountView view;

    // konstruktor do initalizacji obiektow
    public NewAccountController(NewAccount model, NewAccountView view) {
        this.model = model;
        this.view = view;
    }

    public void setnewAccountName(String accountName) {
        model.setNewAccountName(accountName);
    }

    public String getnewAccountName() {
        return model.getNewAccountName();
    }

    public void setnewAccountSurname(String accountSurname) {
        model.setNewAccountSurname(accountSurname);
    }

    public String getnewAccountSuranme() {
        return model.getNewAccountSurname();
    }

    public void setnewAccountLogin(String newAccountLogin) {
        model.setNewAccountName(newAccountLogin);
    }

    public String getnewAccountLogin() {
        return model.getNewAccountLogin();
    }

    public void setnewAccountNumber(double newAccountNumber) {
        model.setNewAccountNumber(newAccountNumber);
    }

    public double getnewAccountNumber() {
        return model.getNewAccountNumber();
    }

    public void setnewAccountCardNumber(double accountCardNumber) {
        model.setNewAccountCardNumber(accountCardNumber);
    }

    public double getnewAccountCardNumber() {
        return model.getNewAccountCardNumber();
    }

    public void updateView() {
        view.declareNewBankAccount(model.getNewAccountName(), model.getNewAccountSurname(),
                model.getNewAccountNumber(), model.getNewAccountLogin(), model.getNewAccountCardNumber());

        view.printNewBankAccount(model.getNewAccountName(), model.getNewAccountSurname(),
                model.getNewAccountNumber(), model.getNewAccountLogin(), model.getNewAccountCardNumber());

    }
}


