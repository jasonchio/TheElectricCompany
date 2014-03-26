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
 * Upgrade Item
 * @version 0.2.0
 * @author Haru McClellan
 */
public class UpgradesPane
    extends ContentPane
{
    /**
     * Holds the label names
     */
    protected static String[] mLabelNames = new String[] {"Nuclear Science", "Fossil Fuel Science",
            "Renewable Science", "Oil Science",
            "Nuclear Engineering", "Fossil Fuel Engineering",
            "Renewable Engineering", "Price Change",
            "Lobby", "Oil Drilling"
                                                         };

    /**
     * Holds the technology title
     */
    protected static String mTechTitle = new String("Implemented Technologies");

    /**
     * Holds the map of strings to labels
     */
    protected Map<String, Label> mLabels;
    
    /**
     * Holds the map of string to labels 
     */
    protected Map<String, Label> mValues;

    /**
     * Holds the implemented technology list
     */
    protected ImplementedTechList mTechList;

    /**
     * Gets the Columns
     * @return integer array of columns
     */
    protected int[] getColumns()
    {
        return new int[] {12, 66, 10, 12};
    }

    /**
     * Holds the rows
     */
    protected int[] getRows()
    {
        return new int[] {12, 6, 6, 6, 6, 4, 6, 6, 6, 4, 6, 6, 6, 6, 12, 2};
    }

    /**
     * Holds the map names
     */
    protected String getTitle()
    {
        return "Upgrades";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public UpgradesPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        mTechList = new ImplementedTechList(mModel);
        setLabels();
        add(getTitleLabel(), 0, 0, 4, 1);

        int i = 1;
        for (String name : mLabelNames) {
            add(mLabels.get(name), 1, i  , 1, 1);
            add(mValues.get(name), 2, i++, 1, 1);
            if ((i == 5) || (i == 9)) {
                i++;
            }
        }
        add(mLabels.get(mTechTitle), 1, i++, 1, 1);
        add(mTechList              , 1, i  , 2, 1);
    }

    protected void setLabels()
    {
        mLabels = new HashMap<String, Label>();
        mValues = new HashMap<String, Label>();

        for (String name : mLabelNames) {
            Label newLabel = new Label(name);
            Label newValue = new Label();
            newLabel.setFont(new Font("Arial", 16));
            newValue.setFont(new Font("Arial", 16));
            mLabels.put(name, newLabel);
            mValues.put(name, newValue);
        }

        Label techLabel = new Label(mTechTitle);
        techLabel.setFont(new Font("Arial", 16));
        mLabels.put(mTechTitle, techLabel);

        update();
    }

    protected void update()
    {
        mValues.get("Nuclear Science"        ).setText("0");
        mValues.get("Fossil Fuel Science"    ).setText("0");
        mValues.get("Renewable Science"      ).setText("0");
        mValues.get("Oil Science"            ).setText("0");
        mValues.get("Nuclear Engineering"    ).setText("0");
        mValues.get("Fossil Fuel Engineering").setText("0");
        mValues.get("Renewable Engineering"  ).setText("0");
        mValues.get("Price Change"           ).setText("0");
        mValues.get("Lobby"                  ).setText("0");
        mValues.get("Oil Drilling"           ).setText("0");
        mTechList.update();
    }
}
