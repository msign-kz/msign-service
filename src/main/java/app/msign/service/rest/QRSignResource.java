package app.msign.service.rest;

import app.msign.service.bean.qr.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QRSignResource {

    @Operation(summary = "Шаг 1. Информация о пакете")
    @GetMapping("/{id}")
    public ResponseEntity<PacketInfoResponse> packetInfo(@PathVariable String id) {
        return null;
    }

    @Operation(summary = "Шаг 2. Данные пакета")
    @PostMapping("/{id}")
    public ResponseEntity<PacketResponse> packet(@PathVariable String id, @RequestBody PacketRequest request) {
        return null;
    }

    @Operation(summary = "Шаг 3. Скачивание документоов")
    @GetMapping("/{id}/files/{documentId}")
    public void packet(@PathVariable String id, @RequestHeader("Authorization") String authorization, @PathVariable String documentId) {
    }

    @Operation(summary = "Шаг 4. Отправка подписанных данных")
    @PostMapping("/{id}/signed")
    public ResponseEntity<SignedDocumentsResponse> signed(@PathVariable String id, @RequestBody SignedDocumentsRequest request) {
        return null;
    }
}
