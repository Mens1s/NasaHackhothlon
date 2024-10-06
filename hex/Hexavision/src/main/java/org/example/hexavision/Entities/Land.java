package org.example.hexavision.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="lands")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="x1", nullable = false)
    private Integer x1;

    @Column(name="y1", nullable = false)
    private Integer y1;

    @Column(name="x2", nullable = false)
    private Integer x2;

    @Column(name="y2", nullable = false)
    private Integer y2;

    @Column(name="x3", nullable = false)
    private Integer x3;

    @Column(name="y3", nullable = false)
    private Integer y3;

    @Column(name="x4", nullable = false)
    private Integer x4;

    @Column(name="y4", nullable = false)
    private Integer y4;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
