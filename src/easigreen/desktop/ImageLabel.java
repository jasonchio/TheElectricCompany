package easigreen.desktop;

import easigreen.service.*;
import easigreen.system.*;
import easigreen.desktop.*;

import javafx.event.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 */
public class ImageLabel extends Label
{

    /**
     * Constructor for Image Button
     *
     * @param imageurl the url for an image the Label will look like
     */
    public ImageLabel(String imageurl)
    {
        setImage(imageurl);
    }

    public ImageLabel()
    {
    }

    public void setImage(String imageurl)
    {
        Image     image = ImageGetter.getImage(imageurl);
        ImageView graphic = new ImageView(image);

        setGraphic(graphic);
    }
}
