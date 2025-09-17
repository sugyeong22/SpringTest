package com.sudal.springtest.jpa.repository;

import com.sudal.springtest.jpa.domain.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

    public List<Recruit> findById(int id);

    public List<Recruit> findByPositionAndType(String positon, String type);

    public List<Recruit> findByTypeOrSalaryGreaterThan(String type, int salary);

    public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);

    public List<Recruit> findBySalaryBetween(int salary1, int salary2);

    //마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
    @Query(value = "SELECT * FROM `recruit` WHERE `deadline` > :date AND `salary` >= :salary AND `type` = :type ORDER BY `salary` DESC " , nativeQuery = true)
    public List<Recruit> madeQuery(@Param("date") LocalDate date, @Param("salary") int salary, @Param("type")String type);

}
