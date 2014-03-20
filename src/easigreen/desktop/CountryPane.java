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
   extends ContentPane
{

    Map<String, Label> mValues;

    protected String[] getCategories()
    {
	return new String[]{"Nuclear Plants", "Fossil Fuel Plants", "Renewable Plants",
			    "",
			    "Energy Supplied", "Available Funds", "Public Approval", "Oil Consumption",
			    "",
			    "Total Profit", "Total Security", "Total Emissions",
			    "",
			    "Technologies Implemented"};
    }

    protected String[] mCategories;

    protected Label[] mLabels;

    protected int[] getColumns()
    {
	return new int[] {12, 6, 64, 6, 12};
    }

    protected int[] getRows()
    {
	return new int[] {16, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 32};
    }

    protected String getTitle()
    {
	return "Country";
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public CountryPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {
	setGrid();
	initializeLabels();

	add(getTitleLabel(), 1, 0, 3, 1);
	for (int i = 0; i < mCategories.length; i++)
	{
	    if (!mCategories[i].equals(""))
	    {
		add(mLabels[i], 2, i + 1);
		add(mValues.get(mCategories[i]), 3, i + 1);
	    }
	}
    }

    
    protected void initializeLabels()
    {
	mCategories = getCategories();
	mLabels = new Label[mCategories.length];
	mValues = new HashMap<String, Label>();
	for (int i = 0; i < mCategories.length; i++)
	{
	    if (!mCategories[i].equals(""))
	    {
		mLabels[i] = new Label(mCategories[i] + ":");
		mValues.put(mCategories[i], new Label());
	    }
	}

	update();
    }

    protected void update()
    {
	mValues.get("Nuclear Plants"    ).setText("0"); // Zeros represent Updated model data
	mValues.get("Fossil Fuel Plants").setText("0");
	mValues.get("Renewable Plants"  ).setText("0");
	
	mValues.get("Energy Supplied"   ).setText("0");
	mValues.get("Available Funds"   ).setText("0");
	mValues.get("Public Approval"   ).setText("0");
	mValues.get("Oil Consumption"   ).setText("0");
	
	mValues.get("Total Profit"      ).setText("0");
	mValues.get("Total Security"    ).setText("0");
	mValues.get("Total Emissions"   ).setText("0");
	
	mValues.get("Technologies Implemented").setText("0");
    }

}
