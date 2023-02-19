package io.cruii.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cruii
 * Created on 2023/2/16
 */
@NoArgsConstructor
@Data
public class CoinExp {
    private Integer code;
    private String message;
    private Integer ttl;
    private Integer data;
}
