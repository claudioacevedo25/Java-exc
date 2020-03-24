/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.producto;
import java.util.List;

/**
 *
 * @author claud
 */
public interface CRUD {
    public List listar();
    public producto list(int id);
    public boolean add(producto p);
    public boolean edit(producto p);
    public boolean eliminar(int id);
}
