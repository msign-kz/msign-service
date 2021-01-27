package app.msign.service.bean.qr;

import lombok.Data;

@Data
public class SignedDocumentResponse {
    private String documentId;
    private String signatureId;
}
