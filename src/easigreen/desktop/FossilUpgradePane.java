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
public class FossilUpgradePane
    extends ContentPane
{
    protected int[] getColumns()
    {
        return new int[] {10, 10, 10, 10, 20, 10, 10, 10, 10};
    }

    protected int[] getRows()
    {
        return new int[] {10, 16, 16, 8, 8, 20, 15, 10, 2};
    }

    protected String getTitle()
    {
        return "Fossil Fuel Upgrades";
    }

    protected FossilScience     mFossilSci;
    protected FossilEngineering mFossilEng;
    protected Label             mActionLabel;
    protected Label             mActionValue;
    protected Button            mActionButton;
    protected Label             mTechLabel;
    protected FossilTechList    mTechList;
    protected TextArea          mTechTextArea;
    protected Label             mCodeLabel;
    protected TextField         mCodeValue;
    protected Button            mCodeButton;

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public FossilUpgradePane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);

        initializeComponents();

        add(getTitleLabel(), 0, 0, 9, 1);
        add(mFossilSci     , 1, 1, 7, 1);
        add(mFossilEng     , 1, 2, 7, 1);
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

    protected void init()
    {
        mActionButton = new Button("Apply");
        mCodeButton   = new Button("Apply");

	mActionButton.setOnAction(new EventHandler<ActionEvent>()
                                  {
                                      public void handle(ActionEvent event)
                                      {
                                          mModel.getUpgradeManager().addFossilScience    (mFossilSci.getChange());
                                          mModel.getUpgradeManager().addFossilEngineering(mFossilEng.getChange());
                                          update();
                                      }
                                  });

        mCodeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });

        setHalignment(mCodeButton, HPos.CENTER);
    }

    protected void initializeComponents()
    {
        mFossilSci    = new FossilScience    (mModel);
        mFossilEng    = new FossilEngineering(mModel);
        mActionLabel  = new Label            ("Action Points:");
        mActionValue  = new Label            ();
        mTechLabel    = new Label            ("Fossil Fuel Technologies");
        mTechList     = new FossilTechList   (mModel);
        mTechTextArea = new TextArea         ();
        mCodeLabel    = new Label            ("Tech Code:");
        mCodeValue    = new TextField        ();
	
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

    protected void update()
    {
	mFossilSci.update();
	mFossilEng.update();
        mActionValue.setText("" + mModel.getResourceManager().getActionPoints());
    }
}
