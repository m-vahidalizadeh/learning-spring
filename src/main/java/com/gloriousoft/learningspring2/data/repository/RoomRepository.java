package com.gloriousoft.learningspring2.data.repository;

import com.gloriousoft.learningspring2.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
