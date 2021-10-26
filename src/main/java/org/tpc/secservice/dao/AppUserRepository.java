package org.tpc.secservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tpc.secservice.entities.AppUser;
@RepositoryRestResource
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
public AppUser findByUsername(String username);
}
