package app.msign.service.bean.qr;

import app.msign.service.bean.qr.DocumentResponse;
import lombok.Data;

import java.util.List;

@Data
public class PacketResponse {
    private String token;
    private String name;
    private String description;
    private Boolean dynamic;
    private String keyType;
    private List<DocumentResponse> documents;
}
