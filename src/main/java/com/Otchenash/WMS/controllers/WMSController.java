package com.Otchenash.WMS.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wms")
public class WMSController {
    @GetMapping
    public String hallo(){
        return "Hallo from WMSCotnroller";
    }
}
