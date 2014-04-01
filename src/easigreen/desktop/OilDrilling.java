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
public class OilDrilling
    extends UpgradeItem
{

    protected String getTitle()
    {
        return new String("Oil Drilling");
    }

    protected String[] getTips()
    {
        return new String[] {"+Short Term Security", "-Long Term Security", "+Emissions"};
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public OilDrilling(SimCity pModel)
    {
        super(pModel);
    }

    protected void update()
    {
	mChange = 0;
        mValue.setText("" + mModel.getUpgradeManager().getOilDrilling());
    }
}
