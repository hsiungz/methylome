package cn.big.bigd.apod.methylome;


import cn.big.bigd.apod.methylome.dao.Beta10KDAO;
import cn.big.bigd.apod.methylome.dao.SampleDAO;
import cn.big.bigd.apod.methylome.domain.Beta10K;
import cn.big.bigd.apod.methylome.domain.Sample;
import cn.big.bigd.apod.methylome.service.Beta10KService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.*;


/**
 * Created by xiongzhuang on 2018/8/13;
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeedTest {

    @Autowired
    Beta10KDAO beta10KDAO;

    @Autowired
    SampleDAO sampleDAO;

    @PersistenceContext
    private EntityManager em;

//    @Test
//    public void insert(){
//        for (int i = 0; i <100000 ; i++) {
//            Sample sample = new Sample();
//            String id = "GSM" + i;
//            String project_id = "GSE" + i;
//            Double age = Math.random()*100;
//            String[] key_name = {"a","b","c","d","e","f","g","h","i","j"};
//            int x= i/10000;
//            int y= (i/1000)-x*10;
//            int z= i/100-x*100-y*10;
//            int m= i/10-x*1000-y*100-z*10;
//            int n= i-x*10000-y*1000-z*100-m*10;
//            String data_id = key_name[x] + "->" + "'$." + key_name[y] + "."+ key_name[z] + "." + key_name[m] + "." + key_name[n] + "'";
//            sample.setId(id);
//            sample.setProjectId(project_id);
//            sample.setAge(age);
//            sample.setDataId(data_id);
//            sampleDAO.save(sample);
//            System.out.println("rows:"+ i);
//            System.out.println("data_id:"+ data_id);
//
//        }
//
//    }
//
//    @Test
//    public void speed(){



//        long begintime1 = System.currentTimeMillis();
//        List<Object> samples = sampleDAO.findAllByAgeGreaterThanMy(2.0);
//        String se = "select ";
////        Random ra = new Random();
//        for(Object o : samples){
//            se += o.toString() + "+";
//        }
//
////        for (int i = 0; i < 500; i++) {
//////            Integer j = ra.nextInt(samples.size())-1;
////            se += samples.get(i).toString() + "+";
////        }
//
//
//        se = se.substring(0,se.length()-1);
//        se += " from beta10k where probe_id=\"cpg0000\"";
//        System.out.println(se);
//        long begintime = System.currentTimeMillis();
//        Query query = em.createNativeQuery(se);
//        Object objects = query.getSingleResult();
//
//        long endtinme=System.currentTimeMillis();
//        System.out.printf(objects.toString()+"\n");
//        System.out.println((endtinme - begintime)+"\n");
//        System.out.println((endtinme - begintime1));
//    }

    @Test
    public void insert() {
        try {
            for (int n = 100000; n < 1000000; n++) {
                Beta10K beta10K = new Beta10K();
                String probe_id = "cpg000" + n;
                String gene = "apoe" + n;
                beta10K.setProbeId(probe_id);
                beta10K.setGene(gene);
                double test = Math.random();
                beta10K.setTest(test);
                Random r = new Random();
                int num = r.nextInt(5) + 1;
                String cpg = String.valueOf(num);
                beta10K.setCpg(cpg);
                String[] key_name = {"a","b","c","d","e","f","g","h","i","j"};

                JSONObject  g = new JSONObject();

                for (int i = 0; i < 10; i++) {
                    g.put(key_name[i],new JSONObject());
                    for (int j = 0; j < 10; j++) {
                        g.getJSONObject(key_name[i]).put(key_name[j],new JSONObject());
                        for (int k = 0; k < 10; k++) {
                            g.getJSONObject(key_name[i]).getJSONObject(key_name[j]).put(key_name[k],new JSONObject());
                            for (int l = 0; l <10 ; l++) {
                                g.getJSONObject(key_name[i]).getJSONObject(key_name[j]).getJSONObject(key_name[k]).put(key_name[l],new JSONObject());
                                for (int m = 0; m <10; m++) {
                                    int level = (int)(Math.random()*1000);
                                    g.getJSONObject(key_name[i]).getJSONObject(key_name[j]).getJSONObject(key_name[k]).getJSONObject(key_name[l]).put(key_name[m], level);

                                }

                            }
                        }
                    }
                }

                beta10K.setA(g.getJSONObject("a").toString());
                beta10K.setB(g.getJSONObject("b").toString());
                beta10K.setC(g.getJSONObject("c").toString());
                beta10K.setD(g.getJSONObject("d").toString());
                beta10K.setE(g.getJSONObject("e").toString());
                beta10K.setF(g.getJSONObject("f").toString());
                beta10K.setG(g.getJSONObject("g").toString());
                beta10K.setH(g.getJSONObject("h").toString());
                beta10K.setI(g.getJSONObject("i").toString());
                beta10K.setJ(g.getJSONObject("j").toString());
                beta10KDAO.save(beta10K);
                System.out.print("probe(row)" +n+ "\n");
    //            beta10KService.add2beta10k(probe_id, a, b, c, d, e, f, g, h, i, j, gene, test, cpg);

            }
        }catch (Exception e){
            System.out.println("erro");
        }
    }
}