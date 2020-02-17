package com.huobi.client.model.event;

import com.huobi.client.model.Order;
import com.huobi.client.model.OrderUpdate;

/**
 * The order update received by subscription of order update.
 */
public class OrderUpdateNewEvent {

  private String symbol;
  private long timestamp;
  private OrderUpdate data = null;

  /**
   * Get the symbol you subscribed.
   *
   * @return The symbol, like "btcusdt".
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * Get the UNIX formatted timestamp generated by server in UTC.
   *
   * @return The timestamp.
   */
  public long getTimestamp() {
    return timestamp;
  }

  /**
   * Get the order detail.
   *
   * @return The order data, see {@link Order}
   */
  public OrderUpdate getData() {
    return data;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setData(OrderUpdate data) {
    this.data = data;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "OrderUpdateNewEvent{" +
            "symbol='" + symbol + '\'' +
            ", timestamp=" + timestamp +
            ", data=" + data +
            '}';
  }
}
