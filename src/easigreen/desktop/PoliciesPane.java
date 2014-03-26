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
public class PoliciesPane
    extends ContentPane
{

    protected PriceChange mPrice;
    protected Lobby       mLobby;
    protected OilDrilling mOil;

    protected Label            mActionLabel;
    protected Label            mActionValue;
    protected Button           mActionButton;

    protected void init()
    {
        mActionButton = new Button("Apply");
        mActionButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        setHalignment(mActionButton, HPos.LEFT);
    }

    protected void setComponents()
    {
        mPrice = new PriceChange(mModel);
        mLobby = new Lobby      (mModel);
        mOil   = new OilDrilling(mModel);
        mActionLabel = new Label("Action Points:");
        setHalignment(mActionLabel, HPos.RIGHT);
        mActionValue = new Label();
        setHalignment(mActionValue, HPos.CENTER);
        update();
    }

    protected void update()
    {
        mActionValue.setText("0");
    }

    protected int[] getColumns()
    {
        return new int[] {12, 25, 26, 25, 12};
    }

    protected int[] getRows()
    {
        return new int[] {12, 25, 25, 25, 13};
    }

    protected String getTitle()
    {
        return "Policies";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public PoliciesPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();

        add(getTitleLabel(), 0, 0, 5, 1);
        add(mPrice         , 1, 1, 3, 1);
        add(mLobby         , 1, 2, 3, 1);
        add(mOil           , 1, 3, 3, 1);
        add(mActionLabel   , 1, 4, 1, 1);
        add(mActionValue   , 2, 4, 1, 1);
        add(mActionButton  , 3, 4, 1, 1);
    }
}
