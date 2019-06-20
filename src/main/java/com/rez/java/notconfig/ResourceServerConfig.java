//package com.rez.java.notconfig;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//
//import com.rez.java.config.util.CustomAccessTokenConverter;
//
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//	
//	@Autowired
//    private CustomAccessTokenConverter customAccessTokenConverter;
//	
//	@Autowired
//    private TokenStore tokenStore;
//
////	@Bean
////	public TokenStore tokenStoreRes() {
////		return new JwtTokenStore(accessTokenConverter());
////	}
//
//	@Override
//    public void configure(ResourceServerSecurityConfigurer config) {
//        config.tokenServices(tokenServices());
//    }
//
//	@Bean
//	public JwtAccessTokenConverter accessTokenConverter() {
//		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//		converter.setSigningKey("84rihofihWlasdfVlkas8ZsVl9hjaf094nalyTHsc0fb");
//		converter.setAccessTokenConverter(customAccessTokenConverter);
//		return converter;
//	}
//	
//	@Bean
//    @Primary
//    public DefaultTokenServices tokenServices() {
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        defaultTokenServices.setTokenStore(tokenStore);
//        defaultTokenServices.setSupportRefreshToken(true);
//        return defaultTokenServices;
//    }
//}
