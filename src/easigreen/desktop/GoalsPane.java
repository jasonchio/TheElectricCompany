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
public class GoalsPane
    extends ContentPane
{
    protected static String[] mLabelNames = new String[] {"Power Demand"    , "Power Supply"   ,
            "Budget"          , "Total Spent"    ,
            "Minimum Approval", "Public Approval",
            "Target Emissions", "Total Emissions",
            "Target Security" , "Total Security" ,
            "Target Profit"   , "Total Profit"
                                                         };

    protected Map<String, Label> mLabels;
    protected Map<String, Label> mValues;
    protected Map<String, ImageLabel> mImages;

    protected int[] getColumns()
    {
        return new int[] {12, 8, 33, 25, 10, 12};
    }

    protected int[] getRows()
    {
        return new int[] {10, 6, 5, 5, 1, 5, 5, 1, 5, 5, 4, 6, 5, 5, 1, 5, 5, 1, 5, 5, 10};
    }

    protected String getTitle()
    {
        return "Goals";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public GoalsPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setLabels();
        add(getTitleLabel(), 0, 0, 6, 1);

        add(mLabels.get("Short Term"      ), 1,  1, 2, 1);
        add(mLabels.get("Power Demand"    ), 2,  2, 1, 1);
        add(mLabels.get("Power Supply"    ), 2,  3, 1, 1);
        add(mLabels.get("Budget"          ), 2,  5, 1, 1);
        add(mLabels.get("Total Spent"     ), 2,  6, 1, 1);
        add(mLabels.get("Minimum Approval"), 2,  8, 1, 1);
        add(mLabels.get("Public Approval" ), 2,  9, 1, 1);
        add(mValues.get("Power Demand"    ), 3,  2, 1, 1);
        add(mValues.get("Power Supply"    ), 3,  3, 1, 1);
        add(mValues.get("Budget"          ), 3,  5, 1, 1);
        add(mValues.get("Total Spent"     ), 3,  6, 1, 1);
        add(mValues.get("Minimum Approval"), 3,  8, 1, 1);
        add(mValues.get("Public Approval" ), 3,  9, 1, 1);

        add(mLabels.get("Long Term"       ), 1, 11, 2, 1);
        add(mLabels.get("Target Emissions"), 2, 12, 1, 1);
        add(mLabels.get("Total Emissions" ), 2, 13, 1, 1);
        add(mLabels.get("Target Security" ), 2, 15, 1, 1);
        add(mLabels.get("Total Security"  ), 2, 16, 1, 1);
        add(mLabels.get("Target Profit"   ), 2, 18, 1, 1);
        add(mLabels.get("Total Profit"    ), 2, 19, 1, 1);
        add(mValues.get("Target Emissions"), 3, 12, 1, 1);
        add(mValues.get("Total Emissions" ), 3, 13, 1, 1);
        add(mValues.get("Target Security" ), 3, 15, 1, 1);
        add(mValues.get("Total Security"  ), 3, 16, 1, 1);
        add(mValues.get("Target Profit"   ), 3, 18, 1, 1);
        add(mValues.get("Total Profit"    ), 3, 19, 1, 1);

        add(mImages.get("Power Demand"    ), 4,  2, 1, 2);
        add(mImages.get("Budget"          ), 4,  5, 1, 2);
        add(mImages.get("Minimum Approval"), 4,  8, 1, 2);
        add(mImages.get("Target Emissions"), 4, 12, 1, 2);
        add(mImages.get("Target Security" ), 4, 15, 1, 2);
        add(mImages.get("Target Profit"   ), 4, 18, 1, 2);
    }

    protected void setLabels()
    {
        mLabels = new HashMap<String, Label>();
        mValues = new HashMap<String, Label>();
        mImages = new HashMap<String, ImageLabel>();
        int i = 0;
        for (String name : mLabelNames) {
            Label newLabel = new Label(name + ":");
            Label newValue = new Label();
            newLabel.setMinSize(0, 0);
            newValue.setMinSize(0, 0);
            setHalignment(newValue, HPos.CENTER);
            newLabel.setFont(new Font("Arial", 14));
            newValue.setFont(new Font("Arial", 14));
            mLabels.put(name, newLabel);
            mValues.put(name, newValue);
            if (i++ % 2 == 0) {
                mImages.put(name, new ImageLabel());
            }
        }

        Label shortTerm = new Label("Short Term");
        Label longTerm  = new Label("Long Term" );

        shortTerm.setFont(new Font("Arial", 18));
        longTerm .setFont(new Font("Arial", 18));

        mLabels.put("Short Term", shortTerm);
        mLabels.put("Long Term" , longTerm );

        update();
    }

    protected void update()
    {
        mValues.get("Power Demand"    ).setText("0");
        mValues.get("Power Supply"    ).setText("0");
        mValues.get("Budget"          ).setText("0");
        mValues.get("Total Spent"     ).setText("0");
        mValues.get("Minimum Approval").setText("0");
        mValues.get("Public Approval" ).setText("0");

        mValues.get("Target Emissions").setText("0");
        mValues.get("Total Emissions" ).setText("0");
        mValues.get("Target Security" ).setText("0");
        mValues.get("Total Security"  ).setText("0");
        mValues.get("Target Profit"   ).setText("0");
        mValues.get("Total Profit"    ).setText("0");

        mImages.get("Power Demand"    ).setImage("bad.png" );
        mImages.get("Budget"          ).setImage("good.png");
        mImages.get("Minimum Approval").setImage("good.png");
        mImages.get("Target Emissions").setImage("good.png");
        mImages.get("Target Security" ).setImage("bad.png" );
        mImages.get("Target Profit"   ).setImage("bad.png" );
    }
}
