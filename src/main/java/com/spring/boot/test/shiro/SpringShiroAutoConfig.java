package com.spring.boot.test.shiro;

//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.SimpleAccount;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.Authorizer;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.realm.SimpleAccountRealm;
//import org.apache.shiro.session.mgt.SessionManager;

/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
@Configuration
public class SpringShiroAutoConfig {
	
	/*@Bean
	public ServletContextInitializer contentInit() {
		return new ServletContextInitializer() {
			
			public void onStartup(ServletContext servletContext) throws ServletException {
				servletContext.setInitParameter("staticSecurityManagerEnabled", "true");
			}
		};
	}

	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		
		shiroFilterFactoryBean.setLoginUrl("/login");
		
		shiroFilterFactoryBean.setSuccessUrl("index");
		
		
		shiroFilterFactoryBean.setUnauthorizedUrl("/error");
		Map<String, String> filterMap = new HashMap<String, String>();
		filterMap.put("/login", "authc");
		filterMap.put("/static", "anon");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;
	}
	
	@Bean
	public FilterRegistrationBean delegatingFilterProxy() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
	    DelegatingFilterProxy proxy = new DelegatingFilterProxy();
	    proxy.setTargetFilterLifecycle(true);
	    proxy.setTargetBeanName("shiroFilterFactoryBean");
	    filterRegistrationBean.setFilter(proxy);
	    Map<String, String> initMap = new HashMap<String, String>();
	    initMap.put("staticSecurityManagerEnabled", "true");
	    filterRegistrationBean.setInitParameters(initMap);
	    return filterRegistrationBean;
	}
	
	@Bean
	public SecurityManager authenticator() {
		DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
		defaultWebSecurityManager.setRealm(microShiroRealm());
//		defaultWebSecurityManager.setAuthorizer(authorizer());
		defaultWebSecurityManager.setSessionManager(sessionManager());
		return defaultWebSecurityManager;
	}
	
	@Bean
	public Realm microShiroRealm() {
		return new MyReal();
	}
	
	@Bean
	public Authorizer authorizer() {
		return new SimpleAccountRealm();
	}
	
	@Bean
	public SessionManager sessionManager() {
		return new DefaultWebSecurityManager();
	}*/
}

/*class MyReal extends SimpleAccountRealm {

	// protected就是给子类重写的
	// 访问的认证并返回信息 
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("登录信息.");
		if (token instanceof UsernamePasswordToken) {
			UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
			String name = usernamePasswordToken.getUsername();
			String pwd = String.valueOf(usernamePasswordToken.getPassword());
			if (name.equals("micro") && pwd.equals("111111")) {
				return new SimpleAccount();
			}
		}
		return null;
	}

	// 授权信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("授权信息");
		return null;
	}
	
}*/
