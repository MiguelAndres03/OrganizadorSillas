
package organizadorsillas;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

public class OrganizadorSillas {

    public static void main(String[] args) {
       
        int k = Integer.parseInt(JOptionPane.showInputDialog("Numero de mesas"));
        
        if(k<1 || k>1000){
            JOptionPane.showMessageDialog(null, "Cantidad de mesas Ingresada incorrecta");
        }
        else {
         int f = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de familias"));
         
            if(f<1 || f>1000){
                JOptionPane.showMessageDialog(null, "Cantidad de familias Ingresada incorrecta");
            }
            else {
                int a[] = new int[f];
                for (int i = 0; i < f; i++) {
               int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de hijos"+ (i + 1)));
                    if(h<1 || h>1000){
                        JOptionPane.showMessageDialog(null, "Cantidad de hijos Ingresada incorrecta");
                    }
                    else{
                        a[i] = h;}
                }
                int comb = contarFormas(a, k);
                JOptionPane.showMessageDialog(null, comb+" combinaciones posibles");
            }
        }
    }

    public static int contarFormas(int[] a, int k){
         int l=0, var=1, aux=1,solu=1, g=1, e=1;
         while (l < a.length){
             var= (int) Math.pow(2, (int) Array.get(a, l));
             solu=solu*var;
             l++;
         }
                                        if(a.length>k){
                                            g=a.length;
                                            e=g-k;
                                            int m=1, f=1;
                                            while(g!=0){
                                                m=m*g;
                                                g--;
                                            }
                                            while(e!=0){
                                                f=f*e;
                                                e--;
                                            }
                                            aux=m/f;
                                            solu=(solu*2)+aux;
                                        }
                                        else{
                                            aux=a.length-1;
                                            solu =(solu+aux)*k;
                                        }
                                        return solu;
                                    }
                               }

