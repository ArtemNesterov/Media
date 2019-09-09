package com.example.media.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.media.R;
import com.example.media.models.VideoModel;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    private List<VideoModel> items;
    private Context context;
    private IOnVideoClickListener listener;

    public VideoAdapter(Context context, List<VideoModel> videoModels, IOnVideoClickListener videoClickListener) {
        this.context = context;
        items = videoModels;
        listener = videoClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nameVideo.setText(items.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onVideoClick(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void replaceAllItemsWith(List<VideoModel> newItems){
        items = newItems;
        notifyDataSetChanged();
    }

    public interface IOnVideoClickListener {
        void onVideoClick(VideoModel videoModel);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameVideo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameVideo = itemView.findViewById(R.id.rvi_name_video);
        }
    }
}
