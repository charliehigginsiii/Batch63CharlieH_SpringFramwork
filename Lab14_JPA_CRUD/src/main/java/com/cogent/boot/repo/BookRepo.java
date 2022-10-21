package com.cogent.boot.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cogent.boot.bean.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {

}
