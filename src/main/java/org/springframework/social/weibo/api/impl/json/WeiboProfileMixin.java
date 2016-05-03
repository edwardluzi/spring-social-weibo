package org.springframework.social.weibo.api.impl.json;

import org.springframework.social.weibo.api.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class WeiboProfileMixin extends WeiboObjectMixin
{
	@JsonProperty("id")
	Long id;
	@JsonProperty("idstr")
	String idstr;
	@JsonProperty("class")
	Integer _class;
	@JsonProperty("screen_name")
	String screenName;
	@JsonProperty("name")
	String name;
	@JsonProperty("province")
	String province;
	@JsonProperty("city")
	String city;
	@JsonProperty("location")
	String location;
	@JsonProperty("description")
	String description;
	@JsonProperty("url")
	String url;
	@JsonProperty("profile_image_url")
	String profileImageUrl;
	@JsonProperty("profile_url")
	String profileUrl;
	@JsonProperty("domain")
	String domain;
	@JsonProperty("weihao")
	String weihao;
	@JsonProperty("gender")
	String gender;
	@JsonProperty("followers_count")
	Integer followersCount;
	@JsonProperty("friends_count")
	Integer friendsCount;
	@JsonProperty("pagefriends_count")
	Integer pagefriendsCount;
	@JsonProperty("statuses_count")
	Integer statusesCount;
	@JsonProperty("favourites_count")
	Integer favouritesCount;
	@JsonProperty("created_at")
	String createdAt;
	@JsonProperty("following")
	Boolean following;
	@JsonProperty("allow_all_act_msg")
	Boolean allowAllActMsg;
	@JsonProperty("geo_enabled")
	Boolean geoEnabled;
	@JsonProperty("verified")
	Boolean verified;
	@JsonProperty("verified_type")
	Integer verifiedType;
	@JsonProperty("remark")
	String remark;
	@JsonProperty("status")
	Status status;
	@JsonProperty("ptype")
	Integer ptype;
	@JsonProperty("allow_all_comment")
	Boolean allowAllComment;
	@JsonProperty("avatar_large")
	String avatarLarge;
	@JsonProperty("avatar_hd")
	String avatarHd;
	@JsonProperty("verified_reason")
	String verifiedReason;
	@JsonProperty("verified_trade")
	String verifiedTrade;
	@JsonProperty("verified_reason_url")
	String verifiedReasonUrl;
	@JsonProperty("verified_source")
	String verifiedSource;
	@JsonProperty("verified_source_url")
	String verifiedSourceUrl;
	@JsonProperty("follow_me")
	Boolean followMe;
	@JsonProperty("online_status")
	Integer onlineStatus;
	@JsonProperty("bi_followers_count")
	Integer biFollowersCount;
	@JsonProperty("lang")
	String lang;
	@JsonProperty("star")
	Integer star;
	@JsonProperty("mbtype")
	Integer mbtype;
	@JsonProperty("mbrank")
	Integer mbrank;
	@JsonProperty("block_word")
	Integer blockWord;
	@JsonProperty("block_app")
	Integer blockApp;
	@JsonProperty("credit_score")
	Integer creditScore;
	@JsonProperty("user_ability")
	Integer userAbility;
	@JsonProperty("urank")
	Integer urank;
}
