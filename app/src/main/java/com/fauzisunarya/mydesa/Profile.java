package com.fauzisunarya.mydesa;

import android.os.Parcel;
import android.os.Parcelable;

public class Profile implements Parcelable {
    private String nameProfile;
    private String descriptionProfile;
    private int imageProfile;

    Profile(){

    }

    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel in) {
            return new Profile(in);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };

    public String getNameProfile() {
        return nameProfile;
    }

    public void setNameProfile(String nameProfile) {
        this.nameProfile = nameProfile;
    }

    public String getDescriptionProfile() {
        return descriptionProfile;
    }

    public void setDescriptionProfile(String descriptionProfile) {
        this.descriptionProfile = descriptionProfile;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nameProfile);
        dest.writeString(this.descriptionProfile);
        dest.writeInt(this.imageProfile);

    }

    private Profile(Parcel in){
        this.nameProfile = in.readString();
        this.descriptionProfile = in.readString();
        this.imageProfile = in.readInt();
    }
}
