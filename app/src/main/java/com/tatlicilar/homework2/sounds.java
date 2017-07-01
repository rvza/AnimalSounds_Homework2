package com.tatlicilar.homework2;

import android.media.Image;

/** animals
 * Created by Asus on 16.06.2017.
 */

//animals variable
public class sounds {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    String name;

    public sounds(String name, int images) {
        this.name = name;
        this.images = images;
    }

    int images;

}
