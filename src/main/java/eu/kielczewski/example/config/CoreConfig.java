package eu.kielczewski.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import pl.project13.maven.git.GitRepositoryState;

@Configuration
class CoreConfig {

    @Autowired
    Environment environment;

    @Bean
    public GitRepositoryState gitRepositoryState(){
        GitRepositoryState state = new GitRepositoryState();
        state.setBranch(environment.getProperty("git.branch"));
        return state;
    }

}
