package com.example.boottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luancy
 * @date 2022/07/05
 */
@RestController
@RequestMapping("/web")
public class Controller {
  @RequestMapping("/test")
  public String test(){
    String str="hola";
    return str;
  }

}
