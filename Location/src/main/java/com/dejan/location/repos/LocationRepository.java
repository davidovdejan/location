package com.dejan.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dejan.location.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
