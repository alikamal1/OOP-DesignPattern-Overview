package Design_Pattern.Behavioral.Template;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }

}