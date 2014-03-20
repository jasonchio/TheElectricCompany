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
   extends ContentPane
{
    private ContentPane mNewTradePane;
    private Button      mNewTrade;

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
	return "Trade";
    }

    protected void init()
    {
	mNewTradePane = new NewTradePane(mModel);
	EventHandler<ActionEvent> newTradeEvent = new PanelChangeEvent(mNewTradePane);
	mNewTrade = new Button("New Trade");
	mNewTrade.setOnAction(newTradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public TradePane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {        
        add(getTitleLabel(), 0, 0);
        add(mNewTrade, 0, 1);
    }
}
