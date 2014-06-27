package TheElectricCompany.desktop;

import TheElectricCompany.desktop.*;

import TheElectricCompany.service.*;

import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.ListView;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 */
class OilTechList
   extends AppDataList
{
   /**
    * Constructs a new OilTechList instance.
    *
    * @param pModel DOCUMENT ME!
    */
   public OilTechList(SimCity pModel)
   {
      super(pModel);
   }

   /**
    * DOCUMENT ME!
    */
   protected void update()
   {
      mData.clear();

      for (Technology t : mModel.getUpgradeManager().getTechnologyManager()
                                .getOil())
      {
         mData.add(t.getName());
      }
   }
}
