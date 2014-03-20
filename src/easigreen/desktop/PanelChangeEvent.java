package easigreen.desktop;

import easigreen.desktop.*;

import javafx.event.*;

public class PanelChangeEvent
    implements EventHandler<ActionEvent>
{
    ContentPane mPane;

    public PanelChangeEvent(ContentPane pPane)
    {
	mPane = pPane;
    }

    public void handle(ActionEvent event)
    {
	GUI.getInstance().getWindow().setCenter(mPane);
    }
}
