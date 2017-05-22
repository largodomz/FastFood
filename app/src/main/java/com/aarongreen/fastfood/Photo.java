package com.aarongreen.fastfood;

import android.graphics.Color;

import com.aarongreen.fastfood.API_KEYS;

/**
 * Created by AaronGreen on 4/20/17.
 *
 * A class for creating photo objects from the Google Places API
 */

public class Photo {

    public static String PHOTO_REFERENCE = "photo_reference";
    public static String WIDTH = "width";
    public static String HEIGHT = "height";
    public static double DEFAULT_WIDTH = 400;
    public static double DEFAULT_HEIGHT = 400;
    public static String DEFAULT_REFERENCE = "default";
    public static String DEFAULT_BACKGROUND =
            "http://images.all-free-download.com/images/graphiclarge/" +
                    "black_texture_texture_background_01_hd_pictures_169906.jpg";

    public static String BASE_IMAGE_URL = "https://maps.googleapis.com/maps/api/place/photo?key="
            + API_KEYS.GOOGLE_PLACES_KEY;

    private String reference;
    private double minWidth;
    private double minHeight;

    public Photo(String reference, double minWidth, double minHeight) {
        this.reference = reference;
        this.minWidth = minWidth;
        this.minHeight = minHeight;
    }

    public String getReference() {
        return reference;
    }

    public double getMinWidth() {
        return minWidth;
    }

    public double getMinHeight() {
        return minHeight;
    }

    /**
     *
     * @return the url of the photo in the google places api
     */
    public String getPhotoURL() {
        String url = BASE_IMAGE_URL + "&photoreference=" + reference + "&maxwidth=800&maxheight=400";
        return url;
    }
}
