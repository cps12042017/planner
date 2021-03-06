package com.easyupload.photos.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
	List<Event> findByEventId(Long eventId);
	List<Event> findByUserId(String userId);
}