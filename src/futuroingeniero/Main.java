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
        /*cam2=new Camera(70,(float) Display.getWidth()/Display.getHeight(), 0.3f,1000);
        cam2.setX(-9);
        cam2.setY(-2);
        cam2.setZ(2);
        cam2.setRx(33);
        cam2.setRy(180);
        cam2.setRz(0);*/
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
        Texture tCuarto1 = loadTexture("cuarto1");
        Texture tCuarto2 = loadTexture("cuarto2");
        Texture tParedBaño = loadTexture("paredBaño");
        Texture tParedBaño2 = loadTexture("paredFinal");
       Texture tBaño = loadTexture("baño2");

        Texture tParedBañoFuera = loadTexture("paredFuera");
        Texture tCuarto1Fuera = loadTexture("paredFCuartoFuera");
        Texture tVentana = loadTexture("ventana");

        Texture tCocina =loadTexture("paredFCuartoFuera");
        Texture tCama = loadTexture("camalateral");
        Texture tCamaArriba = loadTexture("camaarriba");
        Texture tparedCocina= loadTexture("paredcocina");
        Texture tCocinaInterior =loadTexture("cocinainterior");
        Texture tRestoCasa= loadTexture("pared");
        Texture tSilla = loadTexture("mesaarriba");//SILLAS
        Texture tMesa = loadTexture("cama2");//MESA
        Texture tMesaarriba = loadTexture("mesaarriba");//MESA
        Texture tRefri = loadTexture("cama2");//SILLAS
        //ESTUFA
        Texture tEstufa = loadTexture("estufaFrente");
        Texture tEstufaA = loadTexture("estufaArriba");
        Texture tMuebleCA=loadTexture("muebleCocinaA");
        Texture tMuebleC=loadTexture("muebleCocina");
        Texture tMuebleCentro=loadTexture("muebleCentro");
        Texture tMuebleCocina = loadTexture("cama2");//SILLAS
        Texture tPuerta = loadTexture("cama2");//SILLAS
        Texture tBañera = loadTexture("cama2");//SILLAS
        Texture tLavabo = loadTexture("cama2");//SILLAS
        Texture tSillones = loadTexture("sofa");//SILLAS
        Texture tMuebles = loadTexture("cama2");//SILLAS
        while (!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glShadeModel(GL_SMOOTH);
            glLoadIdentity();
            cam.useView();
            //tRestoCasa.setTextureFilter(5);
            tRestoCasa.bind();
           glBegin(GL_QUADS);
            {
                glTexCoord2f(0,0); glVertex3f(-0.5f, -0.5f, -0.5f);
                glTexCoord2f(10, 0); glVertex3f(-0.5f, -0.5f, 18.5f);
                glTexCoord2f(10, 10); glVertex3f(20.5f, -0.5f, 18.5f);
                glTexCoord2f(0, 10); glVertex3f(20.5f, -0.5f, -0.5f);
           }
            glEnd();
           //pintarSuelo2(tRestoCasa, tCocina);
           //CUARTOS
           pintarCuarto1(cubo, escena, tCuarto1, tCuarto2,tParedBlanca, tVentana, matriz);
           pintarBaño(cubo, escena, tParedBaño,tParedBaño2, tParedBañoFuera,tParedBlanca, tVentana,matriz);
           pintaParedFueraBaño(cubo, escena, tCuarto1, tParedBaño2, tParedBañoFuera, tCuarto2,tCuarto1Fuera, matriz);

           //CASA
           pintarParedCasa2(cubo, escena, tParedBañoFuera,tParedBlanca,tParedBañoFuera, tVentana, matriz);

           //COCINA
           pintarCocina1(cubo, escena, tparedCocina,tParedBlanca, matriz);
           pintarCocina2(cubo,escena,tParedBañoFuera, tparedCocina,tCocinaInterior,tParedBlanca,matriz);
           pintarEstufa(cubo, escena,tEstufa,tEstufaA,matriz);
           pintarMuebleCocina(cubo, escena,tMuebleCA,tMuebleC, matriz);


            //Centro
          pintarSillon(cubo, escena, tSillones,matriz);
          pintarSofaEnmedio(cubo, escena, tSillones,tMuebleCentro,matriz);
           
           
           pintarBaño2(cubo,escena, tBaño,tParedBlanca,tVentana, matriz);
           pintarVentana(cubo,escena,tVentana,tParedBañoFuera,tParedBlanca,matriz);
           
           pintarCama(cubo, escena, tCama,tCamaArriba, matriz);
           pintarParedBlanca(cubo, escena,tParedBlanca,matriz);
           pintarSillas(cubo, escena,tSilla,matriz);
           pintarMesas(cubo, escena,tMesaarriba,matriz);
           pintarRefri(cubo, escena, tRefri,matriz);
           pintarPuerta(cubo, escena,tPuerta,matriz);
           pintarBañera(cubo, escena, tBañera,matriz);
           pintarLavabo(cubo, escena,tLavabo,matriz);
           pintarMuebles(cubo, escena, tMuebles,matriz);
           controles();
           Display.update();
        }
    }
    
       public static void pintarBaño2(Cubo cubo,Escenarios escena, Texture tBaño, Texture tParedBlanca,Texture tVentana, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("B2") ){
                        tBaño.bind();
                        cubo.caraDerechaBaño(1);
                        cubo.caraIzquierdaBaño(1);
                        tParedBlanca.bind();
                        cubo.cuboBaño(1);}
                        if(matriz[x][z].equals("B3") ){
                        tBaño.bind();
                        cubo.caraDerechaBaño(1);
                        cubo.caraIzquierdaBaño(1);
                        tParedBlanca.bind();
                        cubo.cuboBaño(1);
                        tVentana.bind();
                        cubo.dibujarVentana2(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
       public static void pintarCuarto1(Cubo cubo,Escenarios escena, Texture tCuarto1, Texture tCuarto2,Texture tParedBlanca,Texture tVentana, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("C1")){
                        tParedBlanca.bind();
                        cubo.mitadCuarto2(1);
                        tCuarto2.bind();
                        cubo.caraDerecha(1);
                    }
                     if(matriz[x][z].equals("C2")){
                       tParedBlanca.bind();
                        cubo.mitadCuarto3(1);
                        tCuarto2.bind();
                        cubo.mitadCuarto1(1);
                    }
                    if(matriz[x][z].equals("C3")){
                        tParedBlanca.bind();
                        cubo.mitadCuarto2(1);
                        tCuarto1.bind();
                        cubo.caraDerecha(1);
                    }
                     if(matriz[x][z].equals("C4")){
                       tParedBlanca.bind();
                        cubo.mitadCuarto3(1);
                        tCuarto1.bind();
                        cubo.mitadCuarto1(1);
                    }
                    if(matriz[x][z].equals("CV")){
                        tParedBlanca.bind();
                        cubo.mitadCuarto2(1);
                        tCuarto2.bind();
                        cubo.caraDerecha(1);
                        tVentana.bind();
                        cubo.dibujarVentanaCuarto1(1);     
                    }
                     if(matriz[x][z].equals("CB")){
                        tParedBlanca.bind();
                        cubo.mitadCuarto2(1);
                        tCuarto2.bind();
                        cubo.caraDerecha(1);
                        tVentana.bind();
                        cubo.dibujarVentanaCuarto1(1);    
                    }
                    
                     
                    glTranslatef(-x,-0,-z);
                }
            }
    }
       public static void pintarBaño(Cubo cubo,Escenarios escena, Texture tParedBaño, Texture tParedBaño2, Texture tParedBañoFuera, Texture tParedBlanca, Texture tVentana, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("C5")){
                       tParedBaño2.bind();
                        cubo.paredBaño1(1);
                        tParedBaño.bind();
                        cubo.caraLateralDerecha(1);
                        tParedBaño.bind();
                        cubo.caraIzquierda(1);
                    }
                    if(matriz[x][z].equals("C6")){
                        tParedBlanca.bind();
                        cubo.paredBaño2(1);
                        tParedBaño.bind();
                        cubo.caraFrontal(1);
                        tParedBaño.bind();
                        cubo.caraIzquierda(1);
                    }
                        if(matriz[x][z].equals("B4")){
                        tParedBaño2.bind();
                        cubo.paredBaño1(1);
                        tParedBaño.bind();
                        cubo.caraLateralDerecha(1);
                        tParedBaño.bind();
                        cubo.caraIzquierda(1);
                        tVentana.bind();
                        cubo.VentanaBaño3(1);
                    }
                    
                    
                    glTranslatef(-x,-0,-z);
                }
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
       public static void pintaParedFueraBaño(Cubo cubo,Escenarios escena, Texture tParedBaño, Texture tParedFinal, Texture tParedFuera, Texture tCuarto2, Texture tCuarto1Fuera, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("C7")){
                        tParedBaño.bind();
                        cubo.caraDerecha(1);
                        tParedFuera.bind();
                        cubo.caraIzquierda(1);
                        tParedFinal.bind();
                        cubo.paredCuarto2(1);
                    }
                    
                    glTranslatef(-x,-0,-z);
                }
            }
                for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("C8")){
                        tCuarto2.bind();
                        cubo.caraDerecha(1);
                        tCuarto1Fuera.bind();
                        cubo.caraIzquierda(1);
                        tParedFinal.bind();
                        cubo.paredCuarto2(1);
                    }
                    
                    glTranslatef(-x,-0,-z);
                }
            }
            
            
            
    }
       public static void pintarCocina1(Cubo cubo,Escenarios escena, Texture tCama, Texture tCamaArriba, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("C9")){
                        tCama.bind();
                        cubo.caraLateralDerecha(1);
                         tCama.setTextureFilter(5);
                         tCamaArriba.bind();
                         cubo.Cocina1(1);
                    }
                    glTranslatef(-x,-0,-z);
                }
            }
    }
     public static void pintarCocina2(Cubo cubo,Escenarios escena,Texture tParedFuera, Texture tparedCocina, Texture tCocinaInterior, Texture tParedBlanca, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("D2")){
                        tparedCocina.bind();                       
                        cubo.caraFrontal(1);
                        tParedFuera.bind();
                        cubo.caraDerecha(1); 
                        tCocinaInterior.bind();
                        cubo.caraIzquierda(1);
                        cubo.caraLateralDerecha(1);
                        tParedBlanca.bind();
                        cubo.pintarCocina2(1);
                    }
                    glTranslatef(-x,-0,-z);
                }
            }
    }

    public static void pintarVentana(Cubo cubo,Escenarios escena, Texture tVentana, Texture tParedFinal, Texture tParedBlanca,String[][] matriz){
        for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("VE")){
                       // glEnable(GL_BLEND);
                        glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA);
                        glDepthMask(false);
                          glDisable(GL_LIGHTING);
                        tParedBlanca.bind();
                        cubo.caraDerecha(1);
                        tParedFinal.bind();
                        cubo.mitadCuarto1(1);
                        tVentana.bind();
                       cubo.dibujarVentana(1);
                       //glDisable(GL_BLEND);
    glEnable(GL_LIGHTING);
    glDepthMask(true);
                        //cubo.triangulo();
                    }
                    glTranslatef(-x,-0,-z);
                }
            }
    }
       public static void pintarCama(Cubo cubo,Escenarios escena, Texture tCama, Texture tCamaArriba, String[][] matriz){
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
    }
    public static void pintarSillas(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         tParedBlanca.bind();
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("SI") ){
                        cubo.Silla(1);
                    }
                    glTranslatef(-x,0,-z);
                }
    }
    }
        public static void pintarParedCasa2(Cubo cubo,Escenarios escena, Texture tParedFuera, Texture tParedFinal,Texture tParedCocina,Texture tVentana, String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("D1") ){
                        tParedCocina.bind();
                        cubo.caraDerecha(1);
                        tParedFinal.bind();
                        cubo.mitadCuarto1(1);
                    }
                        if(matriz[x][z].equals("DV") ){
                        tParedCocina.bind();
                        cubo.caraDerecha(1);
                        tParedFinal.bind();
                        cubo.mitadCuarto1(1);
                        tVentana.bind();
                        cubo.dibujarVentana4(1);
                        
                        
                    }
                    
                    
                    glTranslatef(-x,0,-z);
                }
    }
    }
        
        
          public static void pintarSuelo2(Texture tRestoCasa, Texture tCocina){
           /*tCocina.bind();
           glBegin(GL_QUADS);
            {
                glTexCoord2f(0,0); glVertex3f(-0.5f, -0.5f, -0.5f);
                glTexCoord2f(10, 0); glVertex3f(-0.5f, -0.5f, 4.5f);
                glTexCoord2f(10, 10); glVertex3f(5.5f, -0.5f, 4.5f);
                glTexCoord2f(0,10); glVertex3f(5.5f, -0.5f, -0.5f);
           }
            glEnd();*/
 
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
    public static void pintarEstufa(Cubo cubo,Escenarios escena, Texture tEstufa,Texture tEstufaA,String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("ES") ){
                        tEstufa.bind();
                        cubo.caraFrontalMitad(1);
                        tEstufaA.bind();
                        cubo.CaraSuperior(1);

                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }
   public static void pintarMuebleCocina(Cubo cubo,Escenarios escena, Texture tMuebleC,Texture tMuebleCA,String[][] matriz){
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("MC") ){
                       tMuebleC.bind();
                        cubo.CaraSuperior(1);
                    tMuebleCA.bind();
                    cubo.caraFrontal2(1);
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
    public static void pintarSofaEnmedio(Cubo cubo,Escenarios escena, Texture tParedBlanca,Texture tMuebleCentro,String[][] matriz){
         
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("SE") ){
                        tParedBlanca.bind();
                        cubo.pintarSofaEnmedio(1);
                        
                    }
                       if(matriz[x][z].equals("CE") ){
                        tMuebleCentro.bind();
                        cubo.pintarSofaEnmedio(1);
                    }

                    glTranslatef(-x,0,-z);
                }
    }
    }

public static void pintarSillon(Cubo cubo,Escenarios escena, Texture tParedBlanca,String[][] matriz){
         
            for(int x=0;x<matriz.length;x++){
                for(int z=0;z<matriz[x].length;z++){
                    glTranslatef(x,0,z);
                    if(matriz[x][z].equals("SO") ){
                        tParedBlanca.bind();
                        cubo.pintarSofa(1);
                        
                    }
                    if(matriz[x][z].equals("S2") ){
                        tParedBlanca.bind();
                        cubo.pintarSofa2(1);
                    }
                       if(matriz[x][z].equals("S3") ){
                        tParedBlanca.bind();
                          cubo.pintarSofa(1);
                        cubo.pintarSofa2(1);
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
                        cubo.Mesa(1);
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
        float velMov=0.006f;
        if(coords){
            System.out.println("coorX=" + cam.getX() );
            System.out.println("coorY=" + cam.getY() );
            System.out.println("coorZ=" + cam.getZ() );
            System.out.println("EcoorX=" + cam.getRx() );
            System.out.println("EcoorY=" + cam.getRy() );
            System.out.println("EcoorZ=" + cam.getRz() );
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
              if (cam.getY()<=0){
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
