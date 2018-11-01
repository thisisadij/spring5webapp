package guru.springframework.spring5webapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.vo.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
