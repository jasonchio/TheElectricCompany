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
public class NuclearScience
    extends UpgradeItem
{

    protected String getTitle()
    {
        return new String("Nuclear Science");
    }

    protected String[] getTips()
    {
        return new String[] {"+Nuclear Security", "+Nuclear Approval"};
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public NuclearScience(SimCity pModel)
    {
        super(pModel);
    }

    protected void update()
    {
	mChange = 0;
        mValue.setText("" + mModel.getUpgradeManager().getNuclearScience());
    }
}
