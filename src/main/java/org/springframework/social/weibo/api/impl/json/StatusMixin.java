package org.springframework.social.weibo.api.impl.json;

import java.util.List;

import org.springframework.social.weibo.api.Annotation;
import org.springframework.social.weibo.api.Geo;
import org.springframework.social.weibo.api.PicUrl;
import org.springframework.social.weibo.api.Status;
import org.springframework.social.weibo.api.Visible;
import org.springframework.social.weibo.api.WeiboProfile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class StatusMixin extends WeiboObjectMixin
{
    @JsonProperty("created_at")
    String createdAt;
    @JsonProperty("id")
    Long id;
    @JsonProperty("mid")
    Long mid;
    @JsonProperty("idstr")
    String idstr;
    @JsonProperty("text")
    String text;
    @JsonProperty("source_allowclick")
    Integer sourceAllowclick;
    @JsonProperty("source_type")
    Integer sourceType;
    @JsonProperty("source")
    String source;
    @JsonProperty("favorited")
    Boolean favorited;
    @JsonProperty("truncated")
    Boolean truncated;
    @JsonProperty("in_reply_to_status_id")
    String inReplyToStatusId;
    @JsonProperty("in_reply_to_user_id")
    String inReplyToUserId;
    @JsonProperty("in_reply_to_screen_name")
    String inReplyToScreenName;
    @JsonProperty("pic_urls")
    List<PicUrl> picUrls;
    @JsonProperty("thumbnail_pic")
    String thumbnailPic;
    @JsonProperty("bmiddle_pic")
    String bmiddlePic;
    @JsonProperty("original_pic")
    String originalPic;
    @JsonProperty("geo")
    Geo geo;
    @JsonProperty("user")
    WeiboProfile user;
    @JsonProperty("retweeted_status")
    Status retweetedStatus;
    @JsonProperty("annotations")
    List<Annotation> annotations;
    @JsonProperty("reposts_count")
    Integer repostsCount;
    @JsonProperty("comments_count")
    Integer commentsCount;
    @JsonProperty("attitudes_count")
    Integer attitudesCount;
    @JsonProperty("isLongText")
    Boolean isLongText;
    @JsonProperty("mlevel")
    Integer mlevel;
    @JsonProperty("visible")
    Visible visible;
    @JsonProperty("biz_feature")
    Integer bizFeature;
    @JsonProperty("darwin_tags")
    List<Object> darwinTags;
    @JsonProperty("hot_weibo_tags")
    List<Object> hotWeiboTags;
    @JsonProperty("text_tag_tips")
    List<Object> textTagTips;
    @JsonProperty("userType")
    Integer userType;
}
