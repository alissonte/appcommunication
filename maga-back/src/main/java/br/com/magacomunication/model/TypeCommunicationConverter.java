package br.com.magacomunication.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TypeCommunicationConverter implements AttributeConverter<TypeCommunicationEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(final TypeCommunicationEnum attribute) {
        if(attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public TypeCommunicationEnum convertToEntityAttribute(final Integer status) {
        return TypeCommunicationEnum.valueOf(status);
    }
}
