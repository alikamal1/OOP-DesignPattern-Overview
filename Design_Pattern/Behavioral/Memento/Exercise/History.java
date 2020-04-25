package Design_Pattern.Behavioral.Memento.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;

// caretaker
public class History {

    private Deque<DocumentState> states = new ArrayDeque<>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }

}