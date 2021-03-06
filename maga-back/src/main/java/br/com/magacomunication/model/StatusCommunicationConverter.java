package br.com.magacomunication.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusCommunicationConverter implements AttributeConverter<StatusCommunicationEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(final StatusCommunicationEnum attribute) {
        if(attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public StatusCommunicationEnum convertToEntityAttribute(final Integer status) {
        return StatusCommunicationEnum.valueOf(status);
    }
}
