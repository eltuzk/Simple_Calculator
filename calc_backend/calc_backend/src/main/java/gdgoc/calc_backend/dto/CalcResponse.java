package gdgoc.calc_backend.dto;

public class CalcResponse {
    private double res;

    public CalcResponse(double res) {
        this.res = res;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
