package TheElectricCompany.desktop;

import TheElectricCompany.desktop.*;

import TheElectricCompany.service.*;

import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.ListView;

/**
 * Fossil Technology List
 *
 * @version 0.1.3
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
class FossilTechList
   extends AppDataList
{
   //////////////////////////// Constructor

   /**
    * Fossil Technology List
    * @param pModel the SimCity
    */
   public FossilTechList(SimCity pModel)
   {
      super(pModel);
   }

   /////////////////////////// Updater

   /**
    * Updater
    */
   protected void update()
   {
      mData.clear();

      for (Technology t : mModel.getUpgradeManager().getTechnologyManager()
                                .getFossil())
      {
         mData.add(t.getName());
      }
   }
}
