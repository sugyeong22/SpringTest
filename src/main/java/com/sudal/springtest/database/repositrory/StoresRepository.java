package com.sudal.springtest.database.repositrory;

import com.sudal.springtest.database.domain.Stores;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoresRepository {

    // 데이터 베이스랑 연결하여 모든 행 조회
    public List<Stores> selectStoresList();
}
