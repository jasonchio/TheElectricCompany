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
public class OilUpgradePane
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
    public OilUpgradePane(SimCity pModel)
   {
       model = pModel;
       add(new Label("Oil Upgrades"), 0, 0);
   }
}
