package jy.exam.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@EntityScan
public class ReceiptData {

private int id;
  private String blockHash;
  private String blockNumber;
  private String effectiveGasPrice;
  private String from;
  private String gas;
  private String gasPrice;
  private String gasUsed;
  private String senderTxHash;
  private String to;
  private String transactionHash;
  private String value;

}
