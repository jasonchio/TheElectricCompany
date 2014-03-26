package easigreen.desktop;

import easigreen.desktop.*;
import easigreen.service.*;

import java.util.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

/**
 * List holder of countries
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */ 
class CountryList
    extends AppDataList
{
    /**
     * Basic Constructor
     * @param pModel the model, a SimCity
     */
    public CountryList(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Update Method
     */
    protected void update()
    {
    }
}
