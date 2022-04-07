package com.gallo.analytics_server_0.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Long> {
}
