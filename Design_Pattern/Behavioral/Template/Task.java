package Design_Pattern.Behavioral.Template;

public abstract class Task {

    private AuditTrail auditTrail;
    public Task() {
        auditTrail = new AuditTrail();
    }

    // for second task using super()
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();

}