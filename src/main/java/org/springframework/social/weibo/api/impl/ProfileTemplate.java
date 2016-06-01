package org.springframework.social.weibo.api.impl;

import org.springframework.social.weibo.api.ProfileOperations;
import org.springframework.social.weibo.api.WeiboProfile;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

class ProfileTemplate extends AbstractTemplate implements ProfileOperations
{
    private static final String API_URL_USERS = "users/show.json";

    public ProfileTemplate(RestOperations restOperations, ObjectMapper objectMapper, boolean isAuthorized)
    {
        super(restOperations, objectMapper, isAuthorized);
    }

    public WeiboProfile getUserProfileById(long uid)
    {
        requireAuthorization();
        return getRestOperations().getForObject(buildUri(API_URL_USERS, "uid", uid), WeiboProfile.class);
    }

    public WeiboProfile getUserProfileByScreenName(String screenName)
    {
        requireAuthorization();
        return getRestOperations().getForObject(buildUri("users/show.json", "screen_name", screenName),
                WeiboProfile.class);
    }
}
