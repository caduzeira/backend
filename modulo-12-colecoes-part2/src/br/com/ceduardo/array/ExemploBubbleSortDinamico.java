package br.com.ceduardo.array;

public class ExemploBubbleSortDinamico {
    public static void main(String args[]){
        declaracaoArray();
        tamanhoDoArray();
        percorendoArray();
        percorendoArray2();
        arrayBidimensional();
        novoArrayString();
    }

    private static void novoArrayString() {
        System.out.println("****** Array String ******");
        String[] nome = new String[4];
        nome[0] = "Carlos";
        nome[1] = "Eduardo";
        System.out.println(nome);
    }

    public static void arrayBidimensional() {
        System.out.println("****** Array Bidimensional ******");
        int [][] array1 = {{1,2,3},{4,5,6}};
        int [][] array2 = {{1,2},{3},{4,5,6}};

        System.out.println("Valores no array passados na linha são");
        outputArray(array1);
    }

    private static void outputArray(int[][] array1) {
        //FAZ UM LOOP PELAS LINHAS DO ARRAY
        for(int linha = 0; linha < array1.length; linha++){
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for(int coluna = 0; coluna <array1[linha].length;coluna++){
                System.out.printf("%d ", array1[linha][coluna]);
            }
        }
    }

    private static void percorendoArray2() {
        System.out.println("****** Percorrendo Array 2 ******");
        int[] arrayUm = {87,68,52,5,49,83,45,12,64};
        int total = 0;

        for(int i = 0; i < arrayUm.length;i++){
            System.out.println(arrayUm[i]);
        }
    }

    private static void percorendoArray() {
        System.out.println("****** Percorendo Array ******");
        int[] arrayUm = {85,68,52,5,49,83,45,12,64};
        int total = 0;
        //ADICIONAR O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayUm){
            total += i;
        }
        System.out.println("1 - Total de elementos arrayUm: " + total);
    }

    private static void tamanhoDoArray() {
        System.out.println("****** Tamano do Array ******");
        int[] arrayUm = {13,6,5,6,44,46};
        int[] arrayDois = {43,42,8,55,21,24};

        if(arrayDois.length > 8 ){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!" );
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
    }

    private static void declaracaoArray() {
        System.out.println("****** Declaracao Array ******");
        //[] - são inseridos em uma variavel que referencia um array
        int[] a = new int[10];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,66,66,6};

        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 99;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;

        System.out.println(meuArray[9]);
        System.out.println("");
    }
}
