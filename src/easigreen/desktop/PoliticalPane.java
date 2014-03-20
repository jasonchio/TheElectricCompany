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
public class PoliticalPane
   extends ContentPane
{
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
	return "Political Resources";
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public PoliticalPane(SimCity pModel)
   {
       super(pModel);
   }

    protected void setup()
    {
	setGrid();
	add(getTitleLabel(), 1, 0);
    }
}
