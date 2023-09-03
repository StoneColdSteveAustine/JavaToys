public class Main {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();
        
        shop.addToy(1, "Медведь", 15, 20);
        shop.addToy(2, "Заяц", 10, 15);
        shop.addToy(3, "Жираф", 20, 35);
        shop.addToy(4, "Черепаха", 25,20);
        shop.addToy(5, "Обезьяна", 30,10);
            
        shop.setToyWeight(2, 30);
        
        shop.playTheGame();
        
        try {
            shop.getPrizeToy();
        }
