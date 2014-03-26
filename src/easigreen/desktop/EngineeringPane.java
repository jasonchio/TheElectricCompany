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
 * A content pane for sim city
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */
public class EngineeringPane
    extends ContentPane
{
    /**
     * Holds Nuclear Engineering object
     */
    protected NuclearEngineering   mNucEng;
    
    /**
     * Holds Fossil Engineering object
     */
    protected FossilEngineering    mFosEng;
    
    /**
     * Holds Renewable Engineering object
     */
    protected RenewableEngineering mRenEng;

    /**
     * Holds Label for the action label
     */
    protected Label   mActionLabel;
    
    /**
     * Holds Label for the action value
     */
    protected Label   mActionValue;
    
    /**
     * Holds Button for the action
     */
    protected Button  mActionButton;

    /**
     * Initializer
     */
    protected void init()
    {
        mActionButton = new Button("Apply");
        mActionButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        setHalignment(mActionButton, HPos.LEFT);
    }

    /**
     * Sets the components, initializer of buttons, labels, etc.
     */
    protected void setComponents()
    {
        mNucEng = new NuclearEngineering  (mModel);
        mFosEng = new FossilEngineering   (mModel);
        mRenEng = new RenewableEngineering(mModel);
        mActionLabel = new Label("Action Points:");
        setHalignment(mActionLabel, HPos.RIGHT);
        mActionValue = new Label();
        setHalignment(mActionValue, HPos.CENTER);
        update();
    }

    /**
     * Updater
     */
    protected void update()
    {
        mActionValue.setText("0");
    }

    /**
     * Gets the columns
     * @return integer array of columns
     */
    protected int[] getColumns()
    {
        return new int[] {12, 25, 26, 25, 12};
    }

    /**
     * Gets the rows
     * @return integer array of the rows
     */
    protected int[] getRows()
    {
        return new int[] {12, 25, 25, 25, 13};
    }

    /**
     * Retrieves the title for this Pane
     * @return String title of the pane
     */
    protected String getTitle()
    {
        return "Engineering Upgrades";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public EngineeringPane(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Set up of buttons, labels, etc. 
     */
    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();

        add(getTitleLabel(), 0, 0, 5, 1);
        add(mNucEng        , 1, 1, 3, 1);
        add(mFosEng        , 1, 2, 3, 1);
        add(mRenEng        , 1, 3, 3, 1);
        add(mActionLabel   , 1, 4, 1, 1);
        add(mActionValue   , 2, 4, 1, 1);
        add(mActionButton  , 3, 4, 1, 1);
    }
}
