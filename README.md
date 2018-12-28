# Spring-Boot-in-Action
learn and pratice the book &lt;&lt;Spring Boot in Action>>

Chapter 1: BootStarting Spring


Chapter 2: Developing your first spring boot application

	URL:localhost:8080

	2.1 Putting Spring Boot to work

		1. @SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
		2. build.gradle

	2.2 Using starter dependencies

	2.3 Using automatic configuration

		1. @Entity 
		2. @Id @GeneratedValue
		3. JpaRepository
		4. Thymeleaf


Chapter 3: Customizing configuration

	3.1 Overriding Boot auto-configuration

		1. WebSecurityConfigurerAdapter
		2. UserDetails
		3. isAccountNonExpired isAccountNonLocked isCredentialsNonExpired isEnabled

	3.2 Creating a custom security configuration

		1. application.properties/application.yml
			1.1 spring.main.show-banner = false
		 	1.2 spring.thymeleaf.cache=false
		 	1.3 server.port=8000
			1.4 logging
			1.5 datasource
		2. @ConfigurationProperties(prefix="amazon")
		3. @Profile("production")

	3.3 Cudtomizing application error pages


Chapter 4: Testing with Spring Boot

	4.1 Intergration testing auto-configuration

	4.2 Testing web application

	4.3 Testing a running application


Chapter 5: Getting Groovy with the Spring Boot CLI

	5.1 Developing a Spring Boot CLI application

	5.2 Grabbing dependencies

	5.3 Running tests with CLI

	5.4 Creating a deployable artifact


Chapter 6: Applying Grails in Spring Boot

	6.1 Using CORM for data persistence

	6.2 Defining views with Griivy server pages

	6.3 Mixing Spring Boot with Grails


Chapter 7: Taking a peek inside with the actuator

	7.1 Exploring the Actuator endpoints

		1. compile('org.springframework.boot:spring-boot-starter-actuator')
		2. compile('org.springframework.boot:spring-boot-configuration-processor:2.0.1.RELEASE')

	7.2 Connecting to the Actuator remotes shell

	7.3 monitoring your application with JMX

	7.4 Customizing the Actuator

	7.5 Securing Actuator endpoints


Chapter 8: Deploying Spring Boot Applications

	8.1 Weighing deployment options

	8.2 Deploying to an application server

	8.3 Pushing to the cloud
