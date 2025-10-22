package com.virtualbook.controller;

/*import com.virtualbook.model.Book;
import com.virtualbook.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "index";
    }

    @GetMapping("/{id}")
    public String viewBook(@PathVariable Long id, Model model) {
        bookService.getBookById(id).ifPresent(book ->
                model.addAttribute("book", book));
        return "book/view";
    }

    @GetMapping("/category/{categoryId}")
    public String booksByCategory(@PathVariable Long categoryId, Model model) {
        model.addAttribute("books", bookService.getBooksByCategory(categoryId));
        return "books/category";
    }
}*/