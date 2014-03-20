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
public class NuclearPane
   extends ContentPane
{
    private ContentPane mNuclearUpgradesPane;
    private Button      mNuclearUpgrades;

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
	return "Nuclear";
    }

    protected void init()
    {
	mNuclearUpgradesPane = new NuclearUpgradePane(mModel);
	EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mNuclearUpgradesPane);
        mNuclearUpgrades = new ImageButton("nuclearupgrade.png", upgradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public NuclearPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {        
        add(getTitleLabel(), 0, 0);
        add(mNuclearUpgrades, 0, 1);
    }
}
