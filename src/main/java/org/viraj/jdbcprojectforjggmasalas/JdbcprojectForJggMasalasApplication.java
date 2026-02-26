package org.viraj.jdbcprojectforjggmasalas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.viraj.jdbcprojectforjggmasalas.service.MasalaService;

@SpringBootApplication
public class JdbcprojectForJggMasalasApplication {

    public static void main(String[] args) {
        ApplicationContext context=  SpringApplication.run(JdbcprojectForJggMasalasApplication.class, args);
        MasalaService service =context.getBean(MasalaService.class,args);

    }

}
