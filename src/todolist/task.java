/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import javafx.animation.Animation.Status;

/**
 *
 * @author taha
 */
public class task {
    
  public  int id;
  public  String title;  
  public  String date;  
  public  String status;   
  public  String descrpition;    
    
    public task(int id, String title, String date, String status, String descpriton){
        this.id=id;
        this.date=date;
        this.title=title;
        this.status=status;
        this.descrpition=descrpition;
    
    }
    
    public ArrayList tasksList(){ 
    ArrayList<task> list = new ArrayList<>();
    task T = new task(textFieldId.getText(), textFieldTitle.getText(), ft.format(dNow), Status.getSelectedItem(), textFieldDescription.getText());
      return list;
    }
}
