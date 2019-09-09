package com.example.media;
import android.content.Context;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayActivityMVP {
   private Context context;

    public PlayActivityMVP(Context context) {
        this.context = context;
    }

    public void setVideoViewInVideo(VideoView videoView, String uri) {

        if (videoView != null && uri != null) {
            //videoView.setVideoPath(uri);
            videoView.setVideoURI(Uri.parse(uri));
            MediaController mediaController = new MediaController(context);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
    }

}
