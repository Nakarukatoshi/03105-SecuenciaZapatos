/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        /**
         * ********************************************
         * ABREVIATURAS * * ttp == _T_ o _T_ a l d e _P_ a t a s * * CNT ==
         * Cantidad * * ********************************************
         */
        //Constantes
        //  Animales
        final String VACA_NAME = "Vaca";
        final String OVEJA_NAME = "Oveja";
        final String BURRO_NAME = "Burro";
        final String GALLINA_NAME = "Gallina";

        //  Patas por animal
        final int VACA_CNT = 3;
        final int OVEJA_CNT = 14;
        final int BURRO_CNT = 2;
        final int GALLINA_CNT = 18;

        //Variables
        //  Patas totales por tipo de animal
        int ttpVaca = VACA_CNT * 4;
        int ttpOveja = OVEJA_CNT * 4;
        int ttpBurro = BURRO_CNT * 4;
        int ttpGallina = GALLINA_CNT * 2;

        //  Suma de patas totales
        int ttp = ttpVaca + ttpOveja + ttpBurro + ttpGallina;

        //  Número de patas totales
        int ttpPares = ttp / 2;

        //Salidas
        //  Cabecera
        System.out.println("Secuencia de Patas");
        System.out.println("==================");

        //  tipo Vaca
        //    Nombre
        System.out.printf("Animal .........: %s%n",
                VACA_NAME);
        //    Cantidad de patas por animal
        System.out.printf("Cantidad .......: %d%n",
                VACA_CNT);
        //    Cantidad de patas por tipo
        System.out.printf("Patas ..........: %d%n",
                ttpVaca);

        //  Separador_1
        System.out.println("---");

        //  tipo Oveja
        //    Nombre
        System.out.printf("Animal .........: %s%n",
                OVEJA_NAME);
        //    Cantidad de patas por animal
        System.out.printf("Cantidad .......: %d%n",
                OVEJA_CNT);
        //    Cantidad de patas por tipo
        System.out.printf("Patas ..........: %d%n",
                ttpOveja);

        //  Separador_2
        System.out.println("---");

        //  tipo Burro
        //    Nombre
        System.out.printf("Animal .........: %s%n",
                BURRO_NAME);
        //    Cantidad de patas por animal
        System.out.printf("Cantidad .......: %d%n",
                BURRO_CNT);
        //    Cantidad de patas por tipo
        System.out.printf("Patas ..........: %d%n",
                ttpBurro);

        //  Separador_3
        System.out.println("---");

        //  tipo Gallina
        //    Nombre
        System.out.printf("Animal .........: %s%n",
                GALLINA_NAME);
        //    Cantidad de patas por animal
        System.out.printf("Cantidad .......: %d%n",
                GALLINA_CNT);
        //    Cantidad de patas por tipo
        System.out.printf("Patas ..........: %d%n",
                ttpGallina);

        //  Separador_4
        System.out.println("---");

        //  Totales
        //    De patas
        System.out.printf("Total de Patas .: %d%n",
                ttp);
        //    De pares
        System.out.printf("Total de Pares .: %d%n",
                ttpPares);
    }
}
