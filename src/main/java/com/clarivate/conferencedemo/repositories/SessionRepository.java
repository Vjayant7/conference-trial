package com.clarivate.conferencedemo.repositories;

import com.clarivate.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface SessionRepository extends JpaRepository<Session,Long> {

}
