package org.springframework.social.weibo.api;

import java.util.HashMap;
import java.util.Map;

public abstract class WeiboObject
{
	private Map<String, Object> extraData;

	public WeiboObject()
	{
		this.extraData = new HashMap<String, Object>();
	}

	public Map<String, Object> getExtraData()
	{
		return this.extraData;
	}

	protected void add(String key, Object value)
	{
		this.extraData.put(key, value);
	}
}
