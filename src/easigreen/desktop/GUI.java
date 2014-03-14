package easigreen.desktop;

import easigreen.service.*;

import easigreen.system.*;

import javafx.application.*;

import javafx.geometry.*;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;

import javafx.stage.*;

/**
 * The main Graphical User Interface for the "Sim City" Application
 */
public class GUI
   extends Application
{
   private static final String GAME_NAME = "Sargeant City";

   /**
    * Holds the singleton instance.
    */
   private static GUI cInstance = null;

   /**
    * Gets the singleton instance.
    *
    * @return the singleton instance.
    */
   public static GUI getInstance()
   {
      return cInstance;
   }

    /**
     * Contains the primary layout for the application.
     */
   private BorderPane windowArea;

   /**
    * Contains Graphical buttons for the main navigation of the system.
    */
   private NavPane mainNavigation;

    /**
    * Contains Graphical buttons for navigating within the country tab.
    */
    private NavPane countryNavigation;

    /**
    * Contains Graphical buttons for navigating within the energy tab.
    */
    private NavPane energyNavigation;

    /**
    * Contains Graphical buttons for navigating within the upgrade tab.
    */
    private NavPane upgradeNavigation;

    /**
    * Contains Graphical buttons for navigating within the goal tab.
    */
    private NavPane goalNavigation;

   /**
    * Creates a new GUI object.
    */
   public GUI()
   {
      super();

      synchronized (GUI.class)
      {
         if (cInstance != null)
         {
            throw new UnsupportedOperationException(getClass() +
               " is singleton but constructor called more than once.");
         }

         cInstance = this;
      }
   }

   /**
    * Initializes the GUI.
    *
    * @param primaryStage the primary stage.
    */
   private void init(Stage primaryStage)
   {
      initNav();
      initWindow();
      initStage(primaryStage);
   }

   /**
    * Starts the GUI.
    *
    * @param primaryStage the primary stage.
    */
   @Override
   public void start(Stage primaryStage)
   {
      init(primaryStage);
      primaryStage.show();
   }

   /**
    * Exits the application.
    */
   public void exit()
   {
      Action.showAll();
      Platform.exit();
      System.exit(0);
   }

    private void initStage(Stage primaryStage)
    {
	 primaryStage.setScene(new Scene(windowArea));
	 primaryStage.setMinHeight(600);
	 primaryStage.setMinWidth(600);
	 primaryStage.setTitle(GAME_NAME);
    }

    private void initNav()
    {
	initMainNav();
	initEnergyNav();
	initCountryNav();
	initUpgradeNav();
	initGoalNav();
    }
    
    private void initWindow()
    {
	windowArea = new BorderPane();
	windowArea.setLeft(mainNavigation);
	windowArea.setRight(countryNavigation);
    }

    private void initMainNav()
    {
	mainNavigation    = new NavPane();
	mainNavigation.addButton("Country.png");
	mainNavigation.addButton("Energy.png");
	mainNavigation.addButton("Upgrades.png");
	mainNavigation.addButton("Goals.png");
	mainNavigation.initialize();
    }

    private void initCountryNav()
    {
	countryNavigation = new NavPane();
	countryNavigation.addButton("World.png");
	countryNavigation.addButton("Political.png");
	countryNavigation.addButton("Trade.png");
	countryNavigation.initialize();
    }
    
    private void initEnergyNav()
    {
	energyNavigation  = new NavPane();
	energyNavigation.addButton("duckling.png");
	energyNavigation.addButton("duckling.png");
	energyNavigation.addButton("duckling.png");
	energyNavigation.addButton("duckling.png");
	energyNavigation.initialize();
    }

    private void initUpgradeNav()
    {
	upgradeNavigation = new NavPane();
	upgradeNavigation.addButton("duckling.png");
	upgradeNavigation.addButton("duckling.png");
	upgradeNavigation.addButton("duckling.png");
	upgradeNavigation.addButton("duckling.png");
	upgradeNavigation.initialize();
    }

    private void initGoalNav()
    {
	goalNavigation    = new NavPane();
	goalNavigation.addButton("duckling.png");
	goalNavigation.addButton("duckling.png");
	goalNavigation.initialize();
    }
}
