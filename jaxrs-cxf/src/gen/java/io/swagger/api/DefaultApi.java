package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Employee HR Service
 *
 * <p>Manages Employees
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get User.
     *
     * Get Users from DB.
     *
     */
    @GET
    @Path("/user")
    @ApiOperation(value = "Get User.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    public InlineResponse200 userGet(@QueryParam("first_name") @NotNull String firstName);
}

