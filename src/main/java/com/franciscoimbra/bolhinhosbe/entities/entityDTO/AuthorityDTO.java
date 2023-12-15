package com.franciscoimbra.bolhinhosbe.entities.entityDTO;

import com.franciscoimbra.bolhinhosbe.entities.Register;
import lombok.Data;

@Data
public class AuthorityDTO {
    private Long id;
    private String name;
    private RegisterDTO register;

}
