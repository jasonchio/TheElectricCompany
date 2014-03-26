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
public class NewTradePane
    extends ContentPane
{
    protected Button mSubmit;

    protected TradeBasePane mOffer;
    protected TradeBasePane mRequest;

    protected int[] getColumns()
    {
        return new int[] {12, 76, 12};
    }

    protected int[] getRows()
    {
        return new int[] {10, 40, 40, 10};
    }

    protected String getTitle()
    {
        return "New Trade";
    }

    protected void init()
    {
        mOffer   = new TradeOfferPane(mModel);
        mRequest = new TradeRequestPane(mModel);
        mSubmit  = new Button("Submit");
        setHalignment(mSubmit, HPos.CENTER);
        mSubmit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public NewTradePane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        add(getTitleLabel(), 1, 0);
        add(mOffer         , 1, 1);
        add(mRequest       , 1, 2);
        add(mSubmit        , 1, 3);
    }
}
