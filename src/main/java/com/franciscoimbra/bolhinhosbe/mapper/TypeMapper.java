package com.franciscoimbra.bolhinhosbe.mapper;

import com.franciscoimbra.bolhinhosbe.entities.Type;
import com.franciscoimbra.bolhinhosbe.entities.entityDTO.TypeDTO;
import org.mapstruct.factory.Mappers;

public interface TypeMapper {

    TypeMapper INSTANCE= Mappers.getMapper(TypeMapper.class);

    TypeDTO typeToTypeDTP(Type type);
    Type typeDTOToType(TypeDTO typeDTO);
}
