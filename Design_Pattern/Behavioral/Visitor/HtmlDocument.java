package Design_Pattern.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void excute(Operation operation) {
        for (var node : nodes)
            node.excute(operation);
    }

}