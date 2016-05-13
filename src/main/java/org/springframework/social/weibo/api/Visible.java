package org.springframework.social.weibo.api;

import java.io.Serializable;

public class Visible extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = 3729006780018714170L;

	private Integer type;
	private Integer listId;

	public Integer getType()
	{
		return type;
	}

	public Integer getListId()
	{
		return listId;
	}

	public Visible(Integer type, Integer listId)
	{
		this.type = type;
		this.listId = listId;
	}
}