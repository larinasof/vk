package ru.netology.domain;

public class Post {
    private String id;
    private String videoUrl;
    private String imageUrl;
    private String imageText;
    private String postText;

    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private SharedInfo sharedInfo;
    private SeenInfo seenInfo;
    private TimeOfPosting timeOfPosting;

    public TimeOfPosting getTimeOfPosting() {
        return timeOfPosting;
    }

    public void setTimeOfPosting(TimeOfPosting timeOfPosting) {
        this.timeOfPosting = timeOfPosting;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public SharedInfo getSharedInfo() {
        return sharedInfo;
    }

    public void setSharedInfo(SharedInfo sharedInfo) {
        this.sharedInfo = sharedInfo;
    }

    public SeenInfo getSeenInfo() {
        return seenInfo;
    }

    public void setSeenInfo(SeenInfo seenInfo) {
        this.seenInfo = seenInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageText() {
        return imageText;
    }

    public void setImageText(String imageText) {
        this.imageText = imageText;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
