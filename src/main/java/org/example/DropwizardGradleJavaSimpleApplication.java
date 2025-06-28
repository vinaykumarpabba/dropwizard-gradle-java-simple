package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.healthcheck.BasicHealthCheck;
import org.example.resource.GreetingResource;

public class DropwizardGradleJavaSimpleApplication extends Application<DropwizardGradleJavaSimpleConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardGradleJavaSimpleApplication().run(args);
    }

    public void initialize(Bootstrap<DropwizardGradleJavaSimpleConfiguration> config) {
        super.initialize(config);
    }


    @Override
    public void run(DropwizardGradleJavaSimpleConfiguration config, Environment env) {
        // This method is where you would set up your application resources, health checks, etc.

        final GreetingResource greetingResource = new GreetingResource(config.getQuestion(), config.getGreetingTemplate());
        env.jersey().register(greetingResource);

        final BasicHealthCheck basicHealthCheck = new BasicHealthCheck(config.getGreetingTemplate());
        env.healthChecks().register("Template Check", basicHealthCheck);
    }

}