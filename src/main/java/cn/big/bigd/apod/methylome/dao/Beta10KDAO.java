package cn.big.bigd.apod.methylome.dao;

import cn.big.bigd.apod.methylome.domain.Beta10K;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xiongzhuang on 2018/8/10;
 */
public interface Beta10KDAO extends JpaRepository<Beta10K, String> {

}
