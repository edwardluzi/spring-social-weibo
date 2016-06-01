package org.springframework.social.weibo.api.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.social.weibo.api.WeiboProfile;

@ComponentScan(basePackages = "org.springframework.social.weibo")
@PropertySource("classpath:application.properties")
public class ProfileTemplateTest extends AbstractWeiboApiTest
{
    @Test
    public void getUserProfile()
    {
        WeiboProfile profile = weibo.profileOperations().getUserProfileById(2191924704L);
        assertEquals(profile.getId(), Long.valueOf(2191924704L));
    }
}
