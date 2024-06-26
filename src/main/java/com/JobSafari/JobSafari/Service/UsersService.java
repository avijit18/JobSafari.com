package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.Users;

public interface UsersService {
    public Users addNew(Users users);

    public Object getCurrentUserProfile();

    public Users getCurrentUser();
}
