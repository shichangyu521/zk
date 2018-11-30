package com.ziigeer.project.controller.map;


import com.ziigeer.project.domain.DetailTime;
import com.ziigeer.project.domain.Dto.DetailTimeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetailsMap {

    /** ComboMapper实例 */
    DetailsMap DETAILSINSTANCE = Mappers.getMapper(DetailsMap.class);

    DetailTimeDto detailTimeToDetailTimeDto(DetailTime detailTime);

    List<DetailTimeDto> detailTimesToDetailTimeDtos(List<DetailTime> detailTimeList);


}
