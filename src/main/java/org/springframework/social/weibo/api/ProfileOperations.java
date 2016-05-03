package org.springframework.social.weibo.api;

public interface ProfileOperations
{
	WeiboProfile getUserProfileById(long Uid);

	WeiboProfile getUserProfileByScreenName(String screenName);
}