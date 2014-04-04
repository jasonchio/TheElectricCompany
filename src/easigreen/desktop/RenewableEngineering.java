package easigreen.desktop;

import easigreen.service.*;

import java.util.*;

import javafx.event.*;

import javafx.geometry.*;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

/**
 *
 */
public class RenewableEngineering
   extends UpgradeItem
{
   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   protected String getTitle()
   {
      return new String("Renewable Engineering");
   }

   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    */
   protected String[] getTips()
   {
      return new String[]{ "+Renewable Security", "+Renewable Energy Produced" };
   }

   /**
    * Constructor
    * @param SimCity pModel the current sim city Model
    */
   public RenewableEngineering(SimCity pModel, Label pLabel)
   {
      super(pModel, pLabel);
   }

   /**
    * DOCUMENT ME!
    */
   protected void update()
   {
      mChange = 0;
      mTotalChange = mSaveChange;
      mValue.setText("" + mModel.getUpgradeManager().getRenewableEngineering());
   }
}
