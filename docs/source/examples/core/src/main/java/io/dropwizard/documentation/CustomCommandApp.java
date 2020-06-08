package io.dropwizard.documentation;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CustomCommandApp extends Application<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addCommand(new MyCommand());
    }

    @Override
    public void run(Configuration configuration, Environment environment) {
    }
}