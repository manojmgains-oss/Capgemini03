package com.example.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placement.entity.CertificateEntity;
import com.example.placement.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public CertificateEntity registercertificate(CertificateEntity certificateEntity) {
        return certificateRepository.save(certificateEntity);
    }

    @Override
    public List<CertificateEntity> getCertificate() {
        return certificateRepository.findAll();
    }

    @Override
    public void deletecertificate(long id) {
        certificateRepository.deleteById(id);
    }

    @Override
    public CertificateEntity updatecertificate(long id, CertificateEntity certificateEntity) {

        CertificateEntity existingCertificate =
                certificateRepository.findById(id).orElse(null);

        if (existingCertificate != null) {

            existingCertificate.setYear(certificateEntity.getYear());
            existingCertificate.setCollege(certificateEntity.getCollege());

            return certificateRepository.save(existingCertificate);
        }

        return null;
    }
}