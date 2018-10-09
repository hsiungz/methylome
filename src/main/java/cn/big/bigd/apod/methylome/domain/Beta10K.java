package cn.big.bigd.apod.methylome.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by xiongzhuang on 2018/8/10;
 */
@Entity
@Data
public class Beta10K {

    @Id
    private String probeId;

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    private String cpg;
    private Double test;
    private String gene;
}
