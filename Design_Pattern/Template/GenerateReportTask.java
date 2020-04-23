package Design_Pattern.Template;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }

    // for second task
    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }


}