package repository;

import in.benchresources.entities.book.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookInfo, Integer> {

    BookInfo findAllById(Long isbn);
}
