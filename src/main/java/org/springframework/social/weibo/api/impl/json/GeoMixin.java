package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GeoMixin extends WeiboObjectMixin
{
    @JsonProperty("poiid")
    String poiid;
    @JsonProperty("title")
    String title;
    @JsonProperty("address")
    String address;
    @JsonProperty("lon")
    String lon;
    @JsonProperty("lat")
    String lat;
    @JsonProperty("category")
    String category;
    @JsonProperty("city")
    String city;
    @JsonProperty("province")
    String province;
    @JsonProperty("country")
    String country;
    @JsonProperty("url")
    String url;
    @JsonProperty("phone")
    String phone;
    @JsonProperty("postcode")
    String postcode;
    @JsonProperty("weibo_id")
    String weiboId;
    @JsonProperty("categorys")
    String categorys;
    @JsonProperty("category_name")
    String categoryName;
    @JsonProperty("icon")
    String icon;
    @JsonProperty("checkin_num")
    Integer checkinNum;
    @JsonProperty("checkin_user_num")
    String checkinUserNum;
    @JsonProperty("tip_num")
    Integer tipNum;
    @JsonProperty("photo_num")
    Integer photoNum;
    @JsonProperty("todo_num")
    Integer todoNum;
}
