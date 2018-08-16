package cn.big.bigd.apod.methylome.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by xiongzhuang on 2018/8/10;
 */


@Document(collection = "beta450")
public class Beta450 {
    @Id
    private String sId;
    private List<MethProbe> methProbe;
    private int age;
    private String gender;

    public String getSId(){
        return sId;
    }

    public void setSId(String sample_id) {
        this.sId = sample_id;
    }

    public List<MethProbe> getMethProbe() {
        return methProbe;
    }

    public void setMethProbe(List<MethProbe> methProbe) {
        this.methProbe = methProbe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
