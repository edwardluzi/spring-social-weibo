package org.springframework.social.weibo.api;

import java.io.Serializable;

/*
 * 微博的可见性及指定可见分组信息
 */
public class Visible extends WeiboObject implements Serializable
{
	private static final long serialVersionUID = 3729006780018714170L;
	
	private Integer type;
	private Integer listId;

	/*
	 * 0：普通微博，1：私密微博，3：指定分组微博，4：密友微博；
	 */
	public Integer getType()
	{
		return type;
	}

	/*
	 * 分组的组号
	 */
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