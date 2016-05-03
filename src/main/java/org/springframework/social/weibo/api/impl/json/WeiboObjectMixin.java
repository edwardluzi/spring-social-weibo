package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class WeiboObjectMixin
{
	@JsonAnySetter
	abstract void add(String key, Object value);
}
