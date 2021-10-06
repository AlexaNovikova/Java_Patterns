//package ru.geekbrains.memento;
//
//
//import java.util.Base64;
//
//public class User implements Memento {
//    String name;
//    int age;
//    byte[] avatar;
//
//    public String CreateMemento() {
//        StringBuffer memento = new StringBuffer();
//
//        String image = Base64.getEncoder().encodeToString(avatar);
//        memento.append(image);
//        memento.append("###");
//        memento.append(age);
//        memento.append("###");
//        memento.append(name);
//        return Base64.getEncoder()memento.toString();
//    }
//
//    public void setMemento(String memento) {
//       String strMemento = Base64.getDecoder().decode(memento);
//       String[]
//    }
//}
