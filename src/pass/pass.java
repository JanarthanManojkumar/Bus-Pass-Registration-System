/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pass;

/**
 *
 * @author Jana
 */
public class pass {
    public static void main(String[] args)
    {
        loadingPage obj1= new loadingPage();
        obj1.setVisible(true);
        try {
            
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(20);
                obj1.jLabel4.setText(Integer.toString(i)+"%");
                if(i==100)
                {
                    obj1.dispose();
                    new startuppage().show();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    
}
