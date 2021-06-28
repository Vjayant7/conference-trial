package com.clarivate.conferencedemo.repositories;

import com.clarivate.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {

}
