package org.example.healthcheck;


import com.codahale.metrics.health.HealthCheck;

public class BasicHealthCheck extends HealthCheck {
    private final String greetingTemplate;

    public BasicHealthCheck(String greetingTemplate) {
        this.greetingTemplate = greetingTemplate;
    }

    @Override
    protected Result check() {
        final String greeting = String.format(this.greetingTemplate, "TEST");
        return !greeting.contains("TEST") ? Result.unhealthy("Unhealthy") : Result.healthy();
    }
}
