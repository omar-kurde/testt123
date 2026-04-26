package com.smartcity.backend.model;

import com.smartcity.backend.enums.ReportCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "report")
@Entity
public class Report {
    @Id
    private String reportId;
    @Column(nullable = false)
    private Long user_Id;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private double lat;
    @Column(nullable = false)
    private double lon;
    @Column(nullable = false)
    private ReportCategory category;
    private byte[] image;
}
