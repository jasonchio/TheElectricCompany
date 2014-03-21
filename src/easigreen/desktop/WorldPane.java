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
public class WorldPane
   extends ContentPane
{
    protected CountryList mCountries;
    protected CountryPane mCountryPane;
    protected Button mView;

    protected int[] getColumns()
    {
	return new int[] {20, 60, 20};
    }

    protected int[] getRows()
    {
	return new int[] {12, 4, 70, 2, 6, 6};
    }

    protected String getTitle()
    {
	return "Country Rankings";
    }

    protected void init()
    {
        mCountryPane = new CountryPane(mModel);
        EventHandler<ActionEvent> newTradeEvent = new EventHandler<ActionEvent>()
	    {
		public void handle(ActionEvent event)
		{
		    mCountryPane.setCountry("Another Country");
		    GUI.getInstance().getWindow().setCenter(mCountryPane);
		}
	    };
        mView = new Button("View");
        mView.setOnAction(newTradeEvent);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public WorldPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {
	mCountries = new CountryList(mModel);
	add(getTitleLabel(), 0, 0, 3, 1);
	add(mCountries, 1, 2, 1, 1);
	setHalignment(mView, HPos.CENTER);
	add(mView, 1, 4);
    }

    protected void update()
    {
	mCountries.update();
    }
}
