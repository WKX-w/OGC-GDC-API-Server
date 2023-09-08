package whu.edu.cn.entity.coverage;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainSet {
    private String type;
    private GeneralGrid generalGrid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GeneralGrid getGeneralGrid() {
        return generalGrid;
    }

    public void setGeneralGrid(GeneralGrid generalGrid) {
        this.generalGrid = generalGrid;
    }
}
