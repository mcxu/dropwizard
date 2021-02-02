package com.example.helloworld.health;

import com.codahale.metrics.health.HealthCheck;
import com.example.helloworld.core.Template;

import java.util.Optional;

public class TemplateHealthCheck extends HealthCheck {
    //private final Template template;
    private final String template;

    // public TemplateHealthCheck(Template template) {
    //     this.template = template;
    // }

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        // template.render(Optional.of("woo"));
        // template.render(Optional.empty());
        final String saying = String.format(template, "TEST");
        if(!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
