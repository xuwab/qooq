import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.forward.ForwardBaseOption;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.agent.report.ReportCenter;
import com.tencent.qphone.base.util.QLog;
import cooperation.qqfav.QfavHelper;
import cooperation.qqfav.QfavReport;

public class sla
  implements DialogInterface.OnClickListener
{
  public sla(ForwardBaseOption paramForwardBaseOption)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case -2: 
      do
      {
        return;
        if (this.a.c) {
          ReportCenter.a().a(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount(), "", String.valueOf(this.a.jdField_a_of_type_Long), "1000", "51", "0", false);
        }
        this.a.a(true);
        this.a.jdField_a_of_type_AndroidAppActivity.setResult(1);
        this.a.jdField_a_of_type_AndroidAppActivity.finish();
      } while (!QLog.isColorLevel());
      QLog.i("ForwardOption.ForwardBaseOption", 2, "-->showQfavResultDialog--onClick--back call");
      return;
    }
    if (this.a.c) {
      ReportCenter.a().a(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount(), "", String.valueOf(this.a.jdField_a_of_type_Long), "1000", "52", "0", false);
    }
    if (QLog.isColorLevel()) {
      QLog.i("ForwardOption.ForwardBaseOption", 2, "-->showQfavResultDialog--onClick--send call");
    }
    paramDialogInterface = new Intent();
    paramDialogInterface.setData(Uri.parse(String.format("tencent%1$d://tauth.qq.com/?#action=%2$s&result=complete&response={\"ret\":0}", new Object[] { Long.valueOf(this.a.jdField_a_of_type_Long), "shareToQQ" })));
    paramDialogInterface.setPackage(this.a.jdField_a_of_type_AndroidAppActivity.getIntent().getStringExtra("pkg_name"));
    paramDialogInterface = PendingIntent.getActivity(this.a.jdField_a_of_type_AndroidAppActivity, 0, paramDialogInterface, 268435456);
    Intent localIntent = new Intent();
    localIntent.putExtra("is_share_flag", true);
    if (this.a.jdField_a_of_type_Long > 0L) {
      localIntent.putExtra("activity_finish_run_pendingIntent", paramDialogInterface);
    }
    QfavHelper.a(this.a.jdField_a_of_type_AndroidAppActivity, this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount(), localIntent, -1, true);
    QfavReport.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, 5, 0);
    this.a.jdField_a_of_type_AndroidAppActivity.setResult(1);
    this.a.jdField_a_of_type_AndroidAppActivity.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\sla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */