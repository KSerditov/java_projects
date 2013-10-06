package com.kserditov;

//Напишите небольшую программу-конвертер, которая конвертирует валюту в рубли и обратно, в качестве валюты возьмем доллары и евро. Курс по центробанку :)
//Значит программа должна конвертировать рубли в валюту и обратно. Валюту опишите в виде ваших классов.

public class Main {

    public static void main(String[] args) {

        Euro e1 = new Euro(45.4);
        Dollar d1 = new Dollar(32.4);

        e1.setValueInRoubles(500);
        System.out.println(e1.getValueInRoubles() + " roubles = " + e1.getValue() + " euros");

        d1.setValueInRoubles(500);
        System.out.println(d1.getValueInRoubles() + " roubles = " + d1.getValue() + " dollars");

    }
}

class Euro{

    private double valueInRoubles;
    private double value;
    private double roubleToCurrencyRatio;

    Euro(double roubleToCurrencyRatio){
        this.roubleToCurrencyRatio = roubleToCurrencyRatio;
    }

    double getValueInRoubles() {
        return valueInRoubles;
    }

    void setValueInRoubles(double valueInRoubles) {
        if (valueInRoubles > 0.0){
            this.valueInRoubles = valueInRoubles;
            this.value = valueInRoubles / roubleToCurrencyRatio;
        }
    }

    double getValue() {
        return value;
    }

    void setValue(double value) {
        if (value > 0.0){
            this.value = value;
            this.valueInRoubles = value * roubleToCurrencyRatio;
        }
    }
}

class Dollar{

    private double valueInRoubles;
    private double value;
    private double roubleToCurrencyRatio;

    Dollar(double roubleToCurrencyRatio){
        this.roubleToCurrencyRatio = roubleToCurrencyRatio;
    }

    double getValueInRoubles() {
        return valueInRoubles;
    }

    void setValueInRoubles(double valueInRoubles) {
        if (valueInRoubles > 0.0){
            this.valueInRoubles = valueInRoubles;
            this.value = valueInRoubles / roubleToCurrencyRatio;
        }
    }

    double getValue() {
        return value;
    }

    void setValue(double value) {
        if (value > 0.0){
            this.value = value;
            this.valueInRoubles = value * roubleToCurrencyRatio;
        }
    }
}
