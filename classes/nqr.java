import android.content.Context;
import android.os.SystemClock;
import com.rookery.translate.model.TransDiskCache;
import com.rookery.translate.model.TransMemCache;
import com.rookery.translate.model.TranslateCache;
import com.rookery.translate.type.Language;
import com.rookery.translate.type.TranslateCallback;
import com.rookery.translate.type.TranslateError;
import com.tencent.mobileqq.activity.aio.item.TextTranslationItemBuilder;
import com.tencent.mobileqq.activity.aio.item.TextTranslationItemBuilder.Holder;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.qphone.base.util.QLog;

public class nqr
  implements TranslateCallback
{
  public nqr(TextTranslationItemBuilder paramTextTranslationItemBuilder, TextTranslationItemBuilder.Holder paramHolder, Context paramContext, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(long paramLong, String paramString1, Language paramLanguage, String paramString2, TextTranslationItemBuilder.Holder paramHolder)
  {
    TextTranslationItemBuilder.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder);
    if (paramHolder != null) {
      TranslateCache.a(this.jdField_a_of_type_AndroidContentContext).a(this.jdField_a_of_type_JavaLangString, paramHolder.jdField_b_of_type_JavaLangString, paramHolder.jdField_a_of_type_Long, Boolean.valueOf(false));
    }
    String str;
    if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder != null)
    {
      if (QLog.isColorLevel()) {
        QLog.i("Translator", 2, "[ChatAdapter]holder id:" + this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.jdField_a_of_type_Long + "request id:" + paramLong);
      }
      if ((!paramString1.equalsIgnoreCase(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.jdField_a_of_type_JavaLangString)) || (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.jdField_a_of_type_Long != paramLong) || (paramHolder == null) || (paramHolder.jdField_b_of_type_AndroidViewView == null) || (this.jdField_a_of_type_AndroidContentContext == null)) {
        break label481;
      }
      if (!paramLanguage.toString().equalsIgnoreCase(this.jdField_a_of_type_JavaLangString)) {
        break label317;
      }
      TextTranslationItemBuilder.p += 1;
      if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e != 0) {
        break label389;
      }
      str = "0";
      label180:
      StatisticCollector.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_AndroidContentContext).a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), "", "Translate_external", "Translate_external", 0, 1, 0, String.valueOf(SystemClock.uptimeMillis() - paramHolder.jdField_b_of_type_Long), str, paramLanguage.toString(), this.jdField_a_of_type_JavaLangString);
      if ((paramLanguage.toString().equalsIgnoreCase(this.jdField_a_of_type_JavaLangString)) || (paramString2.equalsIgnoreCase(paramString1))) {
        break label434;
      }
      paramLanguage = TranslateCache.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_AndroidContentContext.getApplicationContext());
      if (paramLanguage != null) {
        paramLanguage.a(paramString1, paramString2, paramLong, Boolean.valueOf(true), this.jdField_a_of_type_JavaLangString);
      }
      paramHolder.f = 1;
      this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.a();
    }
    label317:
    label389:
    label434:
    label481:
    do
    {
      return;
      if ((paramLanguage.toString().equalsIgnoreCase("zh-CHS")) && (this.jdField_a_of_type_JavaLangString.equalsIgnoreCase("zh-CN")))
      {
        TextTranslationItemBuilder.p += 1;
        break;
      }
      if ((!paramLanguage.toString().equalsIgnoreCase("zh-CHT")) || (!this.jdField_a_of_type_JavaLangString.equalsIgnoreCase("zh-TW"))) {
        break;
      }
      TextTranslationItemBuilder.p += 1;
      break;
      if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e == 1)
      {
        str = "1";
        break label180;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e == 3000)
      {
        str = "2";
        break label180;
      }
      str = "";
      break label180;
      paramLanguage = TranslateCache.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_AndroidContentContext.getApplicationContext());
      if (paramLanguage != null) {
        paramLanguage.a(paramString1, paramString2, paramLong, Boolean.valueOf(false), this.jdField_a_of_type_JavaLangString);
      }
      this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.a(2131370604);
      return;
      if ((!paramLanguage.toString().equalsIgnoreCase(this.jdField_a_of_type_JavaLangString)) && (this.jdField_a_of_type_AndroidContentContext != null))
      {
        TranslateCache.a(this.jdField_a_of_type_AndroidContentContext).a(paramString1, paramString2, paramLong, Boolean.valueOf(true), this.jdField_a_of_type_JavaLangString);
        return;
      }
    } while (this.jdField_a_of_type_AndroidContentContext == null);
    TranslateCache.a(this.jdField_a_of_type_AndroidContentContext).a(paramString1, paramString2, paramLong, Boolean.valueOf(false), this.jdField_a_of_type_JavaLangString);
  }
  
  public void a(long paramLong, String paramString, TranslateError paramTranslateError, TextTranslationItemBuilder.Holder paramHolder)
  {
    TextTranslationItemBuilder.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder);
    if (paramHolder != null) {
      TranslateCache.a(this.jdField_a_of_type_AndroidContentContext).a(this.jdField_a_of_type_JavaLangString, paramHolder.jdField_b_of_type_JavaLangString, paramHolder.jdField_a_of_type_Long, Boolean.valueOf(false));
    }
    if ((paramHolder != null) && (paramHolder.jdField_b_of_type_AndroidViewView != null) && (paramTranslateError != null)) {
      if ((paramTranslateError.getMessage() != null) && (paramTranslateError.getMessage().length() > 0)) {
        if ((paramTranslateError.getMessage().indexOf("Unable to resolve host") >= 0) || (paramTranslateError.getMessage().indexOf("can't resolve host") >= 0))
        {
          this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.a(2131370605);
          if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e != 0) {
            break label232;
          }
          paramString = "0";
          StatisticCollector.a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_AndroidContentContext).a(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), "", "Translate_external", "Translate_external", 0, 1, 1, "", paramString, "", "");
          if (QLog.isColorLevel()) {
            QLog.e("Translator", 2, "onFailed:" + paramTranslateError);
          }
        }
      }
    }
    label232:
    while (!QLog.isColorLevel()) {
      for (;;)
      {
        return;
        this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.a(2131370603);
        continue;
        this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder.a(2131370606);
        continue;
        if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e == 1) {
          paramString = "1";
        } else if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemTextTranslationItemBuilder$Holder.e == 3000) {
          paramString = "2";
        } else {
          paramString = "";
        }
      }
    }
    QLog.e("Translator", 2, "onFailed:e is null");
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */