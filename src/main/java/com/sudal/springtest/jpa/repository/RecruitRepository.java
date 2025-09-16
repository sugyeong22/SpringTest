package com.sudal.springtest.jpa.repository;

import com.sudal.springtest.jpa.domain.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

    public List<Recruit> findById(int id);
}
