/**
 * resImagen
 */
class resImagen {
    private int foto[][];
    public resImagen(int[][]image){foto = image;}
    public int [][] formatizador(){
        for (int i = 0; i < foto.length-1; i++) {
            for (int j = 0; j < foto.length-1; j++) {
                System.out.print(foto[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 1; i < foto.length-1; i++) {
            for (int j = 1; j < foto.length-1; j++) {
                foto[i][j] =Math.abs((4*foto[i][j] - foto[i+1][j] - foto[i][j+1] - foto[i-1][j] - foto[i][j-1])/8);
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < foto.length-1; i++) {
            for (int j = 0; j < foto.length-1; j++) {
                System.out.print(foto[i][j]+" ");
            }
            System.out.println("");
        }
        return foto;
    }
}

