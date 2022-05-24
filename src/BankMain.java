import controllers.NewAccountController;
import models.NewAccount;
import views.NewAccountView;

public class BankMain {
    public static void main(String[] args) {

        NewAccountView view = new NewAccountView();
        NewAccount model = new NewAccount();

        NewAccountController controller = new NewAccountController(model, view);

        controller.updateView();



        // NewAccount model = retriveNewAccount();

    }
}
