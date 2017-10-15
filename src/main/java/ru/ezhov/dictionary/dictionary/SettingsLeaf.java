/*  1:   */ package ru.ezhov.dictionary.dictionary;
/*  2:   */ 
/*  3:   */ import ru.ezhov.dictionary.forma.DictionaryFrame;
/*  4:   */ import java.io.IOException;
/*  5:   */ import javax.swing.JCheckBox;
/*  6:   */ import javax.swing.JTextField;
/*  7:   */ import ru.ezhov.dictionary.publicClass.MyProperties;
/*  8:   */ import ru.ezhov.dictionary.publicClass.SingletoneBasicFrame;
/*  9:   */ 
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:   */ public class SettingsLeaf
/* 21:   */ {
/* 22:   */   public void setSettings()
/* 23:   */     throws IOException
/* 24:   */   {
/* 25:25 */     DictionaryFrame frame = SingletoneBasicFrame.getDictionaryFrame();
/* 26:   */     
/* 27:27 */     String path = null;
/* 28:28 */     String port = null;
/* 29:29 */     boolean flag = false;
/* 30:30 */     if (MyProperties.getProperties("saveSettings").equals("default")) {
/* 31:31 */       path = MyProperties.getProperties("defailtPathBase");
/* 32:32 */       port = MyProperties.getProperties("defaultPort");
/* 33:33 */       flag = false;
/* 34:34 */     } else if (MyProperties.getProperties("saveSettings").equals("changed")) {
/* 35:35 */       path = MyProperties.getProperties("changePathBase");
/* 36:36 */       port = MyProperties.getProperties("changePort");
/* 37:37 */       flag = true;
/* 38:   */     }
/* 39:   */     
/* 40:40 */     frame.jTextFieldPathToURL.setText(port);
/* 41:41 */     frame.jTextFieldPathToBase.setText(path);
/* 42:42 */     frame.jCheckBoxSettings.setSelected(flag);
/* 43:   */   }
/* 44:   */   
/* 45:   */ 
/* 46:   */ 
/* 47:   */ 
/* 48:   */ 
/* 49:   */ 
/* 50:   */   public void setNewSettings()
/* 51:   */     throws IOException
/* 52:   */   {
/* 53:53 */     DictionaryFrame frame = SingletoneBasicFrame.getDictionaryFrame();
/* 54:   */     
/* 55:   */ 
/* 56:   */ 
/* 57:57 */     if (frame.jCheckBoxSettings.isSelected()) {
/* 58:58 */       MyProperties.setProperties("changePathBase", frame.jTextFieldPathToBase.getText());
/* 59:59 */       MyProperties.setProperties("changePort", frame.jTextFieldPathToURL.getText());
/* 60:60 */       MyProperties.setProperties("saveSettings", "changed");
/* 61:61 */     } else if (!frame.jCheckBoxSettings.isSelected()) {
/* 62:62 */       MyProperties.setProperties("saveSettings", "default");
/* 63:   */     }
/* 64:   */     
/* 65:   */ 
/* 66:66 */     MyProperties.set();
/* 67:67 */     setSettings();
/* 68:   */   }
/* 69:   */ }


/* Location:           E:\dictionary\Dictionary.jar
 * Qualified Name:     dictionary.SettingsLeaf
 * JD-Core Version:    0.7.0.1
 */