/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author lorit
 */
public class Operadores_Matematicos {
    public static void main(String[] args) {
        int o1=0;
        do{
            o1=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPERACION: \n1.-SUMA\n2.-RESTA\n3.-MULTIPLICAR\n4.-DIVIDIR\n5.SALIR"));
        
            switch(o1) {
            case 1 ->{
                o1=1;
                int o2=Integer.parseInt(JOptionPane.showInputDialog("QUE TABLA DESEA SABER: \n.1-\n.2-\n.3-\n.4-\n.5-\n.6-\n.7-\n.8-\n.9-\n.10-\n.11-\n.12-"));
                if (o2!=13){
                    JOptionPane.showMessageDialog(null,"Aqui esta la Tabla: ");
                    switch (o2){
                        case 1->{
                            JOptionPane.showMessageDialog(null,"-.1+1=2\n-.1+2=3\n-.1+3=4\n-.1+4=5\n-.1+5=6\n-.1+6=7\n-.1+7=8\n-.1+8=9\n-.1+9=10\n-.1+10=11\n-.1+11=12\n-.1+12=13");
                            break;
                        }
                        case 2->{
                            JOptionPane.showMessageDialog(null,"-.2+1=3\n-.2+2=4\n-.2+3=5\n-.2+4=6\n-.2+5=7\n-.2+6=8\n-.2+7=9\n-.2+8=10\n-.2+9=11\n-.2+10=12\n-.2+11=13\n-.2+12=14");
                            break;
                        }
                        case 3->{
                            JOptionPane.showMessageDialog(null,"-.3+1=4\n-.3+2=5\n-.3+3=6\n-.3+4=7\n-.3+5=8\n-.3+6=9\n-.3+7=10\n-.3+8=11\n-.3+9=12\n-.3+10=13\n-.3+11=14\n-.3+12=15");
                            break;
                        }
                        case 4->{
                            JOptionPane.showMessageDialog(null,"-.4+1=5\n-.4+2=6\n-.4+3=7\n-.4+4=8\n-.4+5=9\n-.4+6=10\n-.4+7=11\n-.4+8=12\n-.4+9=13\n-.4+10=14\n-.4+11=15\n-.4+12=16");
                            break;
                        }
                        case 5->{
                            JOptionPane.showMessageDialog(null,"-.5+1=6\n-.5+2=6\n-.5+3=8\n-.5+4=9\n-.5+5=10\n-.5+6=11\n-.5+7=12\n-.5+8=13\n.5+9=14\n-.5+10=15\n-.5+11=16\n-.5+12=17");
                            break;
                        }
                        case 6->{
                            JOptionPane.showMessageDialog(null,"-.6+1=7\n-.6+2=8\n-.6+3=9\n-.6+4=10\n-.6+5=11\n-.6+6=12\n-.6+7=13\n-.6+8=14\n-.6+9=15\n-.6+10=16\n-.6+11=17\n-.6+12=18");
                            break;
                        }
                        case 7->{
                            JOptionPane.showMessageDialog(null,"-.7+1=8\n-.7+2=9\n-.7+3=10\n-.7+4=11\n-.7+5=12\n-.7+6=13\n-.7+7=14\n-.7+8=15\n-.7+9=16\n-.7+10=17\n-.7+11=18\n-.7+12=19");
                            break;
                        }
                        case 8->{
                            JOptionPane.showMessageDialog(null,"-.8+1=9\n-.8+2=10\n-.8+3=11\n-.8+4=12\n-.8+5=13\n-.8+6=14\n-.8+7=15\n-.8+8=16\n-.8+9=17\n-.8+10=18\n-.8+11=19\n-.8+12=20");
                            break;
                        }
                        case 9->{
                            JOptionPane.showMessageDialog(null,"-.9+1=10\n-.9+2=11\n-.9+3=12\n-.9+4=13\n-.9+5=14\n-.9+6=15\n-.9+7=16\n-.9+8=17\n-.9+9=18\n-.9+10=19\n-.9+11=20\n-.9+12=21");
                            break;
                        }
                        case 10->{
                            JOptionPane.showMessageDialog(null,"-.10+1=11\n-.10+2=12\n-.10+3=13\n-.10+4=14\n-.10+5=15\n-.10+6=16\n-.10+7=17\n-.10+8=18\n-.10+9=19\n-.10+10=20\n-.10+11=21\n-.10+12=22");
                            break;
                        }
                        case 11->{
                            JOptionPane.showMessageDialog(null,"-.11+1=12\n-.11+2=13\n-.11+3=14\n-.11+4=15\n-.11+5=16\n-.11+6=17\n-.11+7=18\n-.11+8=19\n-.11+9=20\n-.11+10=21\n-.11+11=22\n-.11+12=23");
                            break;
                        }
                        case 12->{
                            JOptionPane.showMessageDialog(null,"-.12+1=13\n-.12+2=14\n-.12+3=15\n-.12+4=16\n-.12+5=17\n-.12+6=18\n-.12+7=19\n-.12+8=20\n-.12+9=21\n-.12+10=22\n-.12+11=23\n-.12+12=24");
                            break;
                        }
                        
                        
                    
                }
            }
            
            
            
            
        }
            case 2 ->{
                o1=2;
                int o2=Integer.parseInt(JOptionPane.showInputDialog("QUE TABLA DESEA SABER: \n.1-\n.2-\n.3-\n.4-\n.5-\n.6-\n.7-\n.8-\n.9-\n.|0-\n.11-\n.12-"));
                if (o2!=13){
                    JOptionPane.showMessageDialog(null,"Aqui esta la Tabla: ");
                    switch (o2){
                        case 1->{
                            JOptionPane.showMessageDialog(null,"-.1-12=-11\n-.1-11=-10\n-.1-10=-9\n-.1-9=-8\n-.1-8=-7\n-.1-7=-6\n-.1-6=-5\n-.1-5=-4\n-.1-4=-3\n-.1-3=-2\n-.1-2=-1\n-.1-1=0");
                            break;
                        }
                        case 2->{
                            JOptionPane.showMessageDialog(null,"-.2-12=-10\n-.2-11=-9\n-.2-10=-8\n-.2-9=-7\n-.2-8=-6\n-.2-7=-5\n-.2-6=-4\n-.2-5=-3\n-.2-4=-2\n-.2-3=-1\n-.2-2=0\n-.2-1=1");
                            break;
                        }
                        case 3->{
                            JOptionPane.showMessageDialog(null,"-.3-12=-9\n-.3-11=-8\n-.3-10=-7\n-.3-9=-6\n-.3-8=-5\n-.3-7=-4\n-.3-6=-3\n-.3-5=-2\n-.3-4=-1\n-.3-3=0\n-.3-2=1\n-.3-1=2");
                            break;
                        }
                        case 4->{
                            JOptionPane.showMessageDialog(null,"-.4-12=-8\n-.4-11=-7\n-.4-10=-6\n-.4-9=-5\n-.4-8=-4\n-.4-7=-3\n-.4-6=-2\n-.4-5=-1\n-.4-4=0\n-.4-3=1\n-.4-2=2\n-.4-1=3");
                            break;
                        }
                        case 5->{
                            JOptionPane.showMessageDialog(null,"-.5-12=-7\n-.5-11=-6\n-.5-10=-5\n-.5-9=-4\n-.5-8=-3\n-.5-7=-2\n-.5-6=-1\n-.5-5=0\n-.5-4=1\n-.5-3=2\n-.5-2=3\n-.5-1=4");
                            break;
                        }
                        case 6->{
                            JOptionPane.showMessageDialog(null,"-.6-12=-6\n-.6-11=-5\n-.6-10=-4\n-.6-9=-3\n-.6-8=-2\n-.6-7=-1\n-.6-6=0\n-.6-5=1\n-.6-4=2\n-.6-3=3\n-.6-2=4\n-.6-1=5");
                            break;
                        }
                        case 7->{
                            JOptionPane.showMessageDialog(null,"-.7-12=-5\n-.7-11=-4\n-.7-10=-3\n-.7-9=-2\n-.7-8=-1\n-.7-7=0\n-.7-6=1\n-.7-5=2\n-.7-4=3\n-.7-3=4\n-.7-2=2\n-.7-1=6");
                            break;
                        }
                        case 8->{
                            JOptionPane.showMessageDialog(null,"-.8-12=-4\n-.8-11=-3\n-.8-10=-2\n-.8-9=-1\n-.8-8=0\n-.8-7=1\n-.8-6=2\n-.8-5=3\n-.8-4=4\n-.8-3=5\n-.8-2=6\n-.8-1=7");
                            break;
                        }
                        case 9->{
                            JOptionPane.showMessageDialog(null,"-.9-12=-3\n-.9-11=-2\n-.9-10=-1\n-.9-9=0\n-.9-8=1\n-.9-7=2\n-.9-6=3\n-.9-5=4\n-.9-4=5\n-.9-3=6\n-.9-2=7\n-.9-1=8");
                            break;
                        }
                        case 10->{
                            JOptionPane.showMessageDialog(null,"-.10-12=-2\n-.10-11=-1\n-.10-10=0\n-.10-9=1\n-.10-8=2\n-.10-7=3\n-.10-6=4\n-.10-5=5\n-.10-4=5\n-.10-3=7\n-.10-2=8\n-.10-1=9");
                            break;
                        }
                        case 11->{
                            JOptionPane.showMessageDialog(null,"-.11-12=-1\n-.11-11=0\n-.11-10=1\n-.11-9=2\n-.11-8=2\n-.11-7=4\n-.11-6=5\n-.11-5=6\n-.11-4=7\n-.11-3=8\n-.11-2=9\n-.11-1=10");
                            break;
                        }
                        case 12->{
                            JOptionPane.showMessageDialog(null,"-.12-12=0\n-.12-11=1\n-.12-10=2\n-.12-9=3\n-.12-8=4\n-.12-7=5\n-.12-6=6\n-.12-5=7\n-.12-4=8\n-.12-3=9\n-.12-2=10\n-.12-1=11");
                            break;
                        }
                        
                        
                    
                }
            }
            
                
            
            
            
            
        }
            case 3 ->{
                o1=3;
                int o2=Integer.parseInt(JOptionPane.showInputDialog("QUE TABLA DESEA SABER: \n.1-\n.2-\n.3-\n.4-\n.5-\n.6-\n.7-\n.8-\n.9-\n.|0-\n.11-\n.12-"));
                if (o2!=13){
                    JOptionPane.showMessageDialog(null,"Aqui esta la Tabla: ");
                    switch (o2){
                        case 1->{
                            JOptionPane.showMessageDialog(null,"-.1*1=1\n-.1*2=2\n-.1*3=3\n-.1*4=4\n-.1*5=5\n-.1*6=6\n-.1*7=7\n-.1*8=8\n-.1*9=9\n-.1*10=10\n-.1*11=11\n-.1*12=12");
                            break;
                        }
                        case 2->{
                            JOptionPane.showMessageDialog(null,"-.2*1=2\n-.2*2=4\n-.2*3=6\n-.2*4=8\n-.2*5=10\n-.2*6=12\n-.2*7=14\n-.2*8=16\n-.2*9=9\n-.2*10=20\n-.2*11=22\n-.2*12=24");
                            break;
                        }
                        case 3->{
                            JOptionPane.showMessageDialog(null,"-.3*1=3\n-.3*2=6\n-.3*3=9\n-.3*4=12\n-.3*5=15\n-.3*6=18\n-.3*7=21\n-.3*8=24\n-.3*9=27\n-.3*10=30\n-.3*11=33\n-.3*12=36");
                            break;
                        }
                        case 4->{
                            JOptionPane.showMessageDialog(null,"-.4*1=4\n-.4*2=8\n-.4*3=12\n-.4*4=16\n-.4*5=20\n-.4*6=24\n-.4*7=28\n-.4*8=32\n-.4*9=36\n-.4*10=40\n-.4*11=44\n-.4*12=48");
                            break;
                        }
                        case 5->{
                            JOptionPane.showMessageDialog(null,"-.5*1=5\n-.5*2=10\n-.5*3=15\n-.5*4=20\n-.5*5=25\n-.5*6=30\n-.5*7=35\n-.5*8=40\n-.5*9=45\n-.5*10=50\n-.5*11=55\n-.5*12=60");
                            break;
                        }
                        case 6->{
                            JOptionPane.showMessageDialog(null,"-.6*1=6\n-.6*2=12\n-.6*3=18\n-.6*4=24\n-.6*5=30\n-.6*6=36\n-.6*7=42\n-.6*8=48\n-.6*9=54\n-.6*10=60\n-.6*11=66\n-.6*12=72");
                            break;
                        }
                        case 7->{
                            JOptionPane.showMessageDialog(null,"-.7*1=7\n-.7*2=14\n-.7*3=21\n-.7*4=28\n-.7*5=35\n-.7*6=42\n-.7*7=49\n-.7*8=56\n-.7*9=63\n-.7*10=70\n-.7*11=77\n-.7*12=84");
                            break;
                        }
                        case 8->{
                            JOptionPane.showMessageDialog(null,"-.8*1=8\n-.8*2=16\n-.8*3=24\n-.8*4=32\n-.8*5=40\n-.8*6=48\n-.8*7=56\n-.8*8=64\n-.8*9=72\n-.8*10=80\n-.8*11=88\n-.8*12=96");
                            break;
                        }
                        case 9->{
                            JOptionPane.showMessageDialog(null,"-.9*1=9\n-.9*2=18\n-.9*3=27\n-.9*4=36\n-.9*5=45\n-.9*6=54\n-.9*7=63\n-.9*8=72\n-.9*9=81\n-.9*10=90\n-.9*11=99\n-.9*12=108");
                            break;
                        }
                        case 10->{
                            JOptionPane.showMessageDialog(null,"-.10*1=10\n-.10*2=20\n-.10*3=30\n-.10*4=40\n-.10*5=50\n-.10*6=60\n-.10*7=70\n-.10*8=80\n-.10*9=90\n-.10*10=100\n-.10*11=110\n-.10*12=120");
                            break;
                        }
                        case 11->{
                            JOptionPane.showMessageDialog(null,"-.11*1=11\n-.11*2=22\n-.11*3=33\n-.11*4=44\n-.11*5=55\n-.11*6=66\n-.11*7=77\n-.11*8=88\n-.11*9=99\n-.11*10=110\n-.11*11=121\n-.11*12=132");
                            break;
                        }
                        case 12->{
                            JOptionPane.showMessageDialog(null,"-.12*1=12\n-.12*2=24\n-.12*3=36\n-.12*4=48\n-.12*5=60\n-.12*6=72\n-.12*7=84\n-.12*8=96\n-.12*9=108\n-.12*10=120\n-.12*11=132\n-.12*12=144");
                            break;
                        }
                        
                        
                    
                }
            }
            
                
            
            
            
            
        }
            case 4 ->{
                o1=4;
                int o2=Integer.parseInt(JOptionPane.showInputDialog("QUE TABLA DESEA SABER: \n.1-\n.2-\n.3-\n.4-\n.5-\n.6-\n.7-\n.8-\n.9-\n.|0-\n.11-\n.12-"));
                if (o2!=13){
                    JOptionPane.showMessageDialog(null,"Aqui esta la Tabla: ");
                    switch (o2){
                        case 1->{
                            JOptionPane.showMessageDialog(null,"-.1/1=1\n-.1/2=2\n-.1/3=3\n-.1/4=4\n-.1/5=5\n-.1/6=6\n-.1/7=7\n-.1/8=8\n-.1/9=9\n-.1/10=10\n-.1/11=11\n-.1/12=12");
                            break;
                        }
                        case 2->{
                            JOptionPane.showMessageDialog(null,"-.2/2=1\n-.2/4=2\n-.2/6=3\n-.2/8=4\n-.2/10=5\n-.2/12=6\n-.2/14=7\n-.2*16=8\n-.2/18=9\n-.2*20=10\n-.2*22=1\n-.2*24=12");
                            break;
                        }
                        case 3->{
                            JOptionPane.showMessageDialog(null,"-.3/3=1\n-.3/6=2\n-.3/9=3\n-.3/12=4\n-.3/15=5\n-.3/18=6\n-.3/21=7\n-.3/24=8\n-.3/27=9\n-.3/30=10\n-.3/33=11\n-.3/36=12");
                            break;
                        }
                        case 4->{
                            JOptionPane.showMessageDialog(null,"-.4/4=1\n-.4/8=2\n-.4/=12\n-.4/16=4\n-.4/20=5\n-.4/24=6\n-.4/28=7\n-.4/32=8\n-.4/36=9\n-.4/40=10\n-.4/44=10\n-.4/48=12");
                            break;
                        }
                        case 5->{
                            JOptionPane.showMessageDialog(null,"-.5/5=1\n-.5/10=2\n-.5/15=3\n-.5/20=4\n-.5/25=5\n-.5/30=6\n-.5/35=7\n-.5/40=8\n-.5/45=9\n-.5/50=10\n-.5/55=11\n-.5/60=12");
                            break;
                        }
                        case 6->{
                            JOptionPane.showMessageDialog(null,"-.6/6=1\n-.6/12=2\n-.6/18=3\n-.6/24=4\n-.6/30=5\n-.6/36=6\n-.6/42=7\n-.6/48=8\n-.6/54=9\n-.6/60=10\n-.6/66=11\n-.6*/72=12");
                            break;
                        }
                        case 7->{
                            JOptionPane.showMessageDialog(null,"-.7/7=1\n-.7/14=2\n-.7/21=3\n-.7/28=4\n-.7/35=5\n-.7/42=6\n-.7/49=7\n-.7/56=8\n-.7/63=8\n-.7/70=70\n-.7/77=11\n-.7/84=12");
                            break;
                        }
                        case 8->{
                            JOptionPane.showMessageDialog(null,"-.8/8=1\n-.8/16=2\n-.8/24=3\n-.8/32=4\n-.8/40=5\n-.8/48=6\n-.8/56=6\n-.8/64=8\n-.8/72=9\n-.8/80=10\n-.8/88=11\n-.8/96=12");
                            break;
                        }
                        case 9->{
                            JOptionPane.showMessageDialog(null,"-.9*1=9\n-.9*2=18\n-.9*3=27\n-.9*4=36\n-.9*5=45\n-.9*6=54\n-.9*7=63\n-.9*8=72\n-.9*9=81\n-.9*10=90\n-.9*11=99\n-.9*12=108");
                            break;
                        }
                        case 10->{
                            JOptionPane.showMessageDialog(null,"-.10*1=10\n-.10*2=20\n-.10*3=30\n-.10*4=40\n-.10*5=50\n-.10*6=60\n-.10*7=70\n-.10*8=80\n-.10*9=90\n-.10*10=100\n-.10*11=110\n-.10*12=120");
                            break;
                        }
                        case 11->{
                            JOptionPane.showMessageDialog(null,"-.11/11=1\n-.11/22=2\n-.11/33=3\n-.11/44=4\n-.11/55=5\n-.11/66=6\n-.11/77=7\n-.11/88=8\n-.11/99=9\n-.11/110=10\n-.11*121=11\n-.11/132=12");
                            break;
                        }
                        case 12->{
                            JOptionPane.showMessageDialog(null,"-.12/12=1\n-.12/24=2\n-.12/36=3\n-.12/48=4\n-.12/60=5\n-.12/72=6\n-.12/84=7\n-.12/96=8\n-.12/108=9\n-.12/120=10\n-.12/132=11\n-.12/144=12");
                            break;
                        }
                        
                        
                    
                }
            }
            
                
            
            
            
            
        }
            
            
        }
    }while(o1 !=5);
        JOptionPane.showMessageDialog(null,"Ah elegido salir de la calculadora, Hasta la proxima :). ");
        
        
    }
}
    

