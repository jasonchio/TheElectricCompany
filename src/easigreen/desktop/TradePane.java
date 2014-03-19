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
public class TradePane
   extends GridPane
{
  /**
    * Holds a reference to the model
    */
   private SimCity model = null;

    private Pane newTradePane;

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public TradePane(SimCity pModel)
   {
       model = pModel;
       newTradePane = new NewTradePane(model);
       setup();
   }

    private void setup()
    {
	Label  title = new Label("Trade");
	title.setFont(new Font("Arial", 40));
        setHalignment(title, HPos.CENTER);

	Button newTrade = new Button("New Trade");
	newTrade.setOnAction(new EventHandler<ActionEvent>()
			     {
				 public void handle(ActionEvent event)
				 {
				     GUI.getInstance().getWindow().setCenter(newTradePane);
				 }
			     });
	add(title, 0, 0);
	add(newTrade, 0, 1);
    }
}
