package homeworks.enums.enums_1;

public enum BaseUnits {

    METER("meter"),
    KILOGRAM("kilogram"),
    SECOND("second"),
    AMPERE("ampere"),
    KELVIN("kelvin"),
    MOLE("mole"),
    CANDELA("candela");

    private String unit;

    BaseUnits(String unit){
        this.unit = unit;
    }

}
