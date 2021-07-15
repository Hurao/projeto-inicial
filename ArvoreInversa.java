public class ArvoreInversa {

    private String toStringRecursivo(NoBinario atual){

if (atual == null){
    return "";
}else {
    String s = " [" + toStringRecursivo(atual.getDireita());
           s += "] " + atual.getInfo();
           s += " [" + toStringRecursivo(atual.getEsquerda());
           
    return s+ "]"
}
}

}
