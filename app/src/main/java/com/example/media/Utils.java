package com.example.media;
import com.example.media.models.VideoModel;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static String ARG_VIDEOMODEL = "ARG_VIDEOMODEL";

    public static List<VideoModel> generateList() {
        List<VideoModel> videos = new ArrayList<>();
        videos.add(new VideoModel("Примроуз лейн",
                "https://cdn.apollostream.xyz/65e0cf593bd01651623d9e0441c2dc51:2019090821:760424481/flv/720-3fa20683944cf9200c12e55f250cdfd75d74b2a194b56.mp4"));
        videos.add(new VideoModel("Человек паук",
                "https://cdn.apollostream.xyz/ce34f81801b37d9ce9bfe8bcb37dfc77:2019090821:760424481/flv/1080-ab1d5e7ea813fde0f692d39aee148337.mp4"));
        videos.add(new VideoModel("Ковбои против пришельцев",
                "http://185.38.12.34/sec/1568001483/37363033a823d3c68da6f208e703da631a14b8c63424e56d/ivs/05/c4/5ce2a3dce530.mp4/hls/tracks-1,4/index.m3u8"));
        videos.add(new VideoModel("Гарри потер и дары смерти",
                "https://cdn.apollostream.xyz/a4eed0b94a4ac72d75e53bebf8d6b9b0:2019090821:760424481/flv/720-e15a913b66baf454c065ae26efeb7869.mp4"));

        return videos;
    }
}
