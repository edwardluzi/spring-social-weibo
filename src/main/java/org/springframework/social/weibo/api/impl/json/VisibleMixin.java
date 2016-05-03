package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class VisibleMixin extends WeiboObjectMixin
{
	@JsonProperty("type")
	Integer type;
	
	@JsonProperty("list_id")
	Integer listId;

	VisibleMixin(@JsonProperty("type") Integer type, @JsonProperty("list_id") Integer listId)
	{
	}
}
