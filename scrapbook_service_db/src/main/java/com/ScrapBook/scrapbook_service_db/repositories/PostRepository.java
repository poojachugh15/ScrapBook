package com.ScrapBook.scrapbook_service_db.repositories;

import com.ScrapBook.scrapbook_service_db.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    public List<Post> findByRoomId(Long id);

}
