import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import com.tencent.mobileqq.activity.aio.anim.VipPngPlayAnimationDrawable;
import com.tencent.mobileqq.activity.aio.anim.XBubbleAnimation;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class nfj
  extends View
{
  public nfj(XBubbleAnimation paramXBubbleAnimation, Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAnimVipPngPlayAnimationDrawable.a()) || (this.a.b.a())) {
      this.a.jdField_a_of_type_AndroidOsHandler.post(new nfk(this));
    }
    if ((this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAnimVipPngPlayAnimationDrawable.d) && (this.a.b.d)) {
      this.a.jdField_a_of_type_AndroidOsHandler.post(new nfl(this));
    }
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */