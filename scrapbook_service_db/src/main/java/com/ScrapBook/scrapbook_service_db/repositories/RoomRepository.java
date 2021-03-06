package com.ScrapBook.scrapbook_service_db.repositories;

import com.ScrapBook.scrapbook_service_db.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByUsersId(Long user_id);

    Room findByRoomNameAndAdmin(String name, String email);
}
