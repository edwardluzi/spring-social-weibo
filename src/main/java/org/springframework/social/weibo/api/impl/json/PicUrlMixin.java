package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PicUrlMixin extends WeiboObjectMixin
{
    @JsonProperty("thumbnail_pic")
    String thumbnailPic;

}
