package org.develop.controller;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.develop.entity.UserEntity;
import org.develop.service.UserService;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GET
    public Response test() {
        return Response.ok("Teste esdrasdev").build();
    }

    @Transactional
    @POST
    @Path("/create-user")
    public Response createUser(UserEntity userEntity) {

        return Response.ok(userService.createUser(userEntity)).build();
    }
}
