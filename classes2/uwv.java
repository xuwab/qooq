import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.structmsg.view.StructMsgItemVideo;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.QQToast;

public class uwv
  implements View.OnClickListener
{
  public uwv(StructMsgItemVideo paramStructMsgItemVideo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    Context localContext = paramView.getContext();
    if (NetworkUtil.a(localContext) == 1)
    {
      StructMsgItemVideo.a(this.a, localContext, paramView);
      if ((localContext instanceof BaseActivity)) {
        ReportController.b(((BaseActivity)localContext).app, "CliOper", "", "", "0X8005BA3", "0X8005BA3", 0, 0, "", "", "", "");
      }
    }
    for (;;)
    {
      ReportController.b(null, "CliOper", "", "", "0X8004B5C", "0X8004B5C", 1, 0, "", "", "", "");
      return;
      if (!NetworkUtil.h(localContext))
      {
        QQToast.a(localContext, 2131367256, 0).a();
      }
      else
      {
        Resources localResources = localContext.getResources();
        DialogUtil.a(localContext, 232, "", "当前是非wifi网络，是否使用移动网络播放视频？", localResources.getString(2131367262), localResources.getString(2131367263), new uww(this, localContext, paramView), new uwx(this)).show();
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\uwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */