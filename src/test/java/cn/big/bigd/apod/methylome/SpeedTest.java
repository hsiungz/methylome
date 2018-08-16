package cn.big.bigd.apod.methylome;

import cn.big.bigd.apod.methylome.domain.MethProbe;
import cn.big.bigd.apod.methylome.service.Beta450Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by xiongzhuang on 2018/8/13;
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeedTest {

   @Autowired
    Beta450Service beta450Service;
    @Test
    public void  insert(){

        for (int i=1;i<10000;i++){
            List<MethProbe> probe = new ArrayList<>();
            int age= (int)(Math.random()*100);

            for (int j=0;j<200000;j++){
                MethProbe probe1 = new MethProbe();
                int meth_level = (int)(Math.random()*1000);
//                BigDecimal b   =   new   BigDecimal(meth_level);
//                float  meth_level1   =   b.setScale(3,  BigDecimal.ROUND_HALF_UP).floatValue();
                probe1.setMLv(meth_level);
                probe1.setAnno("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
                probe1.setPId(""+j);
                probe.add(probe1);
                System.out.print("sample" +i+ "\n");
                System.out.print("probe" +j+ "\n");

            }


            beta450Service.add("GSM"+i, probe,age,"F");


        }
    }

}
