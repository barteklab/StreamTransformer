package stream.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import stream.Trade;

import java.util.Map;

public class TradeDeserializer implements Deserializer<Trade> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public Trade deserialize(String s, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        Trade trade = null;

        try {
            trade = mapper.readValue(bytes, Trade.class);

        } catch (Exception e) {
        }
        return trade;
    }

    @Override
    public void close() {

    }
}
