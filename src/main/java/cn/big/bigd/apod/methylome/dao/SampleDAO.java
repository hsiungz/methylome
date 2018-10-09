package cn.big.bigd.apod.methylome.dao;

import cn.big.bigd.apod.methylome.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by xiongzhuang on 2018/9/30;
 */
public interface SampleDAO extends JpaRepository<Sample, String> {

    List<Sample> findAllByAgeGreaterThan(Double age);

    @Query(nativeQuery = true, value = "select data_id from sample where age>?1 limit 1000")
    List<Object> findAllByAgeGreaterThanMy(Double age);

}
