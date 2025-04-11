import org.example.MeteoManager;
import org.example.WeatherService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MeteoManagerTest {

    @Test
    public void testGetMeteoMessage() {
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getCurrentWeather("Paris")).thenReturn("Pluie");


        MeteoManager manager = new MeteoManager(mockService);
        String result = manager.getMeteoMessage("Paris");

        assertEquals("La météo actuelle à Paris est : Pluie", result);
    }

    @Test
    public void testGetMeteoAvecTemperature() {
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getCurrentWeather("Nice")).thenReturn("Ensoleillé");
        when(mockService.getCurrentTemperature("Nice")).thenReturn(28.5);

        MeteoManager manager = new MeteoManager(mockService);
        String result = manager.getMeteoAvecTemperature("Nice");

        assertEquals("À Nice, il fait 28.5°C avec un temps : Ensoleillé", result);
    }
}
