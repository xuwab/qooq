import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.biz.pubaccount.AccountDetailActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class hlt
  implements DialogInterface.OnDismissListener
{
  public hlt(AccountDetailActivity paramAccountDetailActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.t = false;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hlt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */