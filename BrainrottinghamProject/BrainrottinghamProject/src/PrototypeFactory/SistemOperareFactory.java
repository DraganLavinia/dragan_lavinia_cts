package PrototypeFactory;

import Prototype.SistemOperare;

import java.util.HashMap;

public class SistemOperareFactory {

    private static final HashMap<String, SistemOperare> prototypes = new HashMap<>();

    static {
        prototypes.put("versiuneDeBaza",new SistemOperare("versiuneDeBaza","v1"));
        prototypes.put("versiuneDeBaza2",new SistemOperare("versiuneDeBaza2","v2"));
        prototypes.put("versiuneDeBazaNuAmAvutInspiratie",new SistemOperare("versiuneDeBazaNuAmAvutInspiratie","v3"));
    }

    public static SistemOperare getSistemOperare(TipSistemOperare tip){
        switch (tip){
            case versiuneDeBaza:
                return prototypes.get("versiuneDeBaza").clone();
            case versiuneDeBaza2:
                return prototypes.get("versiuneDeBaza2").clone();
            case versiuneDeBazaNuAmAvutInspiratie:
                return prototypes.get("versiuneDeBazaNuAmAvutInspiratie").clone();
            default: throw new UnsupportedOperationException();
        }
    }
}
