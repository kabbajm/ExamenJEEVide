package ginfo.emi.ac.ma;

import ginfo.emi.ac.ma.models.Compte;
import ginfo.emi.ac.ma.models.UserRole;
import ginfo.emi.ac.ma.repositories.CompteRepository;
import ginfo.emi.ac.ma.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ExamenJeeApplication {

    final CompteRepository cr;
    final BCryptPasswordEncoder bCryptPasswordEncoder;
    final UserService us;

    public ExamenJeeApplication(CompteRepository cr,
                                BCryptPasswordEncoder bCryptPasswordEncoder,
                                UserService us) {
        this.cr = cr;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.us = us;
    }

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(ExamenJeeApplication.class, args);
    }

    @Bean
    CommandLineRunner console() {
        return (args) -> {
            System.out.println("   Console   ");
            System.out.println("   Creation du compte super admin   ");
            Compte compte = new Compte("superadmin@emi.ac.ma", "super");
            compte.setUserRole(UserRole.ADMIN);
            us.signUpUser(compte);
            System.out.println("   Debut   ");

        };

    }
}
