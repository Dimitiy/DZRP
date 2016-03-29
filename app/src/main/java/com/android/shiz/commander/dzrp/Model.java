package com.android.shiz.commander.dzrp;

/**
 * Created by OldMan on 29.03.2016.
 */
public class Model {
    public String getCell1() {
        return cell1;
    }

    public void setCell1(String cell1) {
        this.cell1 = cell1;
    }

    public String getCell2() {
        return cell2;
    }

    public void setCell2(String cell2) {
        this.cell2 = cell2;
    }

    public String getCell3() {
        return cell3;
    }

    public void setCell3(String cell3) {
        this.cell3 = cell3;
    }

    public String getCell4() {
        return cell4;
    }

    public void setCell4(String cell4) {
        this.cell4 = cell4;
    }

    private String cell1, cell2, cell3, cell4;
    public Model() {
    }

    public Model(String cell1, String cell2, String cell3, String cell4) {
        this.cell1 = cell1;
        this.cell2 = cell2;
        this.cell3 = cell3;
        this.cell4 = cell4;
    }
}
