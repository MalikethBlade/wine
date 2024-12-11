//package org.App;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//public class WineCatalog {
//    private ObservableList<Wine> wines;

//    public WineCatalog() {
//        wines = FXCollections.observableArrayList();
//        loadWines(); // טוען את היינות
//    }
//
//    // טוען את כל היינות (לפי הצורך, תוכל לשדרג את הפונקציה)
//    private void loadWines() {
////        wines.add(new Wine("Cabernet Sauvignon", "Red", 20.5));
////        wines.add(new Wine("Chardonnay", "White", 18.0));
////        wines.add(new Wine("Merlot", "Red", 22.0));
////        wines.add(new Wine("Sauvignon Blanc", "White", 15.5));
//    }
//
//    // מחזיר את כל היינות
////    public ObservableList<Wine> getWines() {
////        return wines;
//    }
//
//    // סינון לפי שם היין
////    public ObservableList<Wine> searchWines(String searchQuery) {
////        ObservableList<Wine> result = FXCollections.observableArrayList();
////        for (Wine wine : wines) {
////            if (wine.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
////                result.add(wine);
////            }
////        }
////        return result;
////    }
//
////    // סינון לפי צבע היין
////    public ObservableList<Wine> filterWinesByColor(String color) {
////        ObservableList<Wine> result = FXCollections.observableArrayList();
////        for (Wine wine : wines) {
////            if (color.equals("All") || wine.getColor().equals(color)) {
////                result.add(wine);
////            }
////        }
////        return result;
//    }
//}
