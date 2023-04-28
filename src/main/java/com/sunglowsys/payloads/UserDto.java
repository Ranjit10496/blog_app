package com.sunglowsys.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 4, message = "Username must be 4 characters!!")
    private String name;

    @Email(message = "Email is not valid !!")
    private String email;
    @NotEmpty
    @Size(min = 3, max = 10, message = "Password must be min 4 character and max 10 characters!!")
    private String password;
    @NotEmpty
    private String about;
}
