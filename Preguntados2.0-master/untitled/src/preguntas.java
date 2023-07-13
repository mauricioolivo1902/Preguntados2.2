import java.util.ArrayList;

public class preguntas {
    private ArrayList<preguntas> pregu = new ArrayList<preguntas>();
    private String preguntas,op1,op2,op3,op4;
    private int correcta;

    public preguntas() {
        pregu.add(new preguntas("¿Cuál es el océano más grande del mundo?","Océano Atlántico","Océano Índico","Océano Pacífico","Océano Ártico",3));
        pregu.add(new preguntas("¿Cuál es la capital de Australia?","Sydney","Melbourne","Canberra","Brisbane",3));
        pregu.add(new preguntas("¿Cuál es el río más largo del mundo?","Nilo","Amazonas","Misisipi","Yangtsé",1));
        pregu.add(new preguntas("¿Cuál es el país con la mayor población del mundo?","Estados Unidos","Rusia","India","China",3));
        pregu.add(new preguntas("¿Cuál es el país más grande en términos de superficie?","Rusia","Canadá","Estados Unidos","China",1));
        pregu.add(new preguntas("¿Cuál es la montaña más alta del mundo?","Monte Everest","Monte Kilimanjaro","Monte Aconcagua","Monte McKinley",1));
        pregu.add(new preguntas("¿Cuál es la ciudad más poblada del mundo?","Tokio","Nueva York","Shanghái","São Paulo",3));
        pregu.add(new preguntas("¿Cuál es el país conocido como \"la tierra de los faraones\"?","Egipto ","México","India","Grecia",1));
        pregu.add(new preguntas("¿Cuál es el símbolo químico del oro?","Ag","Fe","Cu","Au",4));
        pregu.add(new preguntas("¿Cuál es el autor de la novela \"Don Quijote de la Mancha\"?","Gabriel García Márquez","William Shakespeare","Fyodor Dostoyevsky","Miguel de Cervantes Saavedra",4));
        pregu.add(new preguntas("¿Cuál es la capital de Canadá?","Montreal","Toronto","Ottawa","Vancouver",3));
        pregu.add(new preguntas("¿Cuál es la moneda utilizada en Japón?","Yuan","Euro","Dólar","Yen",4));
        pregu.add(new preguntas("¿Cuál es el país que celebra el Oktoberfest?","Alemania","Suiza","Austria","Francia",1));
        pregu.add(new preguntas("¿Cuál es el país de origen del tango?","Brasil","Argentina","España","Italia",2));
        pregu.add(new preguntas("¿Cuál es el planeta más cercano al sol?","Marte","Venus","Mercurio","Júpiter",3));
        pregu.add(new preguntas("¿Cuál es la capital de Sudáfrica?","Johannesburgo","Ciudad del Cabo","Pretoria","Durban",3));
        pregu.add(new preguntas("¿Cuál es el símbolo químico del calcio?","C","Cu","Co","Ca",4));
        pregu.add(new preguntas("¿Cuál es el país que ganó la Copa Mundial de Fútbol 2018?","Brasil","Alemania","Francia","España",3));
        pregu.add(new preguntas("¿Cuál es el animal terrestre más rápido del mundo?","Leopardo","Guepardo","Antílope","León",2));
        pregu.add(new preguntas("¿Cuál es el monumento más famoso de la antigua Grecia?","La Acrópolis","El Partenón","El Coliseo","El Gran Templo de Abu Simbel",2));
    }

    public preguntas(String preguntas, String op1, String op2, String op3, String op4, int correcta) {
        this.preguntas = preguntas;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correcta = correcta;
    }

    public boolean hayPregus(int i){
        if(i== pregu.size()){
            return  false;
        }else {
            return true;
        }
    }
    public String getPreguntas() {
        return preguntas;
    }
    public String quePregunta(int i){
        return pregu.get(i-1).getPreguntas();
    }
    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public int getCorrecta() {
        return correcta;
    }
    public int opCorr(int i) {
        return pregu.get(i-1).getCorrecta();
    }
    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    public String getOp1() {
        return op1;
    }
    public String Op1(int i) {
        return pregu.get(i-1).getOp1();
    }
    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }
    public String Op2(int i) {
        return pregu.get(i-1).getOp2();
    }
    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }
    public String Op3(int i) {
        return pregu.get(i-1).getOp3();
    }
    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }
    public String Op4(int i) {
        return pregu.get(i-1).getOp4();
    }
    public void setOp4(String op4) {
        this.op4 = op4;
    }
}
