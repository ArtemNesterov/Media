package com.example.media.models;
import android.os.Parcel;
import android.os.Parcelable;



public class VideoModel implements Parcelable {
    private String name;
    private String Uri;

    public VideoModel(String name, String uri) {
        this.name = name;
        Uri = uri;
    }

    protected VideoModel(Parcel in) {
        name = in.readString();
        Uri = in.readString();
    }

    public static final Creator<VideoModel> CREATOR = new Creator<VideoModel>() {
        @Override
        public VideoModel createFromParcel(Parcel in) {
            return new VideoModel(in);
        }

        @Override
        public VideoModel[] newArray(int size) {
            return new VideoModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(Uri);
    }
}
