package cn.big.bigd.apod.methylome.service;

import cn.big.bigd.apod.methylome.domain.MethProbe;
import org.springframework.stereotype.Service;

/**
 * Created by xiongzhuang on 2018/8/13;
 */
@Service
public class MethProbeService {
    public void add2MethProbe(String probeId,String annotation,int methLevel){
        MethProbe methProbe = new MethProbe();
        methProbe.setPId(probeId);
        methProbe.setAnno(annotation);
        methProbe.setMLv(methLevel);


    }
}
