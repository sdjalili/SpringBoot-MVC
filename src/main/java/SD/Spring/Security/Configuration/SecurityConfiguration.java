package SD.Spring.Security.Configuration;

//@Configuration
public class SecurityConfiguration {

//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){
//       JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
//       jdbcUserDetailsManager.setUsersByUsernameQuery("select username,password, enabled from user where username=?");
//       jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("SELECT username, rolename FROM employee_directory.user " +
//               "INNER JOIN employee_directory.users_roles " +
//               "ON employee_directory.user.id = employee_directory.users_roles.user_id " +
//               "INNER JOIN employee_directory.role " +
//               "ON employee_directory.role.id = employee_directory.users_roles.role_id " +
//               "WHERE username=?");
//       return jdbcUserDetailsManager;
//    }

    //assigning roles to users
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeHttpRequests(configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET, "/employees").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.GET, "/employees/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.PUT, "/employees").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.DELETE, "/employees").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.DELETE, "/employees/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.GET, "/users").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.GET, "/users/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.PUT, "/users").hasRole("ADMIN")
 //                       .requestMatchers(HttpMethod.DELETE, "/users").hasRole("ADMIN"));
//        httpSecurity.httpBasic(Customizer.withDefaults());
//        httpSecurity.csrf(csrf->csrf.disable());
//        return httpSecurity.build();
//    }



    //In-memory user defining
   /* @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails sadegh = User.builder()
                .username("jalilisd")
                .password("Aa@12345678")
                .roles("EMPLOYEE")
                .build();
        return new InMemoryUserDetailsManager(sadegh);
    }
*/
}
