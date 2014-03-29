package easigreen.desktop;

import easigreen.desktop.*;
import easigreen.service.*;

import java.util.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

/**
 * A content pane for Sim city
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */ 
class ImplementedTechList
    extends AppDataList
{

    /**
     * Basic Constructor
     * @param pModel the model     
     */
    public ImplementedTechList(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Initializes the object
     */
    protected void initialize()
    {
        super.initialize();
        ArrayList<String> temp = new ArrayList<String>();
        
        for (Technology tech : mModel.getUpgradeManager().getTechnologyManager().getImplemented())
        {
            temp.add(tech.getName());
        }
        mDataNames = temp;
    }
    
    
    protected void update()
    {
    }
}
