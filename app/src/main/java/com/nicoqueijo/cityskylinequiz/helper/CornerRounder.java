package com.nicoqueijo.cityskylinequiz.helper;

import android.widget.ImageView;

/**
 * Provides a method to round corners of one or more ImageViews. Used by multiple classes.
 */
public class CornerRounder {
    /**
     * Rounds corners of images if the device is running on Lollipop or higher.
     */
    public static void roundImageCorners(ImageView... imageViews) {
        if (ApiChecker.isRunningLollipopOrHigher()) {
            for (ImageView imageView : imageViews) {
                imageView.setClipToOutline(true);
            }
        } else {
            // Sorry, the setClipToOutline method call requires API level 21 :(
        }
    }
}
