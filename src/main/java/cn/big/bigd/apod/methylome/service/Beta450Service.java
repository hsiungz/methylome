package cn.big.bigd.apod.methylome.service;

import cn.big.bigd.apod.methylome.dao.Beta450DAO;
import cn.big.bigd.apod.methylome.domain.Beta450;
import cn.big.bigd.apod.methylome.domain.MethProbe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.util.List;

import static org.thymeleaf.util.StringUtils.append;


/**
 * Created by xiongzhuang on 2018/8/10;
 */
@Service


public class Beta450Service {
    @Autowired
    Beta450DAO beta450DAO;

    public void add(String sample_id, List meth_probe, int age, String gender) {



        Beta450 beta450 = new Beta450();

        beta450.setSId(sample_id);

        beta450.setMethProbe(meth_probe);
        beta450.setAge(age);
        beta450.setGender(gender);

        beta450DAO.save(beta450);

    }
}
