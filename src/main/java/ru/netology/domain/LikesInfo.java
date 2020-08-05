package ru.netology.domain;

public class LikesInfo {
    private int amountOfLikes;
    private boolean hadLiked; //private int userLikes = 0/1
    private int canLike; //boolean
    private int canPublish; //boolean

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public int getAmountOfLikes() {
        return amountOfLikes;
    }

    public void setAmountOfLikes(int amountOfLikes) {
        this.amountOfLikes = amountOfLikes;
    }

    public boolean isHadLiked() {
        return hadLiked;
    }

    public void setHadLiked(boolean hadLiked) {
        this.hadLiked = hadLiked;
    }
}
