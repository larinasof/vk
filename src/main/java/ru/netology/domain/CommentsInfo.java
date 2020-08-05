package ru.netology.domain;

public class CommentsInfo {
    private int amountOfComments;
    private boolean canComment; //private int canComment = 0/1
    private int groupsCanPost; //private boolean groupsCanPost
    private boolean canOpen;
    private boolean canClose;


    public int getAmountOfComments() {
        return amountOfComments;
    }

    public void setAmountOfComments(int amountOfComments) {
        this.amountOfComments = amountOfComments;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

}
