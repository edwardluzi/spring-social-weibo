package org.springframework.social.weibo.api.impl;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.social.weibo.api.Weibo;

public class AbstractWeiboApiTest
{
	private AnnotationConfigApplicationContext applicationContext;
	private Environment environment;

	protected Weibo weibo;

	@Before
	public void setup()
	{
		this.applicationContext = new AnnotationConfigApplicationContext(AbstractWeiboApiTest.class);
		this.environment = this.applicationContext.getEnvironment();

		this.weibo = createWeiboTemplate();
	}

	@After
	public void tearDown()
	{
		if (this.applicationContext != null)
		{
			this.applicationContext.close();
		}
	}

	protected Weibo createWeiboTemplate()
	{
		return new WeiboTemplate(this.environment.getProperty("social.weibo.accessToken"));
	}
}
