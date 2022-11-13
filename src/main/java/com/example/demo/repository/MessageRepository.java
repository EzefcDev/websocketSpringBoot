package com.example.demo.repository;

import com.example.demo.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    MessageEntity findByUserDni(String dni);

    @Query(value = "SELECT * FROM message WHERE target_user = :dni", nativeQuery=true)
    List<MessageEntity> findByAllTargetUser(String dni);
}
