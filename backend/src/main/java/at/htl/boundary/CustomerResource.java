package at.htl.boundary;

import at.htl.controll.CustomerRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {

    @Inject
    CustomerRepository repository;

    @GET
    @Path("/lukas")
    public Response findAllLukas(){
        return Response.ok().entity(repository.findAllLukas()).build();
    }

    @GET
    @Path("/all")
    public Response findAll(){
        return Response.ok().entity(repository.findAll()).build();
    }

}
