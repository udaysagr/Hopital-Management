package com.htc.hospitalreview.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.hospitalreview.model.Hospital;

@RepositoryRestResource
public interface HospitalReviewRepository extends PagingAndSortingRepository<Hospital, Long> {

	List<Hospital> findByAuthor(@Param("author") String author);
}
