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

    private static final int[] COLUMNS = new int[] {12, 76, 12};
    private static final int[] ROWS    = new int[] {16, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 32};

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
	setGrid();
	Label title = new Label("Country");
	title.setFont(new Font("Arial", 40));
	setHalignment(title, HPos.CENTER);
	add(title, 1, 0);
    }

    private void setGrid()
    {
	for (int i = 0; i < COLUMNS.length; i++)
	{
	    ColumnConstraints column = new ColumnConstraints();
	    column.setPercentWidth(COLUMNS[i]);
	    getColumnConstraints().add(column);
	}

	for (int i = 0; i < ROWS.length; i++)
	{
	    RowConstraints row = new RowConstraints();
	    row.setPercentHeight(ROWS[i]);
	    getRowConstraints().add(row);
	}
    }
}
