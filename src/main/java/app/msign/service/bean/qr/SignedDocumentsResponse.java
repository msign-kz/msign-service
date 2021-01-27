package app.msign.service.bean.qr;

import lombok.Data;

import java.util.List;

@Data
public class SignedDocumentsResponse {
    private String status;
    private List<SignedResponse> signedDocuments;
}
