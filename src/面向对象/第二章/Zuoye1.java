package 面向对象.第二章;

public class Zuoye1 {
    public String[] name = new String[30];
    public void addName(String a){
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null){
                name[i] = a;
                break;
            }
        }
    }
    public void showName(){
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null){
                System.out.print(name[i]+"\t");
            }
        }
    }
    public boolean editName(String oldName,String newName){
        boolean c = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                if (name[i].equals(oldName)) {
                    name[i] = newName;
                    c = true;
                    break;
                }
            }
        }
        return c;
    }

}
