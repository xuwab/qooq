import com.tencent.mobileqq.activity.QQLSActivity;
import com.tencent.mobileqq.activity.aio.MediaPlayerManager;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.MessageForPtt;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mqq.os.MqqHandler;

public class mdj
  extends MessageObserver
{
  public mdj(QQLSActivity paramQQLSActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(boolean paramBoolean1, List paramList, boolean paramBoolean2)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("MsgRevoke", 4, "onMsgRevokeNotice isSuccess=" + paramBoolean1);
    }
    this.a.a.removeMessages(267387140);
    Object localObject1 = new ArrayList();
    Object localObject2;
    if ((paramList != null) && (paramList.size() > 0))
    {
      localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((List)localObject1).add((ChatMessage)((Iterator)localObject2).next());
      }
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("MsgRevoke", 4, "onMsgRevokeNotice chatlist=" + ((List)localObject1).size());
    }
    if ((paramBoolean1) && (localObject1 != null) && (!((List)localObject1).isEmpty()) && (((ChatMessage)((List)localObject1).get(0) instanceof MessageForPtt)))
    {
      localObject1 = (MessageForPtt)((List)localObject1).get(0);
      localObject2 = MediaPlayerManager.a(QQLSActivity.a(this.a)).a();
      if ((localObject2 == localObject1) || (((localObject2 instanceof MessageForPtt)) && (((ChatMessage)localObject2).frienduin != null) && (((ChatMessage)localObject2).frienduin.equals(((MessageForPtt)localObject1).frienduin)) && (((ChatMessage)localObject2).uniseq == ((MessageForPtt)localObject1).uniseq))) {
        MediaPlayerManager.a(QQLSActivity.a(this.a)).a(true);
      }
    }
    super.a(paramBoolean1, paramList, paramBoolean2);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */