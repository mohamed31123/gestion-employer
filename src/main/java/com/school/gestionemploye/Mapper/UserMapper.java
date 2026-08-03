package com.school.gestionemploye.Mapper;

import com.school.gestionemploye.Entity.User;
import com.school.gestionemploye.dto.request.UserRequest;
import com.school.gestionemploye.dto.response.UserResponse;
import jakarta.persistence.Column;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    @Mapping(target = "id" , ignore = true)
    public User toEntity(UserRequest userRequest);
    @Mapping(target = "id" , ignore = true)
    public UserResponse toResponse(User user);
    public void update(UserRequest userRequest, @MappingTarget User user);
}
