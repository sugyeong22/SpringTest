package com.sudal.springtest.jpa.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="`recruit`")
@Entity
public class Recruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int companyId;
    public String position;
    public String responsibilities;
    public String qualification;
    public String type;
    public String region;
    public int salary;
    public LocalDateTime deadline;

    @CreationTimestamp
    public LocalDateTime createdAt;
    @UpdateTimestamp
    public LocalDateTime updatedAt;
}
