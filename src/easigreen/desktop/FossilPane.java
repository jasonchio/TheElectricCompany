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
public class FossilPane
   extends ContentPane
{
    private ContentPane mFossilUpgradesPane;
    private Button      mFossilUpgrades;

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
	return "Fossil Fuel";
    }

    protected void init()
    {
	mFossilUpgradesPane = new FossilUpgradePane(mModel);
	EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mFossilUpgradesPane);
        mFossilUpgrades = new ImageButton("fossilfuelupgrade.png", upgradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public FossilPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {        
        add(getTitleLabel(), 0, 0);
        add(mFossilUpgrades, 0, 1);
    }
}
