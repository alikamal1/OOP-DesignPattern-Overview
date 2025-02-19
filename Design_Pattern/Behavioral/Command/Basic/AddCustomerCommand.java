package Design_Pattern.Behavioral.Command.Basic;

import Design_Pattern.Behavioral.Command.Basic.Framwork.Command;

public class AddCustomerCommand implements Command {

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }


}