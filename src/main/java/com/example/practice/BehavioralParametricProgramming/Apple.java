package com.example.practice.BehavioralParametricProgramming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Apple {

  private String color;
  private Double weight;
}
