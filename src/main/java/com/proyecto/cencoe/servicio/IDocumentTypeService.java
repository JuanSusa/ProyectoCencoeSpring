package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.entity.DocumentType;

import java.util.List;

public interface IDocumentTypeService {

    void saveDocType(DocumentType documentType);

    List<DocumentType> listDocType();

    void updateDocType(String doctypeName, Long doctypeId);

    DocumentType getDocumentType(Long doctypeId);
}
