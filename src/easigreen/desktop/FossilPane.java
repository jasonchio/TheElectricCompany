package easigreen.desktop;

import easigreen.service.*;
import easigreen.system.*;

import java.util.*;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 * One of the content panes for Sim City
 */
public class FossilPane
   extends GridPane
{
  /**
    * Holds a reference to the model
    */
   private SimCity model = null;

    private Pane fossilUpgradesPane;

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public FossilPane(SimCity pModel)
   {
       model = pModel;
       fossilUpgradesPane = new FossilUpgradePane(model);
       setUp();
   }

    private void setUp()
    {
        Label  title = new Label("Fossil Fuel");
        EventHandler<ActionEvent> upgradeEvent = new EventHandler<ActionEvent>()
	{
	    public void handle(ActionEvent event)
	    {
		GUI.getInstance().getWindow().setCenter(fossilUpgradesPane);
	    }
	};
        Button fossilUpgrades = new ImageButton("fossilfuelupgrade.png", upgradeEvent);

        add(title, 0, 0);
        add(fossilUpgrades, 0, 1);
    }

}
