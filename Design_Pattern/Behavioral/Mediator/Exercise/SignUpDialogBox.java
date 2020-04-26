package Design_Pattern.Behavioral.Mediator.Exercise;

public class SignUpDialogBox {

    
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox agreeCheckBox = new CheckBox();
    private Button signupButton = new Button();

    SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        agreeCheckBox.addEventHandler(this::controlChanged);
    }
    
    public void controlChanged() {
        signupButton.setEnabled(isFormValid());
    }

    public boolean isFormValid() {
        return (!usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeCheckBox.isChecked());
    }

    
    public void simulateUserInteraction() {
        usernameTextBox.setContent("admin");
        passwordTextBox.setContent("12345");
        agreeCheckBox.setChecked(true);
        System.out.println("Username: " + usernameTextBox.getContent());
        System.out.println("Password: " + passwordTextBox.getContent());
        System.out.println("Agree: " + agreeCheckBox.isChecked());
        System.out.println("Singup: " + signupButton.isEnabled());

        usernameTextBox.setContent("admin");
        passwordTextBox.setContent("12345");
        agreeCheckBox.setChecked(false);
        System.out.println("Username: " + usernameTextBox.getContent());
        System.out.println("Password: " + passwordTextBox.getContent());
        System.out.println("Agree: " + agreeCheckBox.isChecked());
        System.out.println("Singup: " + signupButton.isEnabled());

    }



}