package Design_Pattern.Behavioral.Command.Basic;

import Design_Pattern.Behavioral.Command.Basic.Framwork.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}