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
 * Trade Offer Pane
 * @version 0.2.0
 * @author Haru McClellan
 */
public class TradeOfferPane
    extends TradeBasePane
{
    /**
     * Get title
     * @return the title
     */
    protected String getTitle()
    {
        return "Offering";
    }

    /**
     * Initializer
     */
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
     * @param pModel the current SimCity Model
     */
    public TradeOfferPane(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Updater
     */
    public void update()
    {
    }
}
