package com.apotheon.userservice.configuration;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * PropertyConfiguration an utility class this class will extends PropertySourcesPlaceholderConfigurer .
 * URL Constants defined here instead of hardcoding in every controller.
 */
public class PropertyConfiguration extends PropertySourcesPlaceholderConfigurer {

    public static final String API_USER_URL = "/api/user";
    public static final String ACCOUNT_REGISTER_URL = "/account/register";
    public static final String ACCOUNT_LOGIN_URL = "/account/login";
}
