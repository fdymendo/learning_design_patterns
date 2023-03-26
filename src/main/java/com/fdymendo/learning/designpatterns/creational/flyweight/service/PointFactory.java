package com.fdymendo.learning.designpatterns.creational.flyweight.service;

import java.util.HashMap;
import com.fdymendo.learning.designpatterns.creational.flyweight.model.Point;

public class PointFactory {
  private static final HashMap<String, Point> points = new HashMap<>();

  public static Point getPoint(int x, int y) {
    String key = x + "," + y;
    if (!points.containsKey(key)) {
      points.put(key, new Point(x, y));
    }
    return points.get(key);
  }
}
