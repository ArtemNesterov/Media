package com.example.media;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.example.media.adapters.VideoAdapter;
import com.example.media.models.VideoModel;


import java.util.List;

public class MainActivityMVP implements VideoAdapter.IOnVideoClickListener {
    private Context context;
    private List<VideoModel> videoModels = Utils.generateList();
    private VideoAdapter videoAdapter = new VideoAdapter(context, videoModels, this);

    public MainActivityMVP(Context context) {
        this.context = context;
    }

    public void setAdapterForVideos(RecyclerView recyclerView) {
        recyclerView.setAdapter(videoAdapter);
    }

    @Override
    public void onVideoClick(VideoModel item) {
        Intent playActivity = new Intent(context, PlayActivity.class);
        playActivity.putExtra(Utils.ARG_VIDEOMODEL, item);
        context.startActivity(playActivity);
    }
}
