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
 * Nuclear Upgrade Pane
 * @version 0.2.0
 * @author Haru McClellan
 */
public class NuclearUpgradePane
    extends ContentPane
{
    /////////////////////////// Variables
    
    /**
     * Nuclear Science Reference
     */
    protected NuclearScience     mNucSci;
    
    /**
     * Nuclear Engineering Reference
     */
    protected NuclearEngineering mNucEng;
    
    /**
     * Label for the Button
     */
    protected Label              mActionLabel;
    
    /**
     * Value for the button
     */
    protected Label              mActionValue;
    
    /**
     * Button for the Pane
     */
    protected Button             mActionButton;
    
    /**
     * Label for the Technology Class
     */
    protected Label              mTechLabel;
    
    /**
     * Nuclear Technology List
     */
    protected NuclearTechList    mTechList;
    
    /**
     * Text Area
     */
    protected TextArea           mTechTextArea;
    
    /**
     * Label for the Code
     */
    protected Label              mCodeLabel;
    
    /**
     * TextField Code Value
     */
    protected TextField          mCodeValue;
    
    /**
     * Button for the Class
     */
    protected Button             mCodeButton;    
    
    
    ////////////////////////////////// Constructor
    
    /**
     * Constructor
     * @param pModel the current SimCity Model
     */
    public NuclearUpgradePane(SimCity pModel)
    {
        super(pModel);
    }
    
    
    ///////////////////////////// Methods
    
    /**
     * Gets the Columns
     * @return int array of Columns
     */
    protected int[] getColumns()
    {
        return new int[] {10, 10, 10, 10, 20, 10, 10, 10, 10};
    }

    /**
     * Gets the Rows
     * @return int array of Rows
     */
    protected int[] getRows()
    {
        return new int[] {10, 16, 16, 8, 8, 20, 15, 10, 2};
    }

    /**
     * Gets the title
     * @return String the title
     */
    protected String getTitle()
    {
        return "Nuclear Upgrades";
    }    

    /**
     * Set-up the Current Components
     */
    protected void setup()
    {
        initializeComponents();

        add(getTitleLabel(), 0, 0, 9, 1);
        add(mNucSci        , 1, 1, 7, 1);
        add(mNucEng        , 1, 2, 7, 1);
        add(mActionLabel   , 1, 3, 3, 1);
        add(mActionValue   , 4, 3, 1, 1);
        add(mActionButton  , 5, 3, 2, 1);
        add(mTechLabel     , 1, 4, 4, 1);
        add(mTechList      , 1, 5, 7, 1);
        add(mTechTextArea  , 2, 6, 5, 1);
        add(mCodeLabel     , 0, 7, 3, 1);
        add(mCodeValue     , 3, 7, 2, 1);
        add(mCodeButton    , 5, 7, 2, 1);
    }

    /**
     * Initializer 
     */
    protected void init()
    {
        mActionButton = new Button("Apply");
        mCodeButton   = new Button("Apply");

	mActionButton.setOnAction(new EventHandler<ActionEvent>()
                                  {
                                      public void handle(ActionEvent event)
                                      {
                                          mModel.getUpgradeManager().addNuclearScience    (mNucSci.getChange());
                                          mModel.getUpgradeManager().addNuclearEngineering(mNucEng.getChange());
                                          update();
                                      }
                                  });

        mCodeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        setHalignment(mCodeButton, HPos.CENTER);
    }

    /**
     * Initializer of Components
     */
    protected void initializeComponents()
    {
        mNucSci       = new NuclearScience    (mModel);
        mNucEng       = new NuclearEngineering(mModel);
        mActionLabel  = new Label             ("Action Points:");
        mActionValue  = new Label             ();
        mTechLabel    = new Label             ("Nuclear Technologies");
        mTechList     = new NuclearTechList   (mModel);
        mTechTextArea = new TextArea          ();
        mCodeLabel    = new Label             ("Tech Code:");
        mCodeValue    = new TextField         ();

        setHalignment(mActionLabel , HPos.RIGHT);
        setHalignment(mActionValue , HPos.CENTER);
        setHalignment(mCodeLabel   , HPos.RIGHT);
        setHalignment(mTechTextArea, HPos.CENTER);
        setHalignment(mTechList    , HPos.CENTER);
        setValignment(mTechTextArea, VPos.CENTER);
        setValignment(mTechList    , VPos.CENTER);

        mTechTextArea.setEditable(false);
        mTechTextArea.setWrapText(true);
        mTechTextArea.setMinSize(0, 0);

        mTechList.setMinSize(0, 0);
        mTechList.setMaxSize(350, 100);
        mTechTextArea.setMaxSize(250, 75);

        mTechLabel  .setFont(new Font("Arial", 20));
        mActionLabel.setFont(new Font("Arial", 16));
        mActionValue.setFont(new Font("Arial", 16));

        mCodeValue.setMinSize(0, 0);

        update();
    }

    /**
     * Updater
     */
    protected void update()
    {
	mNucSci.update();
	mNucEng.update();
        mActionValue.setText("" + mModel.getResourceManager().getActionPoints());
    }
}
