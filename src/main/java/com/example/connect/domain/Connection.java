package com.example.connect.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

/*
 * a simple domain entity doubling as a DTO
 */
@Entity
@Table(name = "skill")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Connection {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String id1;

    @Column(nullable = false)
    private String id2;

    @Column()
    String createdDate;

    public Connection() {
    }

    public Connection(String id1, String id2, String createdDate) {
        this.id1 = id1;
        this.id2 = id2;
        this.createdDate = createdDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Connection{");
        sb.append("id=").append(id);
        sb.append(", id1='").append(id1).append('\'');
        sb.append(", id2='").append(id2).append('\'');
        sb.append(", createdDate='").append(createdDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}