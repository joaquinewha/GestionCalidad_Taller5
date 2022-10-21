package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AscensorTest {
        @Rule
        public ExpectedException exception = ExpectedException.none();
    
    
        @Test
        public void siPersonaOrigenoMayor3() throws Exception{
            Ascensor c = new Ascensor();
            exception.expect(Exception.class);
            c.NuevaPersona(5, 2);
        }
        @Test
        public void siPersonaDestinoMayor3() throws Exception{
            Ascensor c = new Ascensor();
            exception.expect(Exception.class);
            c.NuevaPersona(2, 5);
        }

        @Test
        public void siPersonaOrigenoMenor1() throws Exception{
            Ascensor c = new Ascensor();
            exception.expect(Exception.class);
            c.NuevaPersona(0, 2);
        }
        @Test
        public void siPersonaDestinoMenor1() throws Exception{
            Ascensor c = new Ascensor();
            exception.expect(Exception.class);
            c.NuevaPersona(2, 0);
        }
        @Test
        public void siPersonaDestinoIgualOrigen() throws Exception{
            Ascensor c = new Ascensor();
            exception.expect(Exception.class);
            c.NuevaPersona(2, 2);
        }

        @Test
        public void LlamadaAscensor() throws Exception{
            Ascensor c = new Ascensor();
            assertEquals(true,c.LlamadaAscensor(2, 2));
            assertEquals(false,c.LlamadaAscensor(2, 1));
            
        }
        @Test
        public void UsoAscensor() throws Exception{
            Ascensor c = new Ascensor();
            assertEquals(3,c.UsoAscensor(3, 1));
            assertEquals(1,c.UsoAscensor(1, 2));
            
        }      
}
