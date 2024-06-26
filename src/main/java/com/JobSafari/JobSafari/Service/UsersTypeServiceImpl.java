package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.UsersType;
import com.JobSafari.JobSafari.Repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeServiceImpl implements UsersTypeService{

    @Autowired
    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeServiceImpl(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    @Override
    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
