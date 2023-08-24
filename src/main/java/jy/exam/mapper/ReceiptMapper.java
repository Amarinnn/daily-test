package jy.exam.mapper;

import jy.exam.entity.ReceiptData;

@org.apache.ibatis.annotations.Mapper
public interface ReceiptMapper {
  void insertReceipt(ReceiptData receiptData);
}