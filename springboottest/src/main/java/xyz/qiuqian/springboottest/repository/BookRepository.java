package xyz.qiuqian.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.qiuqian.springboottest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
