package Design_Pattern.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    public void notifyEventHandlers() {
        for (var observer : eventHandlers)
            observer.handle();
    }
}