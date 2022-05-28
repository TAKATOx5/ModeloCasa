/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuroingeniero;

/*import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.util.glu.GLU.gluPerspective;*/
import static org.lwjgl.util.glu.GLU.*;
import static org.lwjgl.opengl.GL11.*;
/**
 *
 * @author Erick without C
 */
public class Camera {
    
    private float x,y,z,rx,ry,rz;
    
    private float fov, aspect, near,far;
    
    public Camera(float fov, float aspect, float near, float far){
        x=0;
        y=0;
        z=0;
        rx=0;
        rz=0;
        ry=0;
        x=2;
        z=-2;
        ry=90;
        this.fov=fov;
        this.aspect=aspect;
        this.near=near;
        this.far=far;
        initProjection();
    }
    private void initProjection(){
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluPerspective(fov,aspect,near,far);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
    }
    public void useView(){
        glRotatef(rx, 1,0,0);
        glRotatef(ry, 0,1,0);
        glRotatef(rz, 0,0,1);
        glTranslatef(x,y,z);
        
    }
    public void moveX(float amt){
        z+= amt * Math.sin(Math.toRadians(ry));
        x+= amt * Math.cos(Math.toRadians(ry));     
    }
     public void moveY(float amt){
         y+= amt;
    }
      public void moveZ(float amt){
        z+= amt * Math.sin(Math.toRadians(ry+90));
        x+= amt * Math.cos(Math.toRadians(ry+90));
    }
       public void RotationX(float amt){
        rx += amt;
    }
          public void RotationY(float amt){
        ry += amt;
    }
             public void RotationZ(float amt){
        rz += amt;
    }


    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }


    public void setY(float y) {
        this.y = y;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getRx() {
        return rx;
    }

    public void setRx(float rx) {
        this.rx = rx;
    }

    public float getRy() {
        return ry;
    }

    public void setRy(float ry) {
        this.ry = ry;
    }

    public float getRz() {
        return rz;
    }

    public void setRz(float rz) {
        this.rz = rz;
    }
    
    
    
}
