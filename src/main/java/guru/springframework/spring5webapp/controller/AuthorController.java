package guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.AuthorRepository;

@Controller
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepo;
	
	@RequestMapping("/author")
	public String getAuthor(Model model)
	{
		model.addAttribute("authors", authorRepo.findAll());
		
		return "authors";
	}

}
