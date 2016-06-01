package org.springframework.social.weibo.api;

import org.springframework.social.ApiBinding;
import org.springframework.web.client.RestOperations;

public interface Weibo extends ApiBinding
{
    ProfileOperations profileOperations();

    RestOperations restOperations();
}
