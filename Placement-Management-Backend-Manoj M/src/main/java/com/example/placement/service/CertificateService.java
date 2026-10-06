package com.example.placement.service;

import java.util.List;

import com.example.placement.entity.CertificateEntity;

public interface CertificateService {

    CertificateEntity registercertificate(CertificateEntity certificateEntity);

    List<CertificateEntity> getCertificate();

    void deletecertificate(long id);

    CertificateEntity updatecertificate(long id, CertificateEntity certificateEntity);
}