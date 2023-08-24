package jy.exam.controller;

import jy.exam.entity.ReceiptData;
import jy.exam.mapper.ReceiptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private final ReceiptMapper receiptMapper; // final 키워드 추가

  @Autowired
  public MainController(ReceiptMapper receiptMapper) { // 생성자의 메서드 이름을 맞춤
    this.receiptMapper = receiptMapper;
  }

  @GetMapping("/")
  public String main() {
    return "main"; // 메인 페이지 뷰 이름
  }

  @ResponseBody
  @PostMapping("/saveReceipt")
  public String saveReceipt(@RequestBody ReceiptData receiptData) {
    receiptMapper.insertReceipt(receiptData);
    return "Data saved successfully";
  }
}
