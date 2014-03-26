package easigreen.desktop;

import easigreen.service.*;
import easigreen.system.*;

import java.util.*;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

/**
 * One of the content panes for Sim City
 */
public class LongTermPane
    extends ContentPane
{
    protected CategoryAxis mEmissionsXAxis;
    protected NumberAxis   mEmissionsYAxis;
    protected CategoryAxis mSecurityXAxis;
    protected NumberAxis   mSecurityYAxis;
    protected CategoryAxis mProfitXAxis;
    protected NumberAxis   mProfitYAxis;

    protected BarChart<String, Number> mEmissionsChart;
    protected BarChart<String, Number> mSecurityChart;
    protected BarChart<String, Number> mProfitChart;

    protected Label mEmissionsLabel;
    protected Label mSecurityLabel;
    protected Label mProfitLabel;

    protected int[] getColumns()
    {
        return new int[] {12, 76, 12};
    }

    protected int[] getRows()
    {
        return new int[] {10, 5, 25, 5, 25, 5, 25};
    }

    protected String getTitle()
    {
        return "Long Term Goals";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public LongTermPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();
        add(getTitleLabel(), 0, 0, 3, 1);
        add(mEmissionsLabel, 1, 1, 1, 1);
        add(mEmissionsChart, 0, 2, 3, 1);
        add(mSecurityLabel , 1, 3, 1, 1);
        add(mSecurityChart , 0, 4, 3, 1);
        add(mProfitLabel   , 1, 5, 1, 1);
        add(mProfitChart   , 0, 6, 3, 1);
    }

    protected void setComponents()
    {
        mEmissionsXAxis = new CategoryAxis();
        mEmissionsYAxis = new NumberAxis();
        mEmissionsChart = new BarChart<String, Number>(mEmissionsXAxis, mEmissionsYAxis);

        mSecurityXAxis  = new CategoryAxis();
        mSecurityYAxis  = new NumberAxis();
        mSecurityChart  = new BarChart<String, Number>(mSecurityXAxis , mSecurityYAxis);

        mProfitXAxis    = new CategoryAxis();
        mProfitYAxis    = new NumberAxis();
        mProfitChart    = new BarChart<String, Number>(mProfitXAxis   , mProfitYAxis);

        mEmissionsChart.setMinSize(0, 0);
        mEmissionsChart.setLegendSide(Side.LEFT);
        mSecurityChart .setMinSize(0, 0);
        mSecurityChart .setLegendSide(Side.LEFT);
        mProfitChart   .setMinSize(0, 0);
        mProfitChart   .setLegendSide(Side.LEFT);

        mEmissionsLabel = new Label("Emissions");
        mSecurityLabel  = new Label("Security");
        mProfitLabel    = new Label("Profit");

        mEmissionsLabel.setFont(new Font("Arial", 20));
        mSecurityLabel .setFont(new Font("Arial", 20));
        mProfitLabel   .setFont(new Font("Arial", 20));

        setHalignment(mEmissionsLabel, HPos.CENTER);
        setHalignment(mSecurityLabel , HPos.CENTER);
        setHalignment(mProfitLabel   , HPos.CENTER);

        update();
    }

    @SuppressWarnings("unchecked")
    protected void update()
    {
        XYChart.Series targetEm = new XYChart.Series();
        XYChart.Series actualEm = new XYChart.Series();
        targetEm.setName("Target");
        targetEm.getData().add(new XYChart.Data("R0", 100));
        targetEm.getData().add(new XYChart.Data("R1",  99));
        targetEm.getData().add(new XYChart.Data("R2", 140));
        targetEm.getData().add(new XYChart.Data("R3", 160));
        targetEm.getData().add(new XYChart.Data("R4", 180));
        targetEm.getData().add(new XYChart.Data("R5", 200));

        actualEm.setName("Actual");
        actualEm.getData().add(new XYChart.Data("R0",  70));
        actualEm.getData().add(new XYChart.Data("R1", 100));
        actualEm.getData().add(new XYChart.Data("R2", 130));
        actualEm.getData().add(new XYChart.Data("R3", 160));
        actualEm.getData().add(new XYChart.Data("R4", 190));
        actualEm.getData().add(new XYChart.Data("R5", 220));
        mEmissionsChart.getData().setAll(targetEm, actualEm);

        XYChart.Series targetSec = new XYChart.Series();
        XYChart.Series actualSec = new XYChart.Series();
        targetSec.setName("Target");
        targetSec.getData().add(new XYChart.Data("R0", 20 ));
        targetSec.getData().add(new XYChart.Data("R1", 22 ));
        targetSec.getData().add(new XYChart.Data("R2", 24 ));
        targetSec.getData().add(new XYChart.Data("R3", 26 ));
        targetSec.getData().add(new XYChart.Data("R4", 28 ));
        targetSec.getData().add(new XYChart.Data("R5", 30 ));

        actualSec.setName("Actual");
        actualSec.getData().add(new XYChart.Data("R0", 18 ));
        actualSec.getData().add(new XYChart.Data("R1", 20 ));
        actualSec.getData().add(new XYChart.Data("R2", 22 ));
        actualSec.getData().add(new XYChart.Data("R3", 30 ));
        actualSec.getData().add(new XYChart.Data("R4", 15 ));
        actualSec.getData().add(new XYChart.Data("R5", 21 ));
        mSecurityChart.getData().setAll(targetSec, actualSec);

        XYChart.Series targetPro = new XYChart.Series();
        XYChart.Series actualPro = new XYChart.Series();
        targetPro.setName("Target");
        targetPro.getData().add(new XYChart.Data("R0", 45 ));
        targetPro.getData().add(new XYChart.Data("R1", 45 ));
        targetPro.getData().add(new XYChart.Data("R2", 45 ));
        targetPro.getData().add(new XYChart.Data("R3", 45 ));
        targetPro.getData().add(new XYChart.Data("R4", 45 ));
        targetPro.getData().add(new XYChart.Data("R5", 45 ));

        actualPro.setName("Actual");
        actualPro.getData().add(new XYChart.Data("R0", 43 ));
        actualPro.getData().add(new XYChart.Data("R1", 45 ));
        actualPro.getData().add(new XYChart.Data("R2", 44 ));
        actualPro.getData().add(new XYChart.Data("R3", 47 ));
        actualPro.getData().add(new XYChart.Data("R4", 46 ));
        actualPro.getData().add(new XYChart.Data("R5", 48 ));
        mProfitChart.getData().setAll(targetPro, actualPro);
    }
}
