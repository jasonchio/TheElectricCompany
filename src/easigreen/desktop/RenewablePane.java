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
   extends ContentPane
{
    private ContentPane mRenewableUpgradesPane;
    private Button      mRenewableUpgrades;

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
	return "Renewable";
    }

    protected void init()
    {
	mRenewableUpgradesPane = new RenewableUpgradePane(mModel);
	EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mRenewableUpgradesPane);
        mRenewableUpgrades = new ImageButton("renewableupgrade.png", upgradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public RenewablePane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {        
        add(getTitleLabel(), 0, 0);
        add(mRenewableUpgrades, 0, 1);
    }
}
