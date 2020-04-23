package Design_Pattern.Observer;

public class Chart implements Observer {

    // Basic
    // @Override
    // public void update() {
    //     System.out.println("Chart got notified.");
    // }

    // Push
    // @Override
    // public void update(int value) {
    //     System.out.println("Chart got notified. value =" + value);
    // }

    // Pull
    private DataSource dataSource;
    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified.value =" + dataSource.getValue() );
    }

   

}