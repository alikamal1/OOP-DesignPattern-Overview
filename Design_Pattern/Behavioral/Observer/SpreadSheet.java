package Design_Pattern.Behavioral.Observer;

public class SpreadSheet implements Observer {

    // Basic
    // @Override
    // public void update() {
    //     System.out.println("SpreadSheet got notified. value = ");
    // }

    // Push
    // @Override
    // public void update(int value) {
    //     System.out.println("SpreadSheet got notified. value = " + value);
    // }

    // Pull
    private DataSource dataSource;
    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified. value = " + dataSource.getValue());
    }


}