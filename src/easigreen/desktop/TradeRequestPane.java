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
public class TradeRequestPane
   extends TradeBasePane
{
    protected String getTitle()
    {
	return "Requesting";
    }

    protected void init()
    {
	mTechs           = new AppDataList(mModel);
	mInsert          = new TextArea();
	mInsert.setMinSize(0, 0);
	mInsert.setWrapText(true);
	mInsert.setEditable(false);
	mAdd             = new Button("Add");
    }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
    public TradeRequestPane(SimCity pModel)
    {
       super(pModel);
    }

    public void update()
    {
    }
}
