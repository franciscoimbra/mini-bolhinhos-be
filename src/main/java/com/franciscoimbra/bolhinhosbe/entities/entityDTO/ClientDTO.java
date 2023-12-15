package com.franciscoimbra.bolhinhosbe.entities.entityDTO;

import lombok.Data;

import java.util.List;

@Data
public class ClientDTO {
    private long id;
    private String name;
    private String phone;
    private String nif;
    private List<OrderDTO> orders;

}
