package com.example.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Embeddable
public class CandidateSkillId implements Serializable {
    private static final long serialVersionUID = -5287281748373253314L;
    @Column(name = "can_id", nullable = false)
    private Long canId;

    @Column(name = "skill_id", nullable = false)
    private Long skillId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CandidateSkillId entity = (CandidateSkillId) o;
        return Objects.equals(this.skillId, entity.skillId) &&
                Objects.equals(this.canId, entity.canId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, canId);
    }

}