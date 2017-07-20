package com.example.jinphy.chapter_14;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jinphy on 2017/7/20.
 */

public class ParcelableClass implements Parcelable {
    private String field1;
    private int field2;
    private double field3;
    private boolean field4;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.field1);
        dest.writeInt(this.field2);
        dest.writeDouble(this.field3);
        dest.writeByte(this.field4 ? (byte) 1 : (byte) 0);
    }

    public ParcelableClass() {
    }

    protected ParcelableClass(Parcel in) {
        this.field1 = in.readString();
        this.field2 = in.readInt();
        this.field3 = in.readDouble();
        this.field4 = in.readByte() != 0;
    }

    public static final Parcelable.Creator<ParcelableClass> CREATOR = new Parcelable.Creator<ParcelableClass>() {
        @Override
        public ParcelableClass createFromParcel(Parcel source) {
            return new ParcelableClass(source);
        }

        @Override
        public ParcelableClass[] newArray(int size) {
            return new ParcelableClass[size];
        }
    };
}
