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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageServiceImpl implements MessageService {

  private int currentId;
  private Map<Integer, String> messages = new HashMap<Integer, String>();

  @Override
  public String toString() {
    return Arrays.toString(messages.entrySet().toArray());
  }

  @Override
  public String get(int id) {
    return messages.get(id);
  }

  @Override
  public void update(int id, String message) {
    messages.put(id, message);
  }

  @Override
  public String add(String message) {
    int id = currentId++;
    messages.put(id, message);
    return Integer.toString(id);
  }

  @Override
  public void delete(int id) {
    messages.remove(id);
  }

  @Override
  public List<Map.Entry<Integer, String>> getAll() {
    return new ArrayList<Map.Entry<Integer, String>>(messages.entrySet());
  }
    
}
