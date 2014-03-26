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
public class ShortTermPane
    extends ContentPane
{
    protected CategoryAxis mSupplyXAxis;
    protected NumberAxis   mSupplyYAxis;
    protected CategoryAxis mBudgetXAxis;
    protected NumberAxis   mBudgetYAxis;
    protected CategoryAxis mApprovalXAxis;
    protected NumberAxis   mApprovalYAxis;

    protected BarChart<String, Number> mSupplyChart;
    protected BarChart<String, Number> mBudgetChart;
    protected BarChart<String, Number> mApprovalChart;

    protected Label mSupplyLabel;
    protected Label mBudgetLabel;
    protected Label mApprovalLabel;

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
        return "Short Term Goals";
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public ShortTermPane(SimCity pModel)
    {
        super(pModel);
    }

    protected void setup()
    {
        //setGridLinesVisible(true);
        setComponents();
        add(getTitleLabel(), 0, 0, 3, 1);
        add(mSupplyLabel   , 1, 1, 1, 1);
        add(mSupplyChart   , 0, 2, 3, 1);
        add(mBudgetLabel   , 1, 3, 1, 1);
        add(mBudgetChart   , 0, 4, 3, 1);
        add(mApprovalLabel , 1, 5, 1, 1);
        add(mApprovalChart , 0, 6, 3, 1);
    }

    protected void setComponents()
    {
        mSupplyXAxis   = new CategoryAxis();
        mSupplyYAxis   = new NumberAxis();
        mSupplyChart   = new BarChart<String, Number>(mSupplyXAxis, mSupplyYAxis);

        mBudgetXAxis   = new CategoryAxis();
        mBudgetYAxis   = new NumberAxis();
        mBudgetChart   = new BarChart<String, Number>(mBudgetXAxis, mBudgetYAxis);

        mApprovalXAxis = new CategoryAxis();
        mApprovalYAxis = new NumberAxis();
        mApprovalChart = new BarChart<String, Number>(mApprovalXAxis, mApprovalYAxis);

        mSupplyChart  .setMinSize(0, 0);
        mSupplyChart  .setLegendSide(Side.LEFT);
        mBudgetChart  .setMinSize(0, 0);
        mBudgetChart  .setLegendSide(Side.LEFT);
        mApprovalChart.setMinSize(0, 0);
        mApprovalChart.setLegendSide(Side.LEFT);

        mSupplyLabel   = new Label("Supply and Demand");
        mBudgetLabel   = new Label("Budget");
        mApprovalLabel = new Label("Public Approval");

        mSupplyLabel  .setFont(new Font("Arial", 20));
        mBudgetLabel  .setFont(new Font("Arial", 20));
        mApprovalLabel.setFont(new Font("Arial", 20));

        setHalignment(mSupplyLabel  , HPos.CENTER);
        setHalignment(mBudgetLabel  , HPos.CENTER);
        setHalignment(mApprovalLabel, HPos.CENTER);

        update();
    }

    @SuppressWarnings("unchecked")
    protected void update()
    {
        XYChart.Series demandSeries   = new XYChart.Series();
        XYChart.Series supplySeries   = new XYChart.Series();
        demandSeries.setName("Demand");
        demandSeries.getData().add(new XYChart.Data("R0", 100));
        demandSeries.getData().add(new XYChart.Data("R1", 120));
        demandSeries.getData().add(new XYChart.Data("R2", 140));
        demandSeries.getData().add(new XYChart.Data("R3", 160));
        demandSeries.getData().add(new XYChart.Data("R4", 180));
        demandSeries.getData().add(new XYChart.Data("R5", 200));

        supplySeries.setName("Supply");
        supplySeries.getData().add(new XYChart.Data("R0",  70));
        supplySeries.getData().add(new XYChart.Data("R1", 100));
        supplySeries.getData().add(new XYChart.Data("R2", 130));
        supplySeries.getData().add(new XYChart.Data("R3", 160));
        supplySeries.getData().add(new XYChart.Data("R4", 190));
        supplySeries.getData().add(new XYChart.Data("R5", 220));
        mSupplyChart.getData().setAll(demandSeries, supplySeries);

        XYChart.Series budgetSeries   = new XYChart.Series();
        XYChart.Series moneySpent     = new XYChart.Series();
        budgetSeries.setName("Budget");
        budgetSeries.getData().add(new XYChart.Data("R0", 20 ));
        budgetSeries.getData().add(new XYChart.Data("R1", 22 ));
        budgetSeries.getData().add(new XYChart.Data("R2", 24 ));
        budgetSeries.getData().add(new XYChart.Data("R3", 26 ));
        budgetSeries.getData().add(new XYChart.Data("R4", 28 ));
        budgetSeries.getData().add(new XYChart.Data("R5", 30 ));

        moneySpent  .setName("Expenses");
        moneySpent  .getData().add(new XYChart.Data("R0", 18 ));
        moneySpent  .getData().add(new XYChart.Data("R1", 20 ));
        moneySpent  .getData().add(new XYChart.Data("R2", 22 ));
        moneySpent  .getData().add(new XYChart.Data("R3", 30 ));
        moneySpent  .getData().add(new XYChart.Data("R4", 15 ));
        moneySpent  .getData().add(new XYChart.Data("R5", 21 ));
        mBudgetChart.getData().setAll(budgetSeries, moneySpent);

        XYChart.Series targetApproval = new XYChart.Series();
        XYChart.Series actualApproval = new XYChart.Series();
        targetApproval.setName("Target");
        targetApproval.getData().add(new XYChart.Data("R0", 45 ));
        targetApproval.getData().add(new XYChart.Data("R1", 45 ));
        targetApproval.getData().add(new XYChart.Data("R2", 45 ));
        targetApproval.getData().add(new XYChart.Data("R3", 45 ));
        targetApproval.getData().add(new XYChart.Data("R4", 45 ));
        targetApproval.getData().add(new XYChart.Data("R5", 45 ));

        actualApproval.setName("Actual");
        actualApproval.getData().add(new XYChart.Data("R0", 43 ));
        actualApproval.getData().add(new XYChart.Data("R1", 45 ));
        actualApproval.getData().add(new XYChart.Data("R2", 44 ));
        actualApproval.getData().add(new XYChart.Data("R3", 47 ));
        actualApproval.getData().add(new XYChart.Data("R4", 46 ));
        actualApproval.getData().add(new XYChart.Data("R5", 48 ));
        mApprovalChart.getData().setAll(targetApproval, actualApproval);
    }
}
