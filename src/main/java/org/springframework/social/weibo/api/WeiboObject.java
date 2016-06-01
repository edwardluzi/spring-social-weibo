package org.springframework.social.weibo.api;

import java.util.HashMap;
import java.util.Map;

public abstract class WeiboObject
{
    private Map<String, Object> extraData;

    public WeiboObject()
    {
        extraData = new HashMap<String, Object>();
    }

    public Map<String, Object> getExtraData()
    {
        return extraData;
    }

    protected void add(String key, Object value)
    {
        extraData.put(key, value);
    }
}
