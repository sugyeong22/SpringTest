package com.sudal.springtest.ajax.repository;

import com.sudal.springtest.ajax.domain.Pension;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PensionRepository {

    public List<Pension> selectPention();

    public int addReservation(
            @Param("name")String name
            , @Param("dateTime") LocalDateTime dateTime
            , @Param("day") int day
            , @Param("headCount") int headCount
            , @Param("phoneNumber") String phoneNumber

    );
}
