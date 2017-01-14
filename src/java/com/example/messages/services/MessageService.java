/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.messages.services;

/**
 *
 * @author cgarate
 */

import java.util.List;
import java.util.Map;

public interface MessageService {
    
    void delete(int id);

    List<Map.Entry<Integer, String>> getAll();

    String get(int id);

    String add(String message);

    void update(int id, String message);
    
}
