package easigreen.desktop;

import easigreen.service.*;

import easigreen.system.*;

import java.util.*;

import javafx.application.*;


import javafx.event.*;

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
 
   private static final String GAME_NAME = "Sargeant City";
   
   private static final String[]   mainNavNames = new String[]{"country", "energy", "upgrades", "goals"};
   
   private static final String[][] subNavNames  = new String[][]{{"world", "politicalresources", "trade"},
								 {"nuclear", "fossilfuel", "renewable", "oil"},
								 {"science", "engineering", "policies", "technologies1"},
								 {"shortterm", "longterm"}};

    
   /**
    * Contains Graphical buttons for the main navigation of the system.
    */
   private NavPane mainNavigation;

    /**
     * A map of Strings to navigation panes
     */
    private static Map<String, NavPane> subNavigation;

    /**
     * A Map of string (button names) to the events they handle
     */
    private static Map<String, EventHandler<ActionEvent>> events;

    /**
     * Maps strings to the content page it provides
     */
    private static Map<String, ContentPane> content;
 
    /**
     * Contains the primary layout for the application.
     */
   private BorderPane windowArea;

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
    * Starts the GUI.
    *
    * @param primaryStage the primary stage.
    */
   @Override
   public void start(Stage primaryStage)
   {
      initialize(primaryStage);
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

   /**
    * Initializes the GUI.
    *
    * @param primaryStage the primary stage.
    */
   private void initialize(Stage primaryStage)
   {
      initializeEvents();
      initializeNavigation();
      initializeWindow();
      initializeStage(primaryStage);
   }

    /**
     * Initializes action events for buttons
     */
    private void initializeEvents()
    {
	events = new HashMap<String, EventHandler<ActionEvent>>();
	for (String nav : mainNavNames)
	{
	   events.put(nav, new EventHandler<ActionEvent>()
	   {
	       public void handle(ActionEvent event)
	       {
		   windowArea.setRight(subNavigation.get(nav));
	       }
	   });
	}
    }

    /**
     * Initialize Primary Navigation
     */
    private void initializeNavigation()
    {
	mainNavigation = new NavPane();
	subNavigation  = new HashMap<String, NavPane>();
	for (int mainNavNum = 0; mainNavNum < mainNavNames.length; mainNavNum++)
	{
	    mainNavigation.addButton(mainNavNames[mainNavNum], events.get(mainNavNames[mainNavNum]));
	    NavPane newNav = new NavPane();
	    for (int subNavNum = 0; subNavNum < subNavNames[mainNavNum].length; subNavNum++)
	    {
		newNav.addButton(subNavNames[mainNavNum][subNavNum], events.get(subNavNames[mainNavNum][subNavNum]));
	    }
	    newNav.initialize();
	    subNavigation.put(mainNavNames[mainNavNum], newNav);
	}
	mainNavigation.initialize();
    }

    /**
     * Initializes Main Window Layout
     */
    private void initializeWindow()
    {
	windowArea = new BorderPane();
	windowArea.setLeft(mainNavigation);
	windowArea.setRight(subNavigation.get(mainNavNames[0]));
    }

    /**
     * Initializes the Primary Stage
     *
     * @param primaryStage the primary Stage.
     */
    private void initializeStage(Stage primaryStage)
    {
	 primaryStage.setScene(new Scene(windowArea));
	 primaryStage.setMinHeight(600);
	 primaryStage.setMinWidth(600);
	 primaryStage.setTitle(GAME_NAME);
    }
}
