package com.example.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.placement.entity.CertificateEntity;

public interface CertificateRepository extends JpaRepository<CertificateEntity, Long> {

}