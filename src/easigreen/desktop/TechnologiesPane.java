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
 * Technologies Pane for Renewable Upgrades
 * @version 0.2.0
 * @author Haru McClellan
 */
public class TechnologiesPane
    extends ContentPane
{
    /**
     * Label for the Technology improvement
     */
    protected Label mImpLabel;
    
    /**
     * Label for the Available Technologies
     */
    protected Label mAvaLabel;
    
    /**
     * Label for all technologies
     */
    protected Label mAllLabel;
    
    /**
     * Conditional label
     */
    protected Label mCodLabel;

    /**
     * Holds the list of Implemented Technologies
     */
    protected ImplementedTechList mImpList;
    
    /**
     * Holds the list of available technologies
     */
    protected AvailableTechList   mAvaList;
    
    /**
     * Holds the list of all technologies
     */
    protected AllTechList         mAllList;

    /**
     * Holds the button to implement things
     */
    protected Button mImplementButton;
    
    /**
     * Holds the button to apply
     */
    protected Button mApplyButton;

    /**
     * Holds the text area
     */
    protected TextArea  mTextArea;
    
    /**
     * Holds the text field
     */
    protected TextField mTextField;

    /**
     * Initializer
     */
    protected void init()
    {
        mImplementButton = new Button("Implement");
        mImplementButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        mApplyButton = new Button("Apply");
        mApplyButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        setHalignment(mImplementButton, HPos.CENTER);
        setHalignment(mApplyButton    , HPos.CENTER);
    }

    /**
     * Set the components
     */
    protected void setComponents()
    {

        mImpLabel  = new Label("Implemented Technologies");
        mAvaLabel  = new Label("Available Technologies"  );
        mAllLabel  = new Label("All Technologies"        );
        mCodLabel  = new Label("Tech Code:"              );

        mImpList   = new ImplementedTechList(mModel);
        mAvaList   = new AvailableTechList  (mModel);
        mAllList   = new AllTechList        (mModel);

        mTextArea  = new TextArea ();
        mTextField = new TextField();

        mImpLabel.setFont(new Font("Arial", 20));
        mAvaLabel.setFont(new Font("Arial", 20));
        mAllLabel.setFont(new Font("Arial", 20));
        mCodLabel.setFont(new Font("Arial", 20));

        mTextArea.setEditable(false);
        mTextField.setMinSize(0, 0);
        mTextArea.setMaxSize(250, 50);

        setHalignment(mCodLabel , HPos.RIGHT);
        setHalignment(mTextField, HPos.CENTER);
        setHalignment(mTextArea , HPos.CENTER);
        setValignment(mTextArea , VPos.CENTER);

        update();
    }

    /**
     * Updater
     */
    protected void update()
    {
        mImpList.update();
        mAvaList.update();
        mAllList.update();
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
     * @return integer array of rows
     */
    protected int[] getRows()
    {
        return new int[] {12, 6, 12, 4, 6, 12, 8, 6, 12, 10, 8, 4};
    }

    /**
     * Gets the title
     * @return the title
     */
    protected String getTitle()
    {
        return "Technologies";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public TechnologiesPane(SimCity pModel)
    {
        super(pModel);
    }

    /*
     * Sets up the various GUI elements
     */
    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();
        add(getTitleLabel(), 0, 0, 5, 1);

        add(mImpLabel       , 1,  1, 3, 1);
        add(mImpList        , 1,  2, 3, 1);
        add(mAvaLabel       , 1,  4, 3, 1);
        add(mAvaList        , 1,  5, 3, 1);
        add(mImplementButton, 1,  6, 3, 1);
        add(mAllLabel       , 1,  7, 3, 1);
        add(mAllList        , 1,  8, 3, 1);
        add(mTextArea       , 1,  9, 3, 1);
        add(mCodLabel       , 1, 10, 1, 1);
        add(mTextField      , 2, 10, 1, 1);
        add(mApplyButton    , 3, 10, 1, 1);
    }
}
