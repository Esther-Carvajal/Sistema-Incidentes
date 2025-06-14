package com.universidad.validation;

import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {
    private int status;
    private String mensaje;
    private Object detalles;
    private LocalDateTime timestamp;
}