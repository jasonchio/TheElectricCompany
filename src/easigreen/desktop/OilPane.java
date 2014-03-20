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
public class OilPane
   extends ContentPane
{
    private ContentPane mOilUpgradesPane;
    private Button      mOilUpgrades;

    protected int[] getColumns()
    {
	return new int[] {};
    }

    protected int[] getRows()
    {
	return new int[] {};
    }

    protected String getTitle()
    {
	return "Oil";
    }

    protected void init()
    {
	mOilUpgradesPane = new OilUpgradePane(mModel);
	EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mOilUpgradesPane);
        mOilUpgrades = new ImageButton("oilupgrade.png", upgradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public OilPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {        
        add(getTitleLabel(), 0, 0);
        add(mOilUpgrades, 0, 1);
    }
}
