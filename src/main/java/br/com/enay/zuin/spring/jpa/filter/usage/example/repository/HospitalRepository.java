package br.com.enay.zuin.spring.jpa.filter.usage.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.com.enay.zuin.spring.jpa.filter.repository.GenericRepository;
import br.com.enay.zuin.spring.jpa.filter.usage.example.entity.HospitalEntity;

@Primary
@Repository
public interface HospitalRepository extends GenericRepository<HospitalEntity> {
}
