package org.acme.hibernate.orm.panache;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

@Path("/hobbies")
@ApplicationScoped
public class HobbyResource {
    @GET
    public Uni<List<Hobby>> get() {
        return Hobby.listAll(Sort.by("hobby"));
    }
}
