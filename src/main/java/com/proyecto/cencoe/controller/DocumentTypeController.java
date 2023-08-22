package com.proyecto.cencoe.controller;

import com.proyecto.cencoe.entity.DocumentType;
import com.proyecto.cencoe.servicio.IDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentTypeController {

    @Autowired
    private IDocumentTypeService documentTypeService;

    @PostMapping("/save")
    public String saveDocType (@RequestBody DocumentType documentType){
        documentTypeService.saveDocType(documentType);
        return "saved";
    }
    @GetMapping("/list")
    public List getDocType(){
        List<DocumentType> documentTypeList = documentTypeService.listDocType();
        return documentTypeList;
    }

    @PatchMapping("/update-doctype")
    public String updateDocType(@RequestParam String doctypeName, @RequestParam Long doctypeId){
        documentTypeService.updateDocType(doctypeName, doctypeId);
        return "updated";
    }

    @GetMapping("/id")
    public DocumentType getDocumentType(@RequestParam Long doctypeId){
        return documentTypeService.getDocumentType(doctypeId);
    }
}
