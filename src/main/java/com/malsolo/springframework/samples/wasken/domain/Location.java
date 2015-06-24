package com.malsolo.springframework.samples.wasken.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private String key, name, locationType, iata;
}
