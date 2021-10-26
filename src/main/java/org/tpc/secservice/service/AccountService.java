package org.tpc.secservice.service;

import org.tpc.secservice.entities.AppRole;
import org.tpc.secservice.entities.AppUser;

public interface AccountService {
public AppUser saveUser(String username,String password,String confirmedPassword);
public AppRole save(AppRole role);
public AppUser loadUserByUsername(String username);
public void addRoleToUser(String username,String rolename );


}
