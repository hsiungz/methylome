package cn.big.bigd.apod.methylome.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by xiongzhuang on 2018/8/13;
 */
@Document
public class MethProbe {

    private String pId;
    private String anno;
    private int mLv;

    public String getPId() {
        return pId;
    }


    public int getMLv() {
        return mLv;
    }

    public void setPId(String pId) {
        this.pId = pId;

    }
    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setMLv(int mLv) {
        this.mLv = mLv;
    }
}
