package app.msign.service.bean.qr;

import lombok.Data;

import java.util.List;

@Data
public class SignedDocumentsRequest {
    private List<SignedDocumentRequest> signedDocuments;
}
