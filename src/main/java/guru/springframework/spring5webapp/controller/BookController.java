package guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@RequestMapping("/book")
	public String getBook(Model model)
	{
		model.addAttribute("books",bookRepo.findAll());
		return "books";
	}

}
