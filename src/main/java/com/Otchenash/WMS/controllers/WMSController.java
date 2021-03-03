package com.Otchenash.WMS.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WMSController {
    @GetMapping ("wms")
    public String greeting(){
        return "Hallo from WMSCotnroller";
    }
}
