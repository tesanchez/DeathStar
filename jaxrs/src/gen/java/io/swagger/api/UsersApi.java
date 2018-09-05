package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UsersApiService;
import io.swagger.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")

public class UsersApi  {
   private final UsersApiService delegate;

   public UsersApi(@Context ServletConfig servletContext) {
      UsersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UsersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UsersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UsersApiServiceFactory.getUsersApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Allows users to get employees", response = InlineResponse200.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse200.class) })
    public Response usersGet(@ApiParam(value = "UUID number of employee",required=true) @QueryParam("UUID") String UUID
,@ApiParam(value = "Users first name") @QueryParam("first_name") String firstName
,@ApiParam(value = "Users last name") @QueryParam("last_name") String lastName
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersGet(UUID,firstName,lastName,securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "sample", notes = "sample", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Endpoint Not found Please make sure you have the right endpoint", response = InlineResponse404.class) })
    public Response usersPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersPost(securityContext);
    }
}
