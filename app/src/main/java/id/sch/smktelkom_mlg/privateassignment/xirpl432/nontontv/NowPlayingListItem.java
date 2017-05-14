package id.sch.smktelkom_mlg.privateassignment.xirpl432.nontontv;

/**
 * Created by user on 5/14/2017.
 */

public class NowPlayingListItem {
    private String imageUrl;
    private String title;
    private String content;

    public NowPlayingListItem(String imageUrl, String title, String content) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
