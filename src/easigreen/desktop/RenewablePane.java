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
import javafx.scene.text.*;
import javafx.stage.*;

/**
 * One of the content panes for Sim City
 */
public class RenewablePane
   extends GridPane
{
  /**
    * Holds a reference to the model
    */
   private SimCity model = null;

    private Pane renewableUpgradesPane;

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public RenewablePane(SimCity pModel)
   {
       model = pModel;
       renewableUpgradesPane = new RenewableUpgradePane(model);
       setup();
   }

    private void setup()
    {
        Label  title = new Label("Renewable");
	title.setFont(new Font("Arial", 40));
        setHalignment(title, HPos.CENTER);

        EventHandler<ActionEvent> upgradeEvent = new EventHandler<ActionEvent>()
	{
	    public void handle(ActionEvent event)
	    {
		GUI.getInstance().getWindow().setCenter(renewableUpgradesPane);
	    }
	};
        Button renewableUpgrades = new ImageButton("renewableupgrade.png", upgradeEvent);

        add(title, 0, 0);
        add(renewableUpgrades, 0, 1);
    }

}
