//package RandomLeet;
//
//import java.awt.*;
//import java.util.HashSet;
//import java.util.Set;
//
//public class ReachingPoints {
//    int tx,ty;
//
//    public boolean reachingPoints1(int sx, int sy, int tx, int ty){
//        if(sx>tx||sy>ty) return false;
//        if(sx == tx && sy == ty) return true;
//        return reachingPoints1(sx+sy, sy, tx,ty)&&reachingPoints1(sx, sy+sx, tx,ty);
//    }
//
//    public boolean reachingPoints2(int sx, int sy, int tx, int ty){
//        if(sx>tx||sy>ty) return false;
//        if(sx == tx && sy == ty) return true;
//
//        Set<Point> seen;
//        seen = new HashSet();
//        this.tx = tx;
//        this.ty = ty;
//        search(new Point(sx, sy));
//        return seen.contains(new Point(tx,ty));
//
//        public void search(Point P){
//            if(seen.contains(P)) return;
//            if(P.x > tx || P.y>ty) return;
//            seen.add(P);
//            search(new Point(P.x + P.y, P.y));
//            search(new Point(P.x , P.x+ P.y));
//        }
//    }
//}
