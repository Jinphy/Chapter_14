package com.example.jinphy.chapter_14;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jinphy on 2017/7/20.
 */

public class SerializableClass implements Serializable {
    private static final long serialVersionUID = 5731869901063034829L;
    public int accessTime;
    public ArrayList<Image>  contentList;

    public class MyImage implements Serializable{

        private static final long serialVersionUID = 2244295862094972226L;
        public int type;
        public String iconUrl;
        public String value;
    }
    public SerializableClass(){
        accessTime = 0;
        contentList = new ArrayList<>();

    }
}
