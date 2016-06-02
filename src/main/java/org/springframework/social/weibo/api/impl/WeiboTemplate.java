package org.springframework.social.weibo.api.impl;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.weibo.api.ProfileOperations;
import org.springframework.social.weibo.api.Weibo;
import org.springframework.social.weibo.api.impl.json.WeiboModule;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeiboTemplate extends AbstractOAuth2ApiBinding implements Weibo
{
    private ProfileOperations profileOperations;
    private ObjectMapper objectMapper;

    public WeiboTemplate(String accessToken)
    {
        super(accessToken);
        initialize();
    }

    public WeiboTemplate()
    {
        initialize();
    }

    @Override
    public ProfileOperations profileOperations()
    {
        return profileOperations;
    }

    @Override
    public RestOperations restOperations()
    {
        return getRestTemplate();
    }

    protected ObjectMapper getObjectMapper()
    {
        return objectMapper;
    }

    @Override
    public void setRequestFactory(ClientHttpRequestFactory requestFactory)
    {
        // Wrap the request factory with a BufferingClientHttpRequestFactory so
        // that the error handler can do repeat reads on the response.getBody()
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(requestFactory));
    }

    @Override
    protected OAuth2Version getOAuth2Version()
    {
        return OAuth2Version.BEARER_DRAFT_2;
    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate)
    {
        super.configureRestTemplate(restTemplate);
        restTemplate.setErrorHandler(new WeiboErrorHandler());
    }

    @Override
    protected MappingJackson2HttpMessageConverter getJsonMessageConverter()
    {
        MappingJackson2HttpMessageConverter converter = super.getJsonMessageConverter();
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new WeiboModule());
        converter.setObjectMapper(objectMapper);
        return converter;
    }

    private void initialize()
    {
        // Wrap the request factory with a BufferingClientHttpRequestFactory so
        // that the error handler can do repeat reads on the response.getBody()
        super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
        initSubApis();
    }

    private void initSubApis()
    {
        profileOperations = new ProfileTemplate(getRestTemplate(), objectMapper, isAuthorized());
    }
}
