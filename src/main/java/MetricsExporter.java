import io.prometheus.client.Counter;
import io.prometheus.client.exporter.HTTPServer;

public class MetricsExporter {
    // Crée un compteur pour compter le nombre  de requêtes
    static final Counter requestCounter = Counter.build()
            .name("requests_total")
            .help("Total number of requests.")
            .register();

    public static void main(String[] args) throws Exception {
        // Lancer un serveur HTTP sur le port 8080
        HTTPServer server = new HTTPServer(8080);

        // Exemple : incrémenter le compteur à chaque seconde
        while (true) {
            requestCounter.inc(); // chaque appel incrémente le compteur
            Thread.sleep(1000); // attendre une seconde
        }
    }
}
