package app.msign.service.bean.qr;

import lombok.Data;

@Data
public class SignedDocumentRequest {
    private String documentId;
    private String signature;
}
