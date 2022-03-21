package com.example.featureapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.UserProvider;
import org.togglz.core.user.thread.ThreadLocalUserProvider;

@Configuration
public class TogglzConfiguration {

    @Bean
    FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(Feature.class);
    }

    @Bean
    StateRepository stateRepository() {
        return new InMemoryStateRepository();
    }

    @Bean
    UserProvider userProvider() {
        return new ThreadLocalUserProvider();
    }

}
