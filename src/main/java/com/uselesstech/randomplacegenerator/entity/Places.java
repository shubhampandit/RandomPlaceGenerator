package com.uselesstech.randomplacegenerator.entity;

import javax.persistence.*;

@Entity
@Table(name = "places")
public class Places {

    public Places() {
    }

    public Places(String name, String dest, String type, String subType) {
        this.name = name;
        this.dest = dest;
        this.type = type;
        this.subType = subType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dest")
    private String dest;

    @Column(name = "type")
    private String type;

    @Column(name = "sub_type")
    private String subType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
