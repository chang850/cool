package com.rsupport.webviewer.core.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = false, of = {"id"})
@ToString
@NoArgsConstructor
@Table(name = "rt_support_room")
@Entity
@Data
@AllArgsConstructor
public class SupportRoom {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;
}
