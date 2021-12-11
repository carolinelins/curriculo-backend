package org.acme.hibernate.orm.panache;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

@Path("/certifications")
@ApplicationScoped
public class CertificationResource {
    @GET
    public Uni<List<Certification>> get() {
        return Certification.listAll(Sort.by("year"));
    }
}
