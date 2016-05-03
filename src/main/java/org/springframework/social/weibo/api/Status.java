package org.springframework.social.weibo.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Status extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = 7013829441915561166L;
	
	private String createdAt;
	private Long id;
	private Long mid;
	private String idstr;
	private String text;
	private Integer sourceAllowclick;
	private Integer sourceType;
	private String source;
	private Boolean favorited;
	private Boolean truncated;
	private String inReplyToStatusId;
	private String inReplyToUserId;
	private String inReplyToScreenName;
	private List<PicUrl> picUrls = new ArrayList<PicUrl>();
	private String thumbnailPic;
	private String bmiddlePic;
	private String originalPic;
	private Geo geo;
	private List<Annotation> annotations = new ArrayList<Annotation>();
	private Integer repostsCount;
	private Integer commentsCount;
	private Integer attitudesCount;
	private Boolean isLongText;
	private Integer mlevel;
	private Visible visible;
	private Integer bizFeature;
	private List<Object> darwinTags = new ArrayList<Object>();
	private List<Object> hotWeiboTags = new ArrayList<Object>();
	private List<Object> textTagTips = new ArrayList<Object>();
	private Integer userType;

	public String getCreatedAt()
	{
		return createdAt;
	}

	public Long getId()
	{
		return id;
	}

	public Long getMid()
	{
		return mid;
	}

	public String getIdstr()
	{
		return idstr;
	}

	public String getText()
	{
		return text;
	}

	public Integer getSourceAllowclick()
	{
		return sourceAllowclick;
	}

	public Integer getSourceType()
	{
		return sourceType;
	}

	public String getSource()
	{
		return source;
	}

	public Boolean getFavorited()
	{
		return favorited;
	}

	public Boolean getTruncated()
	{
		return truncated;
	}

	public String getInReplyToStatusId()
	{
		return inReplyToStatusId;
	}

	public String getInReplyToUserId()
	{
		return inReplyToUserId;
	}

	public String getInReplyToScreenName()
	{
		return inReplyToScreenName;
	}

	public List<PicUrl> getPicUrls()
	{
		return picUrls;
	}

	public String getThumbnailPic()
	{
		return thumbnailPic;
	}

	public String getBmiddlePic()
	{
		return bmiddlePic;
	}

	public String getOriginalPic()
	{
		return originalPic;
	}

	public Geo getGeo()
	{
		return geo;
	}

	public List<Annotation> getAnnotations()
	{
		return annotations;
	}

	public Integer getRepostsCount()
	{
		return repostsCount;
	}

	public Integer getCommentsCount()
	{
		return commentsCount;
	}

	public Integer getAttitudesCount()
	{
		return attitudesCount;
	}

	public Boolean getIsLongText()
	{
		return isLongText;
	}

	public Integer getMlevel()
	{
		return mlevel;
	}

	public Visible getVisible()
	{
		return visible;
	}

	public Integer getBizFeature()
	{
		return bizFeature;
	}

	public List<Object> getDarwinTags()
	{
		return darwinTags;
	}

	public List<Object> getHotWeiboTags()
	{
		return hotWeiboTags;
	}

	public List<Object> getTextTagTips()
	{
		return textTagTips;
	}

	public Integer getUserType()
	{
		return userType;
	}
}
