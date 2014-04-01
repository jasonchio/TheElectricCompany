package easigreen.desktop;

import easigreen.service.*;
import easigreen.system.*;

import java.util.*;

import javafx.application.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.chart.LineChart;
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
public class OilPane
    extends ContentPane
{
    private ContentPane mOilUpgradesPane;
    private Button      mOilUpgrades;

    protected static String[] mLabelNames = new String[] {"Oil Consumption", "Total Oil Emissions",
            "Oil Security per Million Barrels",
            "Total Oil Security"
                                                         };

    protected Map<String, Label> mLabels;
    protected Map<String, Label> mValues;

    protected NumberAxis mXAxis;
    protected NumberAxis mYAxis;
    protected LineChart<Number, Number> mLineChart;
    protected XYChart.Series<Number, Number> mSeries;

    protected static String mUpgradeLabelName = new String("Oil Upgrades");

    protected int[] getColumns()
    {
        return new int[] {10, 34, 4, 26, 16, 10};
    }

    protected int[] getRows()
    {
        return new int[] {12, 5, 29, 2, 5, 2, 5, 2, 5, 2, 28, 3};
    }

    protected String getTitle()
    {
        return "Oil";
    }

    protected void init()
    {
        mOilUpgradesPane = new OilUpgradePane(mModel);
        EventHandler<ActionEvent> upgradeEvent = new PanelChangeEvent(mOilUpgradesPane);
        mOilUpgrades = new ImageButton("oilupgrade.png", upgradeEvent);
        setHalignment(mOilUpgrades, HPos.RIGHT);
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public OilPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setChart();
        setLabels();
        add(getTitleLabel(), 0,  0, 6, 1);
        add(mOilUpgrades   , 1, 10, 1, 1);
        add(mLineChart     , 1,  2, 4, 1);

        add(mLabels.get("Oil Consumption"                 ), 1,  1, 3, 1);
        add(mLabels.get("Total Oil Emissions"             ), 1,  4, 3, 1);
        add(mLabels.get("Oil Security per Million Barrels"), 1,  6, 3, 1);
        add(mLabels.get("Total Oil Security"              ), 1,  8, 3, 1);
        add(mLabels.get(mUpgradeLabelName                 ), 3, 10, 2, 1);

        add(mValues.get("Oil Consumption"                 ), 4,  1, 1, 1);
        add(mValues.get("Total Oil Emissions"             ), 4,  4, 1, 1);
        add(mValues.get("Oil Security per Million Barrels"), 4,  6, 1, 1);
        add(mValues.get("Total Oil Security"              ), 4,  8, 1, 1);
    }


    protected void setChart()
    {
        mXAxis = new NumberAxis();
        mXAxis.setMinorTickVisible(false);
        mXAxis.setTickLabelsVisible(false);
        mYAxis = new NumberAxis();
        mYAxis.setMinorTickVisible(false);
        mYAxis.setTickLabelsVisible(false);
        //mXAxis.setLabel("Round");
        //mYAxis.setLabel("Oil Consumption");
        mLineChart = new LineChart<Number, Number>(mXAxis, mYAxis);
        mLineChart.setPrefSize(50, 50);
        mLineChart.setCreateSymbols(false);
        mLineChart.setHorizontalZeroLineVisible(false);
        mLineChart.setVerticalZeroLineVisible(false);
        mLineChart.setHorizontalGridLinesVisible(false);
        mLineChart.setVerticalGridLinesVisible(false);
        mLineChart.setLegendVisible(false);
    }


    protected void setLabels()
    {
        mLabels = new HashMap<String, Label>();
        mValues = new HashMap<String, Label>();
        for (String name : mLabelNames) {
            Label label1 = new Label(name);
            Label label2 = new Label();
            label1.setFont(new Font("Arial", 18));
            label2.setFont(new Font("Arial", 18));
            mLabels.put(name, label1);
            mValues.put(name, label2);
        }
        Label oilUpgrade = new Label(mUpgradeLabelName);
        oilUpgrade.setFont(new Font("Arial", 25));
        oilUpgrade.setWrapText(true);
        mLabels.put(mUpgradeLabelName, oilUpgrade);
        update();
    }

    @SuppressWarnings("unchecked")
    protected void update()
    {
        mSeries = new XYChart.Series<Number, Number>();
        mSeries.getData().add(new XYChart.Data<Number, Number>(0, 0));
        mSeries.getData().add(new XYChart.Data<Number, Number>(1, 1));
        mSeries.getData().add(new XYChart.Data<Number, Number>(2, 2));
        mSeries.getData().add(new XYChart.Data<Number, Number>(3, 4));
        mSeries.getData().add(new XYChart.Data<Number, Number>(4, 7));
        mSeries.getData().add(new XYChart.Data<Number, Number>(5, 11));
        mLineChart.getData().setAll(mSeries);

        mValues.get("Oil Consumption"                 ).setText("" + mModel.getEnergyManager().getOil().getConsumption());
        mValues.get("Total Oil Emissions"             ).setText("" + mModel.getEnergyManager().getOil().getEmissions());
        mValues.get("Oil Security per Million Barrels").setText("" + mModel.getEnergyManager().getOil().getSecurity());
        mValues.get("Total Oil Security"              ).setText("" + mModel.getEnergyManager().getOil().getTotalSecurity());
    }
}
