package org.springframework.social.weibo.api;

import java.io.Serializable;

public class WeiboProfile extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = 8727986372391995013L;

	private Long id;

	private String idstr;

	private Integer _class;

	private String screenName;

	private String name;

	private String province;

	private String city;

	private String location;

	private String description;

	private String url;

	private String profileImageUrl;

	private String profileUrl;

	private String domain;

	private String weihao;

	private String gender;

	private Integer followersCount;

	private Integer friendsCount;

	private Integer pagefriendsCount;

	private Integer statusesCount;

	private Integer favouritesCount;

	private String createdAt;

	private Boolean following;

	private Boolean allowAllActMsg;

	private Boolean geoEnabled;

	private Boolean verified;

	private Integer verifiedType;

	private String remark;

	private Status status;

	private Integer ptype;

	private Boolean allowAllComment;

	private String avatarLarge;

	private String avatarHd;

	private String verifiedReason;

	private String verifiedTrade;

	private String verifiedReasonUrl;

	private String verifiedSource;

	private String verifiedSourceUrl;

	private Boolean followMe;

	private Integer onlineStatus;

	private Integer biFollowersCount;

	private String lang;

	private Integer star;

	private Integer mbtype;

	private Integer mbrank;

	private Integer blockWord;

	private Integer blockApp;

	private Integer creditScore;

	private Integer userAbility;

	private Integer urank;

	public Long getId()
	{
		return id;
	}

	public String getIdstr()
	{
		return idstr;
	}

	public Integer getClass_()
	{
		return _class;
	}

	public String getScreenName()
	{
		return screenName;
	}

	public String getName()
	{
		return name;
	}

	public String getProvince()
	{
		return province;
	}

	public String getCity()
	{
		return city;
	}

	public String getLocation()
	{
		return location;
	}

	public String getDescription()
	{
		return description;
	}

	public String getUrl()
	{
		return url;
	}

	public String getProfileImageUrl()
	{
		return profileImageUrl;
	}

	public String getProfileUrl()
	{
		return profileUrl;
	}

	public String getDomain()
	{
		return domain;
	}

	public String getWeihao()
	{
		return weihao;
	}

	public String getGender()
	{
		return gender;
	}

	public Integer getFollowersCount()
	{
		return followersCount;
	}

	public Integer getFriendsCount()
	{
		return friendsCount;
	}

	public Integer getPagefriendsCount()
	{
		return pagefriendsCount;
	}

	public Integer getStatusesCount()
	{
		return statusesCount;
	}

	public Integer getFavouritesCount()
	{
		return favouritesCount;
	}

	public String getCreatedAt()
	{
		return createdAt;
	}

	public Boolean getFollowing()
	{
		return following;
	}

	public Boolean getAllowAllActMsg()
	{
		return allowAllActMsg;
	}

	public Boolean getGeoEnabled()
	{
		return geoEnabled;
	}

	public Boolean getVerified()
	{
		return verified;
	}

	public Integer getVerifiedType()
	{
		return verifiedType;
	}

	public String getRemark()
	{
		return remark;
	}

	public Status getStatus()
	{
		return status;
	}

	public Integer getPtype()
	{
		return ptype;
	}

	public Boolean getAllowAllComment()
	{
		return allowAllComment;
	}

	public String getAvatarLarge()
	{
		return avatarLarge;
	}

	public String getAvatarHd()
	{
		return avatarHd;
	}

	public String getVerifiedReason()
	{
		return verifiedReason;
	}

	public String getVerifiedTrade()
	{
		return verifiedTrade;
	}

	public String getVerifiedReasonUrl()
	{
		return verifiedReasonUrl;
	}

	public String getVerifiedSource()
	{
		return verifiedSource;
	}

	public String getVerifiedSourceUrl()
	{
		return verifiedSourceUrl;
	}

	public Boolean getFollowMe()
	{
		return followMe;
	}

	public Integer getOnlineStatus()
	{
		return onlineStatus;
	}

	public Integer getBiFollowersCount()
	{
		return biFollowersCount;
	}

	public String getLang()
	{
		return lang;
	}

	public Integer getStar()
	{
		return star;
	}

	public Integer getMbtype()
	{
		return mbtype;
	}

	public Integer getMbrank()
	{
		return mbrank;
	}

	public Integer getBlockWord()
	{
		return blockWord;
	}

	public Integer getBlockApp()
	{
		return blockApp;
	}

	public Integer getCreditScore()
	{
		return creditScore;
	}

	public Integer getUserAbility()
	{
		return userAbility;
	}

	public Integer getUrank()
	{
		return urank;
	}
}
