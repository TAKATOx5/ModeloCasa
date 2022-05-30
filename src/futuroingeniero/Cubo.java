
package futuroingeniero;

import static org.lwjgl.opengl.GL11.*;
import org.newdawn.slick.opengl.Texture;

/**
 *
 * @author Erick without C
 */
public class Cubo {
    
    public void drawCube(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }

    public void cuboBaño(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/3);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/3);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/3);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/3);
   /*9 //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);*/
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
    public void pintarCocina2(float size){
    glBegin(GL_QUADS);

    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
    
    public void dibujarVentana(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
   /* glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/4,-size/8,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/4,-size/8,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/4,size/4,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/4,size/4,size/2);*/
   
    //glColor3f(size/2,0,0);
    /*glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/4,-size/8,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/4,-size/8,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/4,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/4,size/4,-size/2);*/
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/4,-size/8,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/4,-size/8,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/4,size/4,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/4,size/4,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/4,-size/8,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/4,-size/8,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/4,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/4,size/4,size/2);
    //Cara superior
    /*glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);*/
    glEnd();
    }
    public void dibujarVentanaCuarto1(float size){
        
    glBegin(GL_QUADS);
    glTexCoord2d(0, 0); glVertex3f(-size/2f,-size/4,size/1.9f);
    glTexCoord2d(0, 1); glVertex3f(size/2f,-size/4,size/1.9f);
    glTexCoord2d(1, 1); glVertex3f(size/2f,size/3,size/1.9f);
    glTexCoord2d(1, 0); glVertex3f(-size/2f,size/3,size/1.9f);
   
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2f,-size/4,-size/1.9f);
    glTexCoord2d(0, 1); glVertex3f(-size/2f,-size/4,-size/1.9f);
    glTexCoord2d(1, 1); glVertex3f(-size/2f,size/3,-size/1.9f);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/3,-size/1.9f);
                glEnd();
}
    
    public void dibujarVentana2(float size){
    glBegin(GL_QUADS);
    //izq creo
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,-size/5);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/4,size/5);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2.5f,size/5);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2.5f,-size/5);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/4,size/5);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,-size/5);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2.5f,-size/5);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2.5f,size/5);
    glEnd();
    }
    
   public void dibujarVentana4(float size){
    glBegin(GL_QUADS);
    //izq creo
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/1.9f,-size/4.5f,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/1.9f,-size/4.5f,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/1.9f,size/2.8f,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/1.9f,size/2.8f,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/1.9f,-size/4.5f,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/1.9f,-size/4.5f,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/1.9f,size/2.5f,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/1.9f,size/2.5f,size/2);
    glEnd();
    }
   public void VentanaBaño3(float size){
    glBegin(GL_QUADS);
    //izq creo
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/1.9f,-size/4,-size/3);
    glTexCoord2d(0, 1); glVertex3f(-size/1.9f,-size/4,size/3);
    glTexCoord2d(1, 1); glVertex3f(-size/1.9f,size/4,size/3);
    glTexCoord2d(1, 0); glVertex3f(-size/1.9f,size/4,-size/3);
    //Cara derechagggg
   glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/1.9f,-size/4,size/3);
    glTexCoord2d(0, 1); glVertex3f(size/1.9f,-size/4,-size/3);
    glTexCoord2d(1, 1); glVertex3f(size/1.9f,size/4,-size/3);
    glTexCoord2d(1, 0); glVertex3f(size/1.9f,size/4,size/3);
    glEnd();
    }
    
    public void CaraSuperior(float size){
    glBegin(GL_QUADS);
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/10,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/10,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/10,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/10,-size/2);
     glEnd();
    }
      public void caraFrontalMitad(float size){
    glBegin(GL_QUADS);
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/10,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/10,size/2);
     glEnd();
  }
   public void caraFrontal2(float size){
    glBegin(GL_QUADS);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/10,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/10,-size/2);
     glEnd();
  }
      
      
  public void caraFrontal(float size){
    glBegin(GL_QUADS);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
     glEnd();
  }
  public void CaraSuperiorMitad(float size){
      
  }
  
 public void caraLateralDerecha(float size){
    glBegin(GL_QUADS);
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    glEnd();
 }
 
 public void CaraEnfrente(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    glEnd();
 }
 public void caraDerechaBaño(float size){
    glBegin(GL_QUADS);
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2.1f,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2.1f,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2.1f,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2.1f,size/2,size/2);
    glEnd();
 }
   public void caraIzquierdaBaño(float size){
    glBegin(GL_QUADS);
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2.1f,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2.1f,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2.1f,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2.1f,size/2,-size/2);
    glEnd();
 }
 
 public void caraDerecha(float size){
    glBegin(GL_QUADS);
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    glEnd();
 }
  public void caraIzquierda(float size){
    glBegin(GL_QUADS);
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    glEnd();
 }
  
 public void medioCubo2(float size){
     glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/4,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/4,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/4,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/4,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/4,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/4,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/4,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/4,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/4,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/4,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/4,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/4,-size/2);
    glEnd();
    }
 
  public void pintarSofa(float size){
     glBegin(GL_QUADS);
    //CARA FRONTAL
     glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2.1f);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2.1f);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/4,-size/2.1f);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/4,-size/2.1f);
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/512,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara inferior SIN

    glEnd();
    }
  public void pintarSofaEnmedio(float size){
    glBegin(GL_QUADS);
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,size/2);
    //Cara PosteriorSIN
   glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/512,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/512,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara inferior SIN

    glEnd();
    }
  
    public void pintarSofa2(float size){
     glBegin(GL_QUADS);
        glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2.1f,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2.1f,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2.1f,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2.1f,size/4,size/2);

    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,size/2);
    //Cara PosteriorSIN
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/512,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/512,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/512,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/512,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/512,-size/2);
    //Cara inferior SIN

    glEnd();
    }
 
 public void medioCubo(float size){
     glBegin(GL_QUADS);
    //CARA FRONTAL
    //Cara Lateral IZQ
    glNormal3f(-1,1,1); //da iluminacion   
    glTexCoord2d(0, 0); 
    glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); 
    glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); 
    glVertex3f(-size/2,size/32,size/2);
    glTexCoord2d(1, 0); 
    glVertex3f(-size/2,size/32,-size/2);
    
    //cara lateral DER
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/4,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/32,size/2);
    /*
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/4,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/4,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/4,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/4,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/4,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/4,size/2);
*/
    glEnd();
    }
 public void arribaCubo(float size){
     glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(1,1,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/32,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/32,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,-size/2);
    glEnd();
    }
  public void Mesa(float size){
     glBegin(GL_QUADS);
    //CARA FRONTALpublic
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/15);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,size/15);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/15);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/15);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/32,-size/15);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/15);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/15);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/32,size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,-size/15);
    //Cara derechagggg
   glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/15);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/32,size/15);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/32,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/32,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,-size/2);
    //Cara inferior
   /* glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,size/15);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/32,-size/15);*/
    glEnd();
    }
  public void Silla(float size){
     glBegin(GL_QUADS);
    //CARA FRONTALpublic
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/4,-size/2,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/4,-size/2,size/15);
    glTexCoord2d(1, 1); glVertex3f(size/4,size/64,size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/4,size/64,size/15);
    //Cara Posterior
   /* //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/15);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/15);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/32,-size/15);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/15);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/15);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/32,size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,-size/15);
    //Cara derechagggg
   glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/15);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/32,size/15);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/32,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/32,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/32,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/32,-size/2);
    //Cara inferior
   /* glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/4,size/15);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/4,size/15);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/32,-size/15);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/32,-size/15);*/
    glEnd();
    }
 public void triangulo(){
glRectf (-0.8f, -0.8f, 0.5f, 0.5f);
 }


//CUARTOS
 public void Cocina1(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
 public void mitadCuarto1(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara derechagggg
    /*glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);*/
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
 public void mitadCuarto2(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
    glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara LATERAL derecha
   /* glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);*/
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
 public void mitadCuarto3(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
   /* glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);*/
    //Cara LATERAL derecha
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
    }
 public void paredBaño1(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    glEnd();
    }
 public void paredBaño2(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);

    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara inferior
    glNormal3f(0,-1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,-size/2,-size/2);
    glEnd();
     }
 public void paredCuarto2(float size){
    glBegin(GL_QUADS);
    //CARA FRONTAL
    glNormal3f(0,0,1);
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,size/2);
    //Cara Posterior
    //glColor3f(size/2,0,0);
    glNormal3f(0,0,-1);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,-size/2);
    //Cara Lateral IZQ
   /* glNormal3f(-1,0,0);    
    glTexCoord2d(0, 0); glVertex3f(-size/2,-size/2,-size/2);
    glTexCoord2d(0, 1); glVertex3f(-size/2,-size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    //Cara derechagggg
    glNormal3f(1,0,0);
    glTexCoord2d(0, 0); glVertex3f(size/2,-size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,-size/2,-size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(size/2,size/2,size/2);*/
    //Cara superior
    glNormal3f(0,1,0);
    glTexCoord2d(0, 0); glVertex3f(-size/2,size/2,size/2);
    glTexCoord2d(0, 1); glVertex3f(size/2,size/2,size/2);
    glTexCoord2d(1, 1); glVertex3f(size/2,size/2,-size/2);
    glTexCoord2d(1, 0); glVertex3f(-size/2,size/2,-size/2);
    glEnd();
     }
}
