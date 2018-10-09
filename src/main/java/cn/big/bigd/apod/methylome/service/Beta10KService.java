package cn.big.bigd.apod.methylome.service;

import cn.big.bigd.apod.methylome.dao.Beta10KDAO;
import cn.big.bigd.apod.methylome.domain.Beta10K;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xiongzhuang on 2018/8/10;
 */
@Service
public class Beta10KService {
    @Autowired
    Beta10KDAO beta10KDAO;



//    public void add2beta10k(String probe_id, String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String cpg, String test, String gene) {
//
//
//
//        Beta10K beta10k = new Beta10K();
//
//        beta10k.setProbeId(probe_id);
//        beta10k.setA(a);
//        beta10k.setB(b);
//        beta10k.setC(c);
//        beta10k.setD(d);
//        beta10k.setE(e);
//        beta10k.setF(f);
//        beta10k.setG(g);
//        beta10k.setH(h);
//        beta10k.setG(i);
//        beta10k.setJ(j);
//        beta10k.setCpg(cpg);
//        beta10k.setTest(test);
//        beta10k.setGene(gene);
//
//
//        beta10KDAO.save(beta10k);
//
//    }
}
