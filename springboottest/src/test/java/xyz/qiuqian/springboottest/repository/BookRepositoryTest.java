package xyz.qiuqian.springboottest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.qiuqian.springboottest.entity.Book;


@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll() {
        System.out.println(bookRepository.findAll());
    }

    @Test
    void save() {
        Book book = new Book();
        book.setName("SpringBoot");
        book.setAuthor("张三");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById() {
        Book book = bookRepository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update() {
        Book book1 = new Book();
        book1.setId(124);
        book1.setName("测试测试");
        Book book2 = bookRepository.save(book1);
        System.out.println(book2);
    }

    @Test
    void deleteById() {
        bookRepository.deleteById(124);
    }

}