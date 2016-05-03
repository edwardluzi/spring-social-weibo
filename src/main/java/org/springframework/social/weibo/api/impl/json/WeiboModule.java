package org.springframework.social.weibo.api.impl.json;

import org.springframework.social.weibo.api.Annotation;
import org.springframework.social.weibo.api.Geo;
import org.springframework.social.weibo.api.PicUrl;
import org.springframework.social.weibo.api.Status;
import org.springframework.social.weibo.api.Visible;
import org.springframework.social.weibo.api.WeiboObject;
import org.springframework.social.weibo.api.WeiboProfile;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class WeiboModule extends SimpleModule
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2187084305052393830L;

	public WeiboModule()
	{
		super("WeiboModule");
	}

	@Override
	public void setupModule(SetupContext context)
	{
		context.setMixInAnnotations(Annotation.class, AnnotationMixin.class);
		context.setMixInAnnotations(Geo.class, GeoMixin.class);
		context.setMixInAnnotations(PicUrl.class, PicUrlMixin.class);
		context.setMixInAnnotations(Status.class, StatusMixin.class);
		context.setMixInAnnotations(Visible.class, VisibleMixin.class);
		context.setMixInAnnotations(WeiboObject.class, WeiboObjectMixin.class);
		context.setMixInAnnotations(WeiboProfile.class, WeiboProfileMixin.class);
	}
}
