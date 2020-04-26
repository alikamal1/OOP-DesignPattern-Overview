package Design_Pattern.Behavioral.Mediator.Exercise;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void notifyHandlers() {
        for(var handler : eventHandlers)
            handler.handle();
    }

}
