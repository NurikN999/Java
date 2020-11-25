import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int counter = 0;
        for(Point ppp : s.getPoints()){
            counter++;
        }
        return counter;
    }

    public double getAverageLength(Shape s) {
        double length = getPerimeter(s);
        double sides = (double)(getNumPoints(s));
        
        return length / sides;
    }

    public double getLargestSide(Shape s) {
        Point prevPoint = s.getLastPoint();
        double largestSide = 0;
        for(Point pnt: s.getPoints()){
            double dist = prevPoint.distance(pnt);
            if(dist > largestSide){
                largestSide = dist;
            }
            prevPoint = pnt;
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        double x = 0;
        for(Point pntX: s.getPoints()){
            if(pntX.getX() > x){
                x = pntX.getX();
            }
        }
        return x;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        double largestPerimeter = 0;
        DirectoryResource dr = new DirectoryResource();
        for(File f: dr.selectedFiles()){
            FileResource fr = new FileResource();
            Shape s = new Shape(fr);
            double perim = getPerimeter(s);
            if(perim > largestPerimeter){
                largestPerimeter = perim;
            }
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0;
        File fileWithLargestPerimeter = null;
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource();
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if(perimeter > largestPerimeter){
                largestPerimeter = perimeter;
                fileWithLargestPerimeter = f;
            }
            
        }
        
        return fileWithLargestPerimeter.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numOfPoint = getNumPoints(s);
        double averageLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        System.out.println("perimeter = " + length + 
        "\nNumber Of Points = " + numOfPoint + 
        "\nAverage length = " + averageLength + 
        "\nLargest Side = " + largestSide +
        "\nLargest X = " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        double largestPerimeter = getLargestPerimeterMultipleFiles();
        System.out.println("Largest Perimeter in selected Files = " + largestPerimeter);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String fileName = getFileWithLargestPerimeter();
        System.out.println("File with largest perimeter: " + fileName);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
