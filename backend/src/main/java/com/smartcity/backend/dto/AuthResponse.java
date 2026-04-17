package com.smartcity.backend.dto;

import com.smartcity.backend.model.Role;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;

    private Long userId;
    private String fullName;
    private String email;
    private Role role;
}
