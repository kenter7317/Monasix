package per.kenter7317;

import org.yaml.snakeyaml.Yaml;

public class YamlUpdater {
    Yaml yaml = new Yaml();

    public void update_yaml() {
        yaml.load("test.yaml");
    }
}
