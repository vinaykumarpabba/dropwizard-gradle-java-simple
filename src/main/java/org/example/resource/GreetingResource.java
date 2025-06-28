package org.example.resource;

import com.codahale.metrics.annotation.Timed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/greetings")
public class GreetingResource {

    private final String question;
    private final String greetingTemplate;
    private final AtomicLong countSayHello, countAskName;

    public GreetingResource(String question, String greetingTemplate) {
        this.question = question;
        this.greetingTemplate = greetingTemplate;
        this.countSayHello = new AtomicLong();
        this.countAskName = new AtomicLong();
    }

    @POST
    @Path("/ask-question")
    @Timed
    public AskNameRequest postQuestion() {
        return new AskNameRequest(this.countAskName.incrementAndGet(), this.question);
    }

    @GET
    @Path("/greet")
    @Timed
    public HelloResponse sayHello(@QueryParam("name") Optional<String> name) {
        return new HelloResponse(this.countSayHello.incrementAndGet(), this.greetingTemplate, name.orElse("Stranger"));
    }

}
