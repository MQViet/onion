package com.service.onion.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.sql.Timestamp;

@Data
@MappedSuperclass
public class BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;

    @UpdateTimestamp
    @Column(insertable = false)
    private Timestamp updatedDate;
}
