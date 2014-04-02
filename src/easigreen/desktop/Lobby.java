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
public class Lobby
    extends UpgradeItem
{

    protected String getTitle()
    {
        return new String("Lobby");
    }

    protected String[] getTips()
    {
        return new String[] {"+Funds", "-Approval"};
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public Lobby(SimCity pModel)
    {
        super(pModel);
    }

    protected void update()
    {
	mChange = 0;
        mValue.setText("" + mModel.getUpgradeManager().getLobby());
    }
}
