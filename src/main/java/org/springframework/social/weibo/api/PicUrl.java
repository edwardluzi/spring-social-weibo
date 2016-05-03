package org.springframework.social.weibo.api;

import java.io.Serializable;

public class PicUrl extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = -7837193767739029191L;
			
	private String thumbnailPic;

	public String getThumbnailPic()
	{
		return thumbnailPic;
	}
}
