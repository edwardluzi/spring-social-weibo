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
		String accessToken = System.getenv("weibo.accessToken");

		return new WeiboTemplate(accessToken);
	}
}
