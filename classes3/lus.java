import android.content.SharedPreferences;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.MainFragment;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;

public class lus
  implements Runnable
{
  public lus(MainFragment paramMainFragment, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    String str2 = MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment);
    if (("消息".equals(str2)) || ("联系人".equals(str2))) {
      if (!"消息".equals(str2)) {
        break label197;
      }
    }
    label197:
    for (String str1 = "Msg_tab";; str1 = "Contacts_tab")
    {
      ReportController.b(MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment), "CliOper", "", "", str1, str1, 0, 0, "", "", "", "");
      if ((MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment) != null) && (MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment).getBoolean("theme_voice_setting_" + MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment).a(), true))) {
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment).b(this.jdField_a_of_type_Int + 1);
      }
      if ((str2 != null) && (AppSetting.j))
      {
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment, "消息", str2);
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment, "联系人", str2);
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment, "动态", str2);
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment, "电话", str2);
        MainFragment.a(this.jdField_a_of_type_ComTencentMobileqqActivityMainFragment, "NOW", str2);
      }
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\lus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */