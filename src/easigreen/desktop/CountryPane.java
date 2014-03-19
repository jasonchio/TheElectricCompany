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
public class CountryPane
   extends GridPane
{
  /**
    * Holds a reference to the model
    */
       private SimCity model = null;

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public CountryPane(SimCity pModel)
   {
       model = pModel;
       setup();
   }

    private void setup()
    {
	Label title = new Label("Country");
	title.setFont(new Font("Arial", 40));
	setHalignment(title, HPos.CENTER);
	add(title, 0, 0);
    }
}
