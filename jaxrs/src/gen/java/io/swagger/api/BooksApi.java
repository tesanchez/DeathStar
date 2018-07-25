package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BooksApiService;
import io.swagger.api.factories.BooksApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
import io.swagger.model.InlineResponse500;

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

@Path("/books")


@io.swagger.annotations.Api(description = "the books API")

public class BooksApi  {
   private final BooksApiService delegate;

   public BooksApi(@Context ServletConfig servletContext) {
      BooksApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BooksApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BooksApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BooksApiServiceFactory.getBooksApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrives an array of book objects scoped to title or authorID.", notes = "This resource is used to search our book database, and retrieve a set of objects related to your query. If there are no objects to return, the API will still return a 200 Status, but the \"results\" set will be an empty array and should be accounted for.", response = InlineResponse200.class, tags={ "books", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array of book objects is returned based on search criterias", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse404.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "server error", response = InlineResponse500.class) })
    public Response booksGet(@ApiParam(value = "Title string to query. API will return both whole and partial matches dependent on the *fullMatch* parameter.") @QueryParam("title") String title
,@ApiParam(value = "Boolean value of whether or not to return and exact match to the title query string.") @QueryParam("fullMatch") Boolean fullMatch
,@ApiParam(value = "ID of author to retrieve related books. Similar functionality can be found by querying *_/authors/{id}/books* if that level is desired.") @QueryParam("authorID") Integer authorID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.booksGet(title,fullMatch,authorID,securityContext);
    }
}
