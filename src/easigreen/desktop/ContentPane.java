package easigreen.desktop;

import easigreen.service.*;

import java.util.*;

import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.text.*;

/**
 * A Panel for the center data region of the GUI interface
 */
public class ContentPane
   extends GridPane
{
   /**
    * Holds a reference to the model
    */
   protected SimCity mModel;

   protected int[] getColumns()
   {
      return new int[] {12, 76, 12};
   }

   protected int[] getRows()
   {
      return new int[] {16, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 32};
   }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
   public ContentPane(SimCity pModel)
   {
       mModel = pModel;
       init();
       setGrid();
       setup();
   }

   protected void setup()
   {
   }

   protected String getTitle()
   {
      return "Unknown";
   }

    protected Label getTitleLabel()
    {
	Label title = new Label(getTitle());
	title.setFont(new Font("Arial", 40));
	setHalignment(title, HPos.CENTER);
	return title;
    }

   protected void init()
   {
   }

    protected void update()
    {
    }

   protected void setGrid()
   {
      int[] columns = getColumns();
      for (int i = 0; i < columns.length; i++)
      {
         ColumnConstraints column = new ColumnConstraints();
         column.setPercentWidth(columns[i]);
         getColumnConstraints().add(column);
      }
      int[] rows = getRows();
      for (int i = 0; i < rows.length; i++)
      {
         RowConstraints row = new RowConstraints();
         row.setPercentHeight(rows[i]);
         getRowConstraints().add(row);
      }
   }
}
