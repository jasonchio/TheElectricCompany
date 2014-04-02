package easigreen.desktop;

import easigreen.desktop.*;
import easigreen.service.*;

import java.util.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

/**
 * Nuclear TechList
 * @version 0.2.0
 * @author Haru McClellan
 */
class NuclearTechList
    extends AppDataList
{

    /**
     * This is the basic constructor
     * Binds the parent to the children
     * @param pModel the SimCity
     */
    public NuclearTechList(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Provides update functionality
     *
     */
    protected void update()
    {
    }
}
