package guru.springframework.spring5webapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import guru.springframework.spring5webapp.vo.Author;
import guru.springframework.spring5webapp.vo.Book;
import guru.springframework.spring5webapp.vo.Publisher;
@Component
public class ApplicationListener implements org.springframework.context.ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	PublisherRepository publisherRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();

	}

	public void initData() {
		
		Publisher publish=new Publisher();
		publish.setName("Geeta");
		publish.setAddress("Delhi");
		publisherRepository.save(publish);
		
		Author author = new Author("Aditya", "Jain");
		Book book = new Book(1,publish,"Head first Java");
		authorRepository.save(author);
		bookRepository.save(book);

		Author dhvani = new Author("Dhvani", "Jain");
		Book dhvaniBook = new Book(2,publish,"Head first .net");
		authorRepository.save(dhvani);
		bookRepository.save(dhvaniBook);
	}

}
