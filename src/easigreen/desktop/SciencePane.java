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
public class SciencePane
    extends ContentPane
{

    protected NuclearScience   mNucSci;
    protected FossilScience    mFosSci;
    protected RenewableScience mRenSci;
    protected OilScience       mOilSci;

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
        mNucSci = new NuclearScience  (mModel);
        mFosSci = new FossilScience   (mModel);
        mRenSci = new RenewableScience(mModel);
        mOilSci = new OilScience      (mModel);
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
        return new int[] {12, 19, 19, 19, 19, 12};
    }

    protected String getTitle()
    {
        return "Science Upgrades";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public SciencePane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();

        add(getTitleLabel(), 0, 0, 5, 1);
        add(mNucSci        , 1, 1, 3, 1);
        add(mFosSci        , 1, 2, 3, 1);
        add(mRenSci        , 1, 3, 3, 1);
        add(mOilSci        , 1, 4, 3, 1);
        add(mActionLabel   , 1, 5, 1, 1);
        add(mActionValue   , 2, 5, 1, 1);
        add(mActionButton  , 3, 5, 1, 1);
    }
}
