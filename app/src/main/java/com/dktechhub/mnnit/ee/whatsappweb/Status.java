package com.dktechhub.mnnit.ee.whatsappweb;

import android.graphics.Bitmap;

public class Status {
public boolean isSelected=false;
public String source;
Bitmap thumbnail;
public String name;
public Status(String source,Bitmap thumbnail,String name){
    this.thumbnail=thumbnail;
    this.source=source;
    this.name=name;
}
}
