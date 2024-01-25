public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("eats");
        Wall wall3 = new Wall("west");
        Wall wall4 = new Wall("south");
        Ceiling ceiling = new Ceiling(3,PaintColor.GREEN);
        Bed bed = new Bed(2,50,1,1);
        Lamp lamp = new Lamp(true,5,LampType.floorLamp);
        Wardrobe wardrobe = new Wardrobe(1,2,30);
        Carpet carpet = new Carpet(2,2,PaintColor.BROWN);

        Bedroom bedroom = new Bedroom("bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);
        
        System.out.println(bedroom);
    }
}