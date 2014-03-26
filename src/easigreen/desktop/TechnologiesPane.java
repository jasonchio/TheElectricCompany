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
public class TechnologiesPane
    extends ContentPane
{
    protected Label mImpLabel;
    protected Label mAvaLabel;
    protected Label mAllLabel;
    protected Label mCodLabel;

    protected ImplementedTechList mImpList;
    protected AvailableTechList   mAvaList;
    protected AllTechList         mAllList;

    protected Button mImplementButton;
    protected Button mApplyButton;

    protected TextArea  mTextArea;
    protected TextField mTextField;

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

    protected void update()
    {
        mImpList.update();
        mAvaList.update();
        mAllList.update();
    }

    protected int[] getColumns()
    {
        return new int[] {12, 25, 26, 25, 12};
    }

    protected int[] getRows()
    {
        return new int[] {12, 6, 12, 4, 6, 12, 8, 6, 12, 10, 8, 4};
    }

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
