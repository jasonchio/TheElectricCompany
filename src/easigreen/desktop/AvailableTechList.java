package easigreen.desktop;

import easigreen.desktop.*;
import easigreen.service.*;

import java.util.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

/**
 * List holder
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */ 
class AvailableTechList
    extends AppDataList
{

    /**
     * Basic Constructor
     * @param pModel a SimCity reference
     */
    public AvailableTechList(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Updates the class
     */
    protected void update()
    {
    }
}
