package com.example.media;
import com.example.media.models.VideoModel;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static String ARG_VIDEOMODEL = "ARG_VIDEOMODEL";

    public static List<VideoModel> generateList() {
        List<VideoModel> videos = new ArrayList<>();
        videos.add(new VideoModel("Breaking Bad",
                "https://ia800702.us.archive.org/26/items/BreakingBad_201901/breaking%20bad.mp4"));
        videos.add(new VideoModel("westworld",
                "https://ia800701.us.archive.org/26/items/westworld_201901/westworld.mp4"));
        videos.add(new VideoModel("sherlock",
                "https://ia800707.us.archive.org/11/items/sherlock_201901/sherlock.mp4"));
        videos.add(new VideoModel("Monstres Inc",
                "https://ia800707.us.archive.org/23/items/MonstresInc/monstres%20inc.mp4"));

        return videos;
    }
}
