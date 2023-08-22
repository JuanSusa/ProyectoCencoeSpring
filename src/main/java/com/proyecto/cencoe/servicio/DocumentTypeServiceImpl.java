package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.entity.DocumentType;
import com.proyecto.cencoe.repository.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeServiceImpl implements IDocumentTypeService{
    @Autowired
    private IDocumentTypeRepository documentTypeRepository;

    @Override
    public void saveDocType(DocumentType documentType) {
        DocumentType documentTypeSave = documentTypeRepository.save(documentType);
    }

    @Override
    public List<DocumentType> listDocType() {
        List<DocumentType> documentTypeList = documentTypeRepository.findAll();
        return documentTypeList;
    }

    @Override
    public void updateDocType(String doctypeName, Long doctypeId) {
        Optional<DocumentType> documentType = documentTypeRepository.findById(doctypeId);
        if(documentType.isPresent()){
            System.out.println(documentType.get().getDoctypeName());
            documentType.get().setDoctypeName(doctypeName);
            System.out.println(documentType.get().getDoctypeName());
            documentTypeRepository.save(documentType.get());
        }
    }

    @Override
    public DocumentType getDocumentType(Long doctypeId) {

        Optional<DocumentType> documentType = documentTypeRepository.findById(doctypeId);
        if (documentType.isPresent()){
            return documentType.get();
        }else{
            return null;
        }
    }
}
