package futuroingeniero;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;
import org.lwjgl.util.glu.Sphere;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class Main {

    public static Camera  cam,cam2;
    
    
    public static void main(String[] args) {
       initDisplay();
        initGL();
        gameLoop();
        cleanUp();
    }

    public static void initGL() {
        cam=new Camera(70,(float) Display.getWidth()/Display.getHeight(), 0.3f,1000);
        cam2=new Camera(70,(float) Display.getWidth()/Display.getHeight(), 0.3f,1000);
        cam2.setX(-2);
        cam2.setY(2);
        cam2.setZ(-2);
        
        glClearColor(0, 0, 0, 1);
        glEnable(GL_DEPTH_TEST);// Si dibujamos objetos, no se sobreponen, no se mezclan
        glEnable(GL_CULL_FACE);// Optimizacion, dibujar solo lo que está en pantalla
        glEnable(GL_LIGHTING);//Crear luces
        glEnable(GL_LIGHT0);//Posicionar luz
        glEnable(GL_COLOR_MATERIAL);// proporcionar color 
        glEnable(GL_TEXTURE_2D);// agregar texturas
    }

    public static void gameLoop() {
        Cubo cubo = new Cubo();
        Escenarios escena= new Escenarios();
        String[][] matriz=escena.escenarioCasa();
        Texture tPared = loadTexture("pared");
        Texture tParedBlanca = loadTexture("paredFinal");
        Texture tCama = loadTexture("camalateral");
        Texture tCamaArriba = loadTexture("camaarriba");
        Texture tCocina= loadTexture("pisoCocina");
        Texture tRestoCasa= loadTexture("pared");
        Texture tSilla = loadTexture("cama2");//SILLAS
        Texture tMesa = loadTexture("cama2");//MESA
        Texture tMesaarriba = loadTexture("mesaarriba");//MESA
        Texture tRefri = loadTexture("cama2");//SILLAS
        Texture tEstufa = loadTexture("cama2");//SILLAS
        Texture tMuebleCocina = loadTexture("cama2");//SILLAS
        Texture tPuerta = loadTexture("cama2");//SILLAS
        Texture tBañera = loadTexture("cama2");//SILLAS
        Texture tLavabo = loadTexture("cama2");//SILLAS
        Texture tSillones = loadTexture("cama2");//SILLAS
        Texture tMuebles = loadTexture("cama2");//SILLAS
        while (!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glShadeModel(GL_SMOOTH);
            glLoadIdentity();
            cam.useView();
        tCocina.bind();
        glBegin(GL_QUADS);
            {
                glTexCoord2f(0,0); glVertex3f(-0.5f, -0.5f, -0.5f);
                glTexCoord2f(10, 0); glVertex3f(-0.5f, -0.5f, 4.5f);
                glTexCoord2f(10, 10); glVertex3f(5.5f, -0.5f, 4.5f);
                glTexCoord2f(0,10); glVertex3f(5.5f, -0.5f, -0.5f);
           }
            glEnd();
            tRestoCasa.bind();
           glBegin(GL_QUADS);
            {
                glTexCoord2f(0,0); glVertex3f(-0.5f, -0.5f, -0.5f);
                glTexCoord2f(20, 0); glVertex3f(-0.5f, -0.5f, 18.5f);
                glTexCoord2f(20, 20); glVertex3f(20.5f, -0.5f, 18.5f);
                glTexCoord2f(0, 20); glVertex3f(20.5f, -0.5f, -0.5f);
           }
            glEnd();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("CA")){
                        tCama.bind();
                        cubo.medioCubo(1);
                        tCamaArriba.bind();
                        cubo.arribaCubo(1);
                        //cubo.triangulo();
                    }
                    glTranslatef(-x,-0,-z);
                }
            }
           pintarParedBlanca(cubo, escena,tParedBlanca,matriz);
           pintarSillas(cubo, escena,tSilla,matriz);
           pintarMesas(cubo, escena,tMesaarriba,matriz);
           pintarRefri(cubo, escena, tRefri,matriz);
           pintarEstufa(cubo, escena,tEstufa,matriz);
           pintarMuebleCocina(cubo, escena,tMuebleCocina,matriz);
           pintarPuerta(cubo, escena,tPuerta,matriz);
           pintarBañera(cubo, escena, tBañera,matriz);
           pintarLavabo(cubo, escena,tLavabo,matriz);
           pintarSillon(cubo, escena, tSillones,matriz);
           pintarMuebles(cubo, escena, tMuebles,matriz);
           
           
            controles();
            Display.update();
        }
    }
    public static void pintarParedBlanca(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("PB") ){
                        cubo.drawCube(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
        public static void pintarSillas(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("SI") ){
                        cubo.drawCube(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
        public static void pintarMuebles(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("MU") ){
                        cubo.drawCube(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
    public static void pintarRefri(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("RF") ){
                        cubo.drawCube(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
    public static void pintarEstufa(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("ES") ){
                        cubo.drawCube(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
        public static void pintarMuebleCocina(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("MC") ){
                        cubo.drawCube(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
    public static void pintarPuerta(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("PU") ){
                        cubo.drawCube(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
        public static void pintarBañera(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("BA") ){
                        cubo.drawCube(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
    public static void pintarLavabo(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("LA") ){
                        cubo.drawCube(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
    public static void pintarSillon(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("SO") ){
                        cubo.drawCube(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
public static void pintarMesas(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("ME") ){
                        //cubo.arribaCubo(1);
                        cubo.palito(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
            
    
    public boolean permitido(float x, float y, float z){
       if(x>=1){
           if(y==0)
        return   true;
       }
        return false;
    }
    

    public static void controles() {
        Escenarios escena= new Escenarios();
        boolean forward=Keyboard.isKeyDown(Keyboard.KEY_W);
        boolean backward=Keyboard.isKeyDown(Keyboard.KEY_S);
        boolean left=Keyboard.isKeyDown(Keyboard.KEY_A);
        boolean right=Keyboard.isKeyDown(Keyboard.KEY_D);
        boolean subir=Keyboard.isKeyDown(Keyboard.KEY_E);
        boolean bajar=Keyboard.isKeyDown(Keyboard.KEY_Q);
        boolean reset=Keyboard.isKeyDown(Keyboard.KEY_R);
        boolean pos=Keyboard.isKeyDown(Keyboard.KEY_SPACE);
        boolean coords=Keyboard.isKeyDown(Keyboard.KEY_P);
        float mx=Mouse.getDX();
        float my=Mouse.getDY();
        mx*=0.10f;
        my*=0.10f;
        float velMov=0.002f;
        if(coords){
            System.out.println("coorX=" + cam.getX() );
            System.out.println("coorY=" + cam.getY() );
            System.out.println("coorZ=" + cam.getZ() );
        }
         if (forward ) {
            cam.moveZ(velMov);    
         }
          if (backward) {
            cam.moveZ(-velMov);
        }
          if (left) {
               cam.moveX(velMov);  
          }
          if (right) {
            cam.moveX(-velMov);
        }
        if (subir) { if (cam.getY()>=-10){
            cam.moveY(-velMov);
            }   
        }
        if (bajar) {
              if (cam.getY()<=5){
            cam.moveY(velMov);
             }
        }
         if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            for(int aux=0; aux<=1;aux++){
            }
        }
         
         if(Mouse.isButtonDown(0)){
             cam.RotationY(mx);
             cam.RotationX(-my);
         }
         if(Mouse.isButtonDown(1)){
             cam.RotationY(mx);
             cam.RotationY(-my);
         }
        if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
            cleanUp();
        }
        if(reset){
        cam.setX(7);
        cam.setZ(-7);
        cam.setY(-7);
        cam.setRx(0);
        cam.setRz(0);
        cam.setRy(90);
        }
        
    }

    public static void cleanUp() {
        Display.destroy();
        System.exit(0);
    }

    public static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.setTitle("Casa Modelo 3D " + Sys.getVersion());
            Display.create();
        } catch (LWJGLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

    public static Texture loadTexture(String key) {
        try {
            return TextureLoader.getTexture("png", new FileInputStream(
                    new File("res/" + key + ".png")));

        } catch (IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(
                            Level.SEVERE, null, ex);
        }
        return null;
    }

    public static FloatBuffer asFloatBuffer(float[] arreglo) {
        FloatBuffer fb = BufferUtils.createFloatBuffer(arreglo.length);
        fb.put(arreglo);
        fb.flip();
        return fb;
    }

    public static IntBuffer asIntBuffer(int[] arreglo) {
        IntBuffer ib = BufferUtils.createIntBuffer(arreglo.length);
        ib.put(arreglo);
        ib.flip();
        return ib;
    }
}
