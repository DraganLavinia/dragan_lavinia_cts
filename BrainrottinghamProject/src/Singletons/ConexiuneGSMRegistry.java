package Singletons;

import java.util.HashMap;

public class ConexiuneGSMRegistry implements IGSMInterface{

    private static HashMap<String, ConexiuneGSMRegistry> instances = new HashMap<>();

    private ConexiuneGSMRegistry(String tipConexiune) {
        System.out.println("s-a creat instanta la singleton registry de tipul " + tipConexiune);
    }

    public static ConexiuneGSMRegistry getinstance(String tipConexiune){
        ConexiuneGSMRegistry instance = instances.get(tipConexiune);
        if(instance == null){
            instance = new ConexiuneGSMRegistry(tipConexiune);
            instances.put(tipConexiune,instance);
        }
        return instance;
    }

}
