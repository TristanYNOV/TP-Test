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
}
