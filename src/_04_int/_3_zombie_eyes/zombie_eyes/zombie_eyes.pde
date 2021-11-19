
void setup() {
PImage face = loadImage("zombieEyes.png");
size(500,500);
face.resize(500, 500);
image(face, 0, 0);
}
void draw() {
if(mouseX<=170){
fill(#FA0808);
ellipse(208, 130,110,90);
ellipse(312, 135,90,70);
}
if(mouseX<=340){
fill(#23FA08);
ellipse(208, 130,110,90);
ellipse(312, 135,90,70);
}
if(mouseX<=500){
fill(#0A08FA);
ellipse(208, 130,110,90);
ellipse(312, 135,90,70);
}

}
