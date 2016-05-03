package org.springframework.social.weibo.api;

import java.io.Serializable;

public class Annotation extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = -3931089618080111685L;
	
	private String clientMblogid;

	public String getClientMblogid()
	{
		return clientMblogid;
	}
}
