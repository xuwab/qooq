package com.tencent.mobileqq.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class PhoneContactFaceDrawable
  extends Drawable
{
  private int jdField_a_of_type_Int;
  private Context jdField_a_of_type_AndroidContentContext;
  private Bitmap jdField_a_of_type_AndroidGraphicsBitmap;
  private Paint jdField_a_of_type_AndroidGraphicsPaint;
  private TextPaint jdField_a_of_type_AndroidTextTextPaint;
  private String jdField_a_of_type_JavaLangString;
  
  public PhoneContactFaceDrawable(Context paramContext, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidTextTextPaint = new TextPaint();
    this.jdField_a_of_type_AndroidGraphicsPaint = new Paint(7);
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_JavaLangString = paramString;
    this.jdField_a_of_type_AndroidGraphicsBitmap = BitmapManager.b(this.jdField_a_of_type_AndroidContentContext.getResources(), 2130839106);
    this.jdField_a_of_type_AndroidTextTextPaint.setAntiAlias(true);
    this.jdField_a_of_type_AndroidTextTextPaint.setColor(-1);
    this.jdField_a_of_type_Int = Math.min(this.jdField_a_of_type_AndroidGraphicsBitmap.getWidth(), this.jdField_a_of_type_AndroidGraphicsBitmap.getHeight());
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    float f1 = localRect.width() / this.jdField_a_of_type_Int;
    float f2 = this.jdField_a_of_type_Int / 2;
    this.jdField_a_of_type_AndroidTextTextPaint.setTextSize(f1 * f2);
    Paint.FontMetrics localFontMetrics = this.jdField_a_of_type_AndroidTextTextPaint.getFontMetrics();
    paramCanvas.drawBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap, 0.0F, 0.0F, this.jdField_a_of_type_AndroidGraphicsPaint);
    if (this.jdField_a_of_type_JavaLangString != null) {
      if (this.jdField_a_of_type_JavaLangString != null) {
        break label172;
      }
    }
    label172:
    for (int i = 0;; i = (int)Layout.getDesiredWidth(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_AndroidTextTextPaint))
    {
      int j = (int)(localFontMetrics.descent - localFontMetrics.ascent);
      j = localRect.left;
      i = (localRect.width() - i) / 2;
      f1 = localRect.top;
      int k = (int)(localRect.height() / 2.0F + f1 - (localFontMetrics.bottom - localFontMetrics.top) / 2.0F - localFontMetrics.top);
      paramCanvas.drawText(this.jdField_a_of_type_JavaLangString, i + j, k, this.jdField_a_of_type_AndroidTextTextPaint);
      return;
    }
  }
  
  public int getIntrinsicHeight()
  {
    return this.jdField_a_of_type_AndroidGraphicsBitmap.getHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.jdField_a_of_type_AndroidGraphicsBitmap.getWidth();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.jdField_a_of_type_AndroidGraphicsPaint.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.jdField_a_of_type_AndroidGraphicsPaint.setColorFilter(paramColorFilter);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\util\PhoneContactFaceDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */