package com.ll.exam.qsl.interestKeyword.entity;

import com.ll.exam.qsl.user.entity.SiteUser;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InterestKeyword {
    @Id
    private String content;

    @ManyToOne
    @JoinColumn(name = "siteUser")
    private SiteUser siteUser;
}