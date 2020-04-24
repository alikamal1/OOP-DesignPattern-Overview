package Design_Pattern.Behavioral.Template;

public class Main {
    public static void main(String[] args) {
        var firstTask = new TransferMoneyTask();
        firstTask.execute();

        var auditTrail = new AuditTrail();
        var secondTask = new GenerateReportTask(auditTrail);
        secondTask.execute();

    }
}