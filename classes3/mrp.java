import com.tencent.mobileqq.activity.TroopLowCreditLevelNotifyActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.qphone.base.util.QLog;

public class mrp
  extends TroopObserver
{
  public mrp(TroopLowCreditLevelNotifyActivity paramTroopLowCreditLevelNotifyActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.i("troop.credit.act", 2, "onGetTroopCreditLevelInfo:" + this.a.b + "," + paramBoolean);
    }
    if (!this.a.b.equals(paramLong + "")) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            this.a.d();
          } while (!paramBoolean);
          localObject = (TroopManager)this.a.app.getManager(51);
        } while (localObject == null);
        localObject = ((TroopManager)localObject).a(this.a.b);
      } while (localObject == null);
      paramLong = ((TroopInfo)localObject).troopCreditLevel;
      if (QLog.isColorLevel()) {
        QLog.i("troop.credit.act", 2, "onGetTroopCreditLevelInfo:" + this.a.b + "," + paramLong);
      }
    } while (paramLong == 2L);
    if (paramLong == 1L)
    {
      localObject = DialogUtil.a(this.a.a, 230).setTitle(this.a.getString(2131368978)).setMessage("无法操作，此群已经完全停封");
      ((QQCustomDialog)localObject).setPositiveButton(2131365167, new mrq(this));
      ((QQCustomDialog)localObject).setNegativeButton("", null);
      ((QQCustomDialog)localObject).setCancelable(false);
      ((QQCustomDialog)localObject).show();
      return;
    }
    Object localObject = DialogUtil.a(this.a.a, 230).setTitle(this.a.getString(2131368978)).setMessage("此群临时停封已经解除");
    ((QQCustomDialog)localObject).setPositiveButton(2131365167, new mrr(this));
    ((QQCustomDialog)localObject).setNegativeButton("", null);
    ((QQCustomDialog)localObject).setCancelable(false);
    ((QQCustomDialog)localObject).show();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mrp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */