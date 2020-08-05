package ru.netology.domain;

public class LikesInfo {
    private int amountOfLikes;
    private boolean hadLiked;

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
