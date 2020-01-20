package stream.serialization;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;
import stream.Trade;

import java.util.Map;

public class TradeSerde implements Serde<Trade> {

    private TradeDeserializer tradeDeserializer = new TradeDeserializer();

    private TradeSerializer tradeSerializer = new TradeSerializer();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public void close() {

    }

    @Override
    public Serializer<Trade> serializer() {
        return tradeSerializer;
    }

    @Override
    public Deserializer<Trade> deserializer() {
        return tradeDeserializer;
    }
}
