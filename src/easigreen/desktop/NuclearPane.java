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
public class NuclearPane
    extends ContentPane
{
    private ContentPane mNuclearUpgradesPane;
    private Button      mNuclearUpgrades;
    private Button      mApply;
    private Button      mUp;
    private Button      mDown;

    protected static String[] mLabelNames = new String[] {"Plants in Operation", "Supply Provided",
            "Cost", "Public Approval", "Emissions",
            "Security", "Profit"
                                                         };
    protected static String mUpgradeName = new String("Nuclear Upgrades");

    protected Map<String, Label> mLabels;
    protected Map<String, Label> mValues;

    protected int[] getColumns()
    {
        return new int[] {10, 34, 4, 10, 16, 16, 10};
    }

    protected int[] getRows()
    {
        return new int[] {12, 7, 7, 6, 5, 5, 5, 4, 5, 5, 5, 4, 27, 3};
    }

    protected String getTitle()
    {
        return "Nuclear";
    }

    protected void init()
    {
        mNuclearUpgradesPane = new NuclearUpgradePane(mModel);
        EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mNuclearUpgradesPane);
        mNuclearUpgrades = new ImageButton("nuclearupgrade.png", upgradeEvent);
        mApply = new Button("Apply");
        mApply.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        });
        EventHandler<ActionEvent> upEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        };
        EventHandler<ActionEvent> downEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        };
        mUp   = new ImageButton("up.png"  , upEvent);
        mDown = new ImageButton("down.png", downEvent);
        mUp  .setPrefSize(0, 0);
        mDown.setPrefSize(0, 0);
        setHalignment(mDown           , HPos.CENTER);
        setHalignment(mUp             , HPos.CENTER);
        setHalignment(mApply          , HPos.CENTER);
        setHalignment(mNuclearUpgrades, HPos.RIGHT);
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public NuclearPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setLabels();
        add(getTitleLabel() , 0, 0 , 7, 1);
        add(mApply          , 0, 3 , 7, 1);
        add(mNuclearUpgrades, 1, 12, 1, 1);
        add(mUp             , 5,  1, 1, 1);
        add(mDown           , 5,  2, 1, 1);

        add(mLabels.get("Plants in Operation"), 1,  1, 4, 2);
        add(mLabels.get("Supply Provided"    ), 1,  4, 3, 1);
        add(mLabels.get("Cost"               ), 1,  5, 3, 1);
        add(mLabels.get("Public Approval"    ), 1,  6, 3, 1);
        add(mLabels.get("Emissions"          ), 1,  8, 3, 1);
        add(mLabels.get("Security"           ), 1,  9, 3, 1);
        add(mLabels.get("Profit"             ), 1, 10, 3, 1);
        add(mLabels.get(mUpgradeName         ), 3, 12, 3, 1);

        add(mValues.get("Plants in Operation"), 4,  1, 1, 2);
        add(mValues.get("Supply Provided"    ), 4,  4, 1, 1);
        add(mValues.get("Cost"               ), 4,  5, 1, 1);
        add(mValues.get("Public Approval"    ), 4,  6, 1, 1);
        add(mValues.get("Emissions"          ), 4,  8, 1, 1);
        add(mValues.get("Security"           ), 4,  9, 1, 1);
        add(mValues.get("Profit"             ), 4, 10, 1, 1);
    }

    protected void setLabels()
    {
        mLabels = new HashMap<String, Label>();
        mValues = new HashMap<String, Label>();

        for (String name : mLabelNames) {
            Label newLabel1 = new Label(name);
            Label newLabel2 = new Label();
            newLabel1.setFont(new Font("Arial", 20));
            newLabel2.setFont(new Font("Arial", 20));
            setHalignment(newLabel2, HPos.RIGHT);
            mLabels.put(name, newLabel1);
            mValues.put(name, newLabel2);
        }

        Label upgradeLabel = new Label(mUpgradeName);
        upgradeLabel.setFont(new Font("Arial", 25));
        upgradeLabel.setWrapText(true);
        mLabels.put(mUpgradeName, upgradeLabel);

        update();
    }

    protected void update()
    {
        mValues.get("Plants in Operation").setText("0");
        mValues.get("Supply Provided"    ).setText("0");
        mValues.get("Cost"               ).setText("0");
        mValues.get("Public Approval"    ).setText("0");
        mValues.get("Emissions"          ).setText("0");
        mValues.get("Security"           ).setText("0");
        mValues.get("Profit"             ).setText("0");
    }
}
