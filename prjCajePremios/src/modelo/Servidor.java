/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author TOSHIBA
 */
public class Servidor {
    private ObjectOutputStream objetoSalida;
    private ObjectInputStream objejotoEntrada;
    private ServerSocket servidor;
    private Socket conexion;
}
