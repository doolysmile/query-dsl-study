package com.ll.exam.qsl.user.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SiteUserInterestKeyword {
    @Id
    @GeneratedValue
    private Long id;


}
