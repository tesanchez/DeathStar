package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
import io.swagger.model.InlineResponse500;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class BooksApiService {
    public abstract Response booksGet( String title, Boolean fullMatch, Integer authorID,SecurityContext securityContext) throws NotFoundException;
}
