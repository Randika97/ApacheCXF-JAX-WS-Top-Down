package com.jaxws.series.top.down.approach.service;


import in.benchresources.entities.book.*;
import in.benchresources.services.bookservice.IBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BookRepository;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@WebService(serviceName="BookService", endpointInterface="in.benchresources.services.bookservice.IBookService",
targetNamespace="http://benchresources.in/services/BookService/", portName="BookServicePort", name="BookServiceImpl")
public class BookServiceImpl implements IBookService {
	private static final Logger logger = LogManager.getLogger(BookServiceImpl.class);
	// http://localhost:8080/ApacheCXF-JAX-WS-Top-Down/services/book/BookService?wsdl
	@Autowired
	private BookRepository bookRepository;
	@Override
	public UpdateBookResponseType updateBookRequest(UpdateBookRequestType parameters) {
		UpdateBookResponseType updateBookResponseType = new UpdateBookResponseType();
		BookInfo bookInfo = new BookInfo();
//		bookInfo.setBookISBN(parameters.getBookInfo().);
//		bookInfo.setBookName(parameters.getBookName());
//		bookInfo.setAuthor(parameters.getAuthor());
//		bookInfo.setCategory(parameters.getCategory());
//		bookRepository.save(bookInfo);
		return updateBookResponseType;
	}

	@Override
	public BookAllResponseType getBookAllRequest(BookAllRequestType parameters) {

		BookAllResponseType bookAllResponseType = new BookAllResponseType();
		try{
			bookAllResponseType.getBookInfo();
		}
		catch (Exception e){
			logger.error("Error while setting values for employee object", e);
		}
		return bookAllResponseType;
	}

	@Override
	public AddBookResponseType addBookRequest(AddBookRequestType parameters) {
		AddBookResponseType addBookResponseType = new AddBookResponseType();
		BookInfo bookInfo = new BookInfo();
		bookInfo.setBookISBN(parameters.getBookISBN());
		bookInfo.setBookName(parameters.getBookName());
		bookInfo.setAuthor(parameters.getAuthor());
		bookInfo.setCategory(parameters.getCategory());
		bookRepository.save(bookInfo);
		return addBookResponseType;
	}

	@Override
	public BookResponseType getBookByISDNRequestNumber(BookRequestType parameters) {

		// create object of responseType and set values & return
		BookResponseType bookResponseType = new BookResponseType();
//		bookResponseType.setBookISBN(parameters.getIsbnNumber());
//		bookResponseType.setBookName("Software Engineering");
//		bookResponseType.setAuthor("Developer unknown");
//		bookResponseType.setCategory("DevOps");
		Long isbn = Long.valueOf(parameters.getIsbnNumber());
		BookInfo bookInfo = bookRepository.findAllById(isbn);
		return bookResponseType;
	}

	@Override
	public DeleteBookResponseType deleteBookRequest(DeleteBookRequestType parameters) {
		DeleteBookResponseType deleteBookResponseType = new DeleteBookResponseType();
		BookInfo bookInfo = new BookInfo();
		bookInfo.setBookISBN(parameters.getIsbnNumber());
		bookRepository.delete(bookInfo);
		return deleteBookResponseType;
	}

}