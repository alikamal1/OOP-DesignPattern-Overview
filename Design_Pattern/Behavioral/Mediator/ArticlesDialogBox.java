package Design_Pattern.Behavioral.Mediator;

public class ArticlesDialogBox {

    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button savebButton = new Button();

    public ArticlesDialogBox() {
        // Anonymous
        // articleListBox.addEventHandler(new Observer(){
        // @Override
        // public void update() {
        // articleSelected();
        // }
        // });

        // Lambda
        // articleListBox.addEventHandler( () -> articleSelected());

        articleListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);

    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button:" + savebButton.isEnabled());

        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button:" + savebButton.isEnabled());

    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        savebButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        savebButton.setEnabled(!isEmpty);
    }

}