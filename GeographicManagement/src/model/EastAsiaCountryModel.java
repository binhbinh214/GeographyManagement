package model;

public class EastAsiaCountryModel {
    private String countryCode;
    private String countryName;
    private float totalArea;
    private String countryTerrain;

    public EastAsiaCountryModel(String countryCode, String countryName, float totalArea, String countryTerrain) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
        this.countryTerrain = countryTerrain;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
}