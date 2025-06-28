package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DropwizardGradleJavaSimpleApplication extends Application<DropwizardGradleJavaSimpleConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardGradleJavaSimpleApplication().run(args);
    }

    public void initialize(Bootstrap<DropwizardGradleJavaSimpleConfiguration> config) {
        super.initialize(config);
    }


    @Override
    public void run(DropwizardGradleJavaSimpleConfiguration configuration, Environment environment) {
        // This method is where you would set up your application resources, health checks, etc.
        // For now, it does nothing.
    }

}