import android.widget.ImageView;
import com.tencent.mobileqq.activity.welcomeguide.QQAVFunnyFaceInvest;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

class pns
  implements Runnable
{
  pns(pnl parampnl)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (QQAVFunnyFaceInvest.a(this.a.a)) {
      return;
    }
    this.a.a.a.setImageResource(2130839122);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\pns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */