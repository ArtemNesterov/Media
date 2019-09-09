package com.example.media;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.media.models.VideoModel;

public class PlayActivity extends AppCompatActivity {
   private PlayActivityMVP playActivityMVP;
   private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        playActivityMVP = new PlayActivityMVP(this);

        VideoModel videoModel = (VideoModel) getIntent().getParcelableExtra(Utils.ARG_VIDEOMODEL);

        videoView = findViewById(R.id.ap_videoView);


        playActivityMVP.setVideoViewInVideo(videoView, videoModel.getUri());

    }
}
