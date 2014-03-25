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
 * 
 */
public class UpgradeItem
   extends ContentComponent
{
   /**
    * Holds a reference to the model
    */
   protected SimCity mModel;

   protected int[] getColumns()
   {
       return new int[] {15, 45, 25, 15};
   }

   protected int[] getRows()
   {
       return new int[] {49, 17, 17, 17};
   }

    protected String getTitle()
    {
	return new String("Unknown");
    }

    protected String[] getTips()
    {
	return new String[]{"Unknown1", "Unknown2"};
    }

    protected Label mValue;
    protected Label mTitle;
    protected Map<String, Label> mTips;

    protected Button mUp;
    protected Button mDown;

    protected void init()
    {
	EventHandler<ActionEvent> upEvent = new EventHandler<ActionEvent>()
	    {
		public void handle(ActionEvent event)
		{
		}
	    };
	EventHandler<ActionEvent> downEvent = new EventHandler<ActionEvent>()
	    {
		public void handle(ActionEvent event)
		{
		}
	    };
	mUp   = new ImageButton("up.png"  , upEvent);
	mDown = new ImageButton("down.png", downEvent);
	mUp  .setPrefSize(0, 0);
	mDown.setPrefSize(0, 0);
	setHalignment(mUp  , HPos.CENTER);
	setHalignment(mDown, HPos.CENTER);
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
   public UpgradeItem(SimCity pModel)
   {
       super(pModel);
   }

   protected void setup()
   {
       setLabels();
       add(mTitle, 0, 0, 3, 1);

       String[] tipNames = getTips();
       for (int i = 0; i < tipNames.length; i++)
       {
	   add(mTips.get(tipNames[i]), 1, i + 1, 2, 1);
       }

       add(mValue, 2, 0, 1, 4);
       add(mUp   , 3, 0, 1, 1);
       add(mDown , 3, 1, 1, 3);
   }

    protected void setLabels()
    {  
	mValue = new Label("?");
	mTitle = new Label(getTitle());
	mValue.setFont(new Font("Arial", 20));
	mTitle.setFont(new Font("Arial", 20));
	setHalignment(mValue, HPos.RIGHT);
	mTips = new HashMap<String, Label>();
	String[] tipNames = getTips();
	for (String tip : tipNames)
	{
	    Label newTip = new Label(tip);
	    newTip.setFont(new Font("Arial", 12));
	    mTips.put(tip, newTip);
	}
	update();
    }

    protected void update()
    {
	mValue.setText("0");
    }
}
