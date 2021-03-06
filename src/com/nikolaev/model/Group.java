package com.nikolaev.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

   private List<Point> renjuPointList = new ArrayList<>();
   private Color color;

   public void addPoint(Point point) {
      renjuPointList.add(point);
   }

   public void addListPoints(List<Point> points) {
      renjuPointList.addAll(points);
   }

   public List<Point> getRenjuPointSet() {
      return renjuPointList;
   }

   public void setRenjuPointSet(List<Point> renjuPointSet) {
      this.renjuPointList = renjuPointSet;
   }

   public List<Point> getRenjuPointList() {
      return renjuPointList;
   }

   public void setRenjuPointList(List<Point> renjuPointList) {
      this.renjuPointList = renjuPointList;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "Group{" + "renjuPointList=" + renjuPointList + '}';
   }

   public Point getPointByXY(Point point) {
      for (Point point1 : renjuPointList) {
         if (point1.equals(point)) {
            return point1;
         }
      }
      return null;
   }
}
