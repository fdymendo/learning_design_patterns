package com.fdymendo.learning.designpatterns.structural.flyweight.service;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.fdymendo.learning.designpatterns.structural.flyweight.model.Point;

@Service
public class PointFactory {

  private HashMap<String, Point> points = new HashMap<>();

  public Point getPoint(int x, int y) {
    String key = x + "," + y;
    return points.computeIfAbsent(key, k -> new Point(x, y));
  }

}
