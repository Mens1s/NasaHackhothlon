package org.example.hexavision.Dto;

import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LandAddRequest {
    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Integer x1;

    @NotNull
    private Integer y1;

    @NotNull
    private Integer x2;

    @NotNull
    private Integer y2;

    @NotNull
    private Integer x3;

    @NotNull
    private Integer y3;

    @NotNull
    private Integer x4;

    @NotNull
    private Integer y4;

    @NotNull
    private Integer userId;

}
