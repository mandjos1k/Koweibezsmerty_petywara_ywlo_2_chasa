package koschei;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;
    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }




}









