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
public class RenewableEngineering
   extends UpgradeItem
{

    protected String getTitle()
    {
	return new String("Renewable Engineering");
    }

    protected String[] getTips()
    {
	return new String[]{"+Renewable Security", "+Renewable Energy Produced"};
    }

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
    public RenewableEngineering(SimCity pModel)
    {
	super(pModel);
    }

    protected void update()
    {
	mValue.setText("0");
    }
}
