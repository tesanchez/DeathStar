package io.swagger.api.factories;

import io.swagger.api.BooksApiService;
import io.swagger.api.impl.BooksApiServiceImpl;


public class BooksApiServiceFactory {
    private final static BooksApiService service = new BooksApiServiceImpl();

    public static BooksApiService getBooksApi() {
        return service;
    }
}
