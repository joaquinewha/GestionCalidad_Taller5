package com.example;
public class Ascensor {

    private final int PisoMAX = 3;
    private final int PisoMIN = 1;

    int origen=(int) (Math.random() * (PisoMAX-PisoMIN));
    int destino=(int) (Math.random() * (PisoMAX-PisoMIN));    
    int posicionActual = 1;
    
    public void NuevaPersona(int origen, int destino) throws Exception{
        VerificarPisoOrigenDestino(origen, destino);
        VerificarIgualdad(origen, destino);
        LlamadaAscensor(origen,posicionActual);
        UsoAscensor(destino,posicionActual);
    } 

    public boolean LlamadaAscensor(int origen, int posicionActual){
        if(origen == posicionActual){
            System.out.println("Ascensor se abre");
            return true;
        }else{
            System.out.println("Ascensor va a la poscicion origen de la persona");
            posicionActual = origen;
            return false;
        }
    }

    public int UsoAscensor(int destino, int posicionActual){
        posicionActual = destino;
        return posicionActual;
    }

    public void VerificarPisoOrigenDestino(int origen, int destino)throws Exception{
        if(origen<PisoMIN || origen>PisoMAX || destino<PisoMIN || destino>PisoMAX){
            throw new Exception("El maximo de pisos es "+PisoMAX+" y el minimo de pisos es "+PisoMIN);
        }
    }
    public void VerificarIgualdad(int origen, int destino)throws Exception{
        if(origen==destino){
            throw new Exception("El origen y destino no pueden ser el mismo");
        }

    }

   
}
