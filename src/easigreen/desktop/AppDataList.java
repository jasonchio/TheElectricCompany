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
class AppDataList
    extends ListView<String>
{

    /**
     * Holds the model reference
     */
    protected SimCity mModel;
    
    /**
     * Holds the list of observable strings
     */
    protected ObservableList<String> mData = FXCollections.observableArrayList();
    
    /**
     * Holds a list of strings
     */
    protected List<String> mDataNames;

    /**
     * Basic Constructor
     * @param pModel a SimCity
     */
    public AppDataList(SimCity pModel)
    {
        mModel = pModel;
        initialize();
    }

    /**
     * Initializes the object
     */
    protected void initialize()
    {
        mDataNames = new ArrayList<String>();
        setItems(mData);
        setPrefSize(50, 50);
        update();
    }

    /**
     * Updates the object
     */
    protected void update()
    {
    }
}
