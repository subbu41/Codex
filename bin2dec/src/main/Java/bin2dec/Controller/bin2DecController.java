/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package bin2dec.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * bin2DecController
 */
@RestController
public class bin2DecController {

    private final Bin2DecConverter bin2DecConverter;

    @Autowired
    public bin2DecController(Bin2DecConverter bin2DecConverter) {
        this.bin2DecConverter = bin2DecConverter;
    }


    @RequestMapping("/service")
    private int convertBinToDec(@RequestParam String testBin){
        return bin2DecConverter.translateBinary(testBin);

    }
}
