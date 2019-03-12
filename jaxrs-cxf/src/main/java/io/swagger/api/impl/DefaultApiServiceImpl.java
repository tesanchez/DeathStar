package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Employee HR Service
 *
 * <p>Manages Employees
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Get User.
     *
     * Get Users from DB.
     *
     */
    public InlineResponse200 userGet(String firstName) {
        // TODO: Implement...
        
        return null;
    }
    
}

