package org.springframework.social.weibo.api;

public interface ProfileOperations
{
    WeiboProfile getUserProfileById(long uid);

    WeiboProfile getUserProfileByScreenName(String screenName);
}