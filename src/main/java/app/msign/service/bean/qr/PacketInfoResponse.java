package app.msign.service.bean.qr;

import lombok.Data;

@Data
public class PacketInfoResponse {
    private Boolean authRequired;
    private String version;
}
