package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class BookController {

//    bring an instance of the book repository
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //   when we pass this to the url this method is invoked
    @RequestMapping("/books")
//    passing the model // this is what is going to tget returned to the view
    public String getBooks(Model model) {

//        spring -> /books -> getBooks method -> model -> add attribute -> execute bookrepository -> return list of books
//        -> it has an attrbiute called books -> add it to the model -> return the view
//        add the attribute to the model
//        spring is going to take the model and pass it to the view

        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
