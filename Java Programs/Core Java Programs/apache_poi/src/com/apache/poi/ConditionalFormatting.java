package com.apache.poi;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConditionalFormatting {

 public static void main(String[] args) throws Exception {
  Workbook workbook = new XSSFWorkbook();

  Sheet sheet = workbook.createSheet("new sheet");
  SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

  ConditionalFormattingRule rule = sheetCF.createConditionalFormattingRule("AND(ISNUMBER($C2), $A2>C2)");
  
  
  FontFormatting fontFmt = rule.createFontFormatting();
  fontFmt.setFontStyle(true, false);
  fontFmt.setFontColorIndex(IndexedColors.RED.index);
  
  PatternFormatting fill = rule.createPatternFormatting();
  fill.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
  //fill.setFillPattern(PatternFormatting.SOLID_FOREGROUND);


  ConditionalFormattingRule[] cfRules = new ConditionalFormattingRule[]{rule};

  CellRangeAddress[] regions = new CellRangeAddress[]{CellRangeAddress.valueOf("C2:C2000")};

  sheetCF.addConditionalFormatting(regions, cfRules);

  FileOutputStream out = new FileOutputStream("ConditionalFormatting.xlsx");
  workbook.write(out);
  out.close();
  workbook.close();

 }
}
