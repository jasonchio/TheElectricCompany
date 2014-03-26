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
public class NuclearEngineering
    extends UpgradeItem
{
    /**
     * Gets the title for this Content Component
     * @return String the title
     */
    protected String getTitle()
    {
        return new String("Nuclear Engineering");
    }

    /**
     * Gets the Tips
     * @return an array of Strings
     */
    protected String[] getTips()
    {
        return new String[] {"+Nuclear Security", "+Nuclear Energy Produced"};
    }

    /**
     * Initializes the various action handlers
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
    public NuclearEngineering(SimCity pModel)
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
