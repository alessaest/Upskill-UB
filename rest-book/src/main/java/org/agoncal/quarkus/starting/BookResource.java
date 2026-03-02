package org.agoncal.quarkus.starting;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
@SuppressWarnings("java:S6813")
public class BookResource {

    @Inject BookRepository repository;
    @Inject Logger logger;

    @GET
    public List<Book> getAllBooks() {
        logger.info("Return all the books");
        return repository.getAllBooks();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getBook(@PathParam("id") int id) {
        logger.info("Return book by id: " + id);
        return repository.getBook(id);
    }
}
