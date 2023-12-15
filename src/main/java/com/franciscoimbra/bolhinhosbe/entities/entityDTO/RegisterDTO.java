package com.franciscoimbra.bolhinhosbe.entities.entityDTO;

import jakarta.validation.constraints.NotNull;

public class RegisterDTO {
    private long id;
    @NotNull
    private String email;
    @NotNull
    private String pwd;

}
