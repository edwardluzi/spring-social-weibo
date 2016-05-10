package org.springframework.social.weibo.api.impl;

import org.junit.Before;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractWeiboApiTest
{
	protected WeiboTemplate weibo;

	@Before
	public void setup()
	{
		weibo = createWeiboTemplate();
	}

	protected WeiboTemplate createWeiboTemplate()
	{
		return new WeiboTemplate(System.getenv("weibo.accessToken"));
	}
}
