# JWTAuthentication
JWT Authentication with Spring Boot version 3.1 

Steps to implement the JWT token:

1)  Make sure spring-boot-starter-security is in pom.xml

2) Create a class, JWTAthenticationEntryPoint, that implements AuthenticationEntryPoint. The method of this class is called whenever an exception is thrown due to an unauthenticated user trying to access the resource that requires authentication.

3) Create a JWTHelper  class This class contains a method related to performing operations with JWT tokens like generateToken, validateToken, etc.

4) Create a JWTAuthenticationFilter that extends OncePerRequestFilter and overrides the method, and write the logic to check the token that is coming in the header. We have to write five important logic

          a -Get a Token from the request
          b-Validate Token
          c -GetUsername from token
          d the user associated with this token
          e-set authentication

5) Configure spring security in a configuration file:

6) Create a JWTRequest and a JWTResponse to receive request data and send a login success response.

7) Create a login API to accept username and password and return a token if the username and password are correct.

8) Test the application.
