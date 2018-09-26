JAVA Callback
//https://stackoverflow.com/questions/17255498/implementing-callbacks-in-java-with-runnable
//https://www.geeksforgeeks.org/asynchronous-synchronous-callbacks-java/

it works ,but errors in response return in callback functions

mongodb pagenation

https://scalegrid.io/blog/fast-paging-with-mongodb/
https://stackoverflow.com/questions/5049992/mongodb-paging


So troublesome several weeks on the CORS issue of SpringBoot + Spring Security + JWT + REST Access

The JwtTokenFilter is added before UsernamePasswordAuthenticationFilter(Authentication processing mechanisms in Spring Security)
The Cors Filter will also added before JwtTokenFilter...
So Configured at JwtTokenFilterConfigurer.java

So use CORSFilter extends GenericFilterBean,
// https://github.com/PeaceUCR/SpringBootInDepth/blob/master/src/main/java/com/example/demo/filter/LogFilter.java  this way not work(we need to config order)

For CORS access from Browser, it should first send a preflight request, the preflight request will not include the authentication header
so, it will get 403 with HTTP method Options(not sure if error in preflight, then real request will not send)
let's add Options in WebSecurity web 
https://stackoverflow.com/questions/38368794/angular-2-basic-authentication-not-working/45830981#45830981 

         web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");

Then CORS access works

Spring Security Filter Orders 
https://docs.spring.io/spring-security/site/docs/3.0.x/reference/security-filter-chain.html


Java mail

//https://www.mkyong.com/java/javamail-api-sending-email-via-gmail-smtp-example/
//https://myaccount.google.com/lesssecureapps
//open this otherwise will fail to auth