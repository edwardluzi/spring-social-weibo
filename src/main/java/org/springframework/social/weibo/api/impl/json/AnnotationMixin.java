package org.springframework.social.weibo.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AnnotationMixin extends WeiboObjectMixin
{
    @JsonPropertyDescription("client_mblogid")
    String clientMblogid;
}
