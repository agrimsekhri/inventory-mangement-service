//package com.rez.java.notconfig;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//@Configuration
//@EnableAuthorizationServer
//public class AuthorisationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//	@Autowired
//	@Qualifier("authenticationManagerBean")
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private JwtAccessTokenConverter accessTokenConverter;
//
//	@Bean
//	public TokenStore tokenStore() {
//		return new JwtTokenStore(accessTokenConverter);
//	}
//	
//	@Bean
//	public TokenEnhancer tokenEnhancer() {
//	    return new CustomTokenEnhancer();
//	}
//
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
//	    tokenEnhancerChain.setTokenEnhancers(
//	      Arrays.asList(tokenEnhancer(), accessTokenConverter));
//		endpoints.tokenStore(tokenStore()).accessTokenConverter(accessTokenConverter)
//				.authenticationManager(authenticationManager);
//	}
//	
//	@Override
//	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//    	security.allowFormAuthenticationForClients();
//    	security.tokenKeyAccess("permitAll()")
//        .checkTokenAccess("permitAll()");
//	}
//
////	@Bean
////	public JwtAccessTokenConverter accessTokenConverter() {
////		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
////		converter.setSigningKey("84rihofihWlasdfVlkas8ZsVl9hjaf094nalyTHsc0fb");
////		return converter;
////	}
//	
////	@Bean
////    @Primary
////    public DefaultTokenServices tokenServices() {
////        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
////        defaultTokenServices.setTokenStore(tokenStore());
////        defaultTokenServices.setSupportRefreshToken(true);
////        return defaultTokenServices;
////    }
//}
