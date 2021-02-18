package com.lx.cloud.pojo;

import java.io.Serializable;

public class Dept implements Serializable {

    private Long deptno;//主键

    private String dname;

    private String db_source;//一个服务对应一个数据库

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
