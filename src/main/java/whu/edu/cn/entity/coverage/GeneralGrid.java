package whu.edu.cn.entity.coverage;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralGrid {
    private String type;
    private String id;
    private String srsName;
    /**
     * for example ["Lon", "Lat"]
     */
    private List<String> axisLabels;

    private List<AxisInfo> axis;

    private GridLimits gridLimits;

    public GridLimits getGridLimits() {
        return gridLimits;
    }

    public void setGridLimits(GridLimits gridLimits) {
        this.gridLimits = gridLimits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    public List<String> getAxisLabels() {
        return axisLabels;
    }

    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    public List<AxisInfo> getAxis() {
        return axis;
    }

    public void setAxis(List<AxisInfo> axis) {
        this.axis = axis;
    }
}
