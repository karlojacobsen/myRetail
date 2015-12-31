package myretail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myretail.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
