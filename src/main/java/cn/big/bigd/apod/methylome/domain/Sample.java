package cn.big.bigd.apod.methylome.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xiongzhuang on 2018/9/30;
 */
@Entity
@Data
public class Sample {

    @Id
    private String id;
    private String projectId;
    private String dataId;
    private double age;

}
