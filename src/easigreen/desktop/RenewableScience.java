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
 * Renewable Science Item
 * @version 0.2.0
 * @author Haru McClellan
 */
public class RenewableScience
    extends UpgradeItem
{
    /**
     * Gets the title
     * @return String the title
     */
    protected String getTitle()
    {
        return new String("Renewable Science");
    }

    /**
     * Retrieves a list of tips
     * @return array of Strings
     */
    protected String[] getTips()
    {
        return new String[] {"+Renewable Security", "+Renewable Approval"};
    }

    /**
     * Initial set up of graphical objects
     */
    protected void init()
    {
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
        setHalignment(mUp  , HPos.CENTER);
        setHalignment(mDown, HPos.CENTER);
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public RenewableScience(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Updater
     */
    protected void update()
    {
        mValue.setText("0");
    }
}
