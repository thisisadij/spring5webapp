package guru.springframework.spring5webapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.vo.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Serializable>{

}
