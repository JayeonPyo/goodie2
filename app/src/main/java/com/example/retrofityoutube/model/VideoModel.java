package com.example.retrofityoutube.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoModel {
    private Integer id;
    private String title;
    private String publisher;
    private String publishedDate;
    private String youtubeId;
    private String thumbnail;
    private String createdDate;
    private String tags;
    private Integer viewCount;
    private Integer likeCount;
    private Integer dislikeCount;
    private Integer commentCount;
    private String embedHtml;




        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public String getYoutubeId() {
            return youtubeId;
        }

        public void setYoutubeId(String youtubeId) {
            this.youtubeId = youtubeId;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public Integer getViewCount() {
            return viewCount;
        }

        public void setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
        }

        public Integer getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
        }

        public Integer getDislikeCount() {
            return dislikeCount;
        }

        public void setDislikeCount(Integer dislikeCount) {
            this.dislikeCount = dislikeCount;
        }

        public Integer getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
        }

        public String getEmbedHtml() {
            return embedHtml;
        }

        public void setEmbedHtml(String embedHtml) {
            this.embedHtml = embedHtml;
        }


        public VideoModel(Integer id, String title, String publisher, String publishedDate,String youtubeId,String thumbnail, String createdDate,String tags,Integer viewCount,Integer likeCount,Integer dislikeCount,Integer commentCount, String embedHtml){

            this.id = id;
            this.title = title;
            this.publisher = publisher;
            this.publishedDate = publishedDate;
            this.youtubeId = youtubeId;
            this.thumbnail = thumbnail;
            this.createdDate = createdDate;
            this.tags = tags;
            this.viewCount = viewCount;
            this.likeCount = likeCount;
            this.dislikeCount = dislikeCount;
            this.commentCount = commentCount;
            this.embedHtml = embedHtml;


        }

}
