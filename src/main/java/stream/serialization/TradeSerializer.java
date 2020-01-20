package stream.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import stream.Trade;

import java.util.Map;

public class TradeSerializer implements Serializer<Trade> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String s, Trade trade) {
        byte[] retVal = null;
        try {
            retVal = objectMapper.writeValueAsString(trade).getBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

    @Override
    public void close() {

    }
}
