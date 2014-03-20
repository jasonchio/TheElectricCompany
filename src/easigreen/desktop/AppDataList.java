package easigreen.desktop;

import easigreen.desktop.*;
import easigreen.service.*;

import java.util.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

class AppDataList
    extends ListView<String>
{

    protected SimCity mModel;
    protected ObservableList<String> mData = FXCollections.observableArrayList();
    protected List<String> mDataNames;

    public AppDataList(SimCity pModel)
    {
	mModel = pModel;
	initialize();
    }

    protected void initialize()
    {
	mDataNames = new ArrayList<String>();
	setItems(mData);
	setPrefSize(250, 100);
	update();
    }

    protected void update()
    {
    }
}
