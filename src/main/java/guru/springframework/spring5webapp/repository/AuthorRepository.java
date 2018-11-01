package guru.springframework.spring5webapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.vo.Author;

public interface AuthorRepository extends JpaRepository<Author, Serializable> {

}
