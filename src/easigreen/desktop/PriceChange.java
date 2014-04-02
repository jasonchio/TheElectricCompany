package easigreen.desktop;

import easigreen.service.*;

import java.util.*;

import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.text.*;

/**
 *
 */
public class PriceChange
    extends UpgradeItem
{

    protected String getTitle()
    {
        return new String("Price Change");
    }

    protected String[] getTips()
    {
        return new String[] {"+Profit", "-Approval", "-Demand"};
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public PriceChange(SimCity pModel)
    {
        super(pModel);
    }

    protected void update()
    {
	mChange = 0;
        mValue.setText("" + mModel.getUpgradeManager().getPriceChange());
    }
}
